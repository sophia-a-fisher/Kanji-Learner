
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.image.BufferedImage;

public class KanjiQuizWindow implements ActionListener
{
	JDialog mainDialog;
	JPanel questionPanel;
	JPanel answerPanel;
	JLabel questionLabel;
	JLabel completionLabel;
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;

	ImageIcon Blank;
	
	boolean hasBeenWrong;
	boolean isEnglish;
	boolean clickingEnabled;
	
	KanjiQuiz myQuiz;
	ArrayList<KanjiCharacter> currentSet;
	
	KanjiQuizWindow(boolean potluck, int mainCategory, int categoryNumber, boolean _isEnglish)
	{
		Blank = new ImageIcon("bin\\blank.png");
		hasBeenWrong = false;
		clickingEnabled = true;
		isEnglish = _isEnglish;
		
		
		if(!potluck)
		{
			myQuiz = new KanjiQuiz(false, categoryNumber, mainCategory);
		}
		
		else
		{
			//fix the below int
			if (mainCategory == 1)
			{
				myQuiz = new KanjiQuiz(potluck, 0, 1);
			}
			
			else if (mainCategory == 2)
			{
				myQuiz = new KanjiQuiz(potluck, 0, 2);
			}
			
			else if (mainCategory == 3)
			{
				myQuiz = new KanjiQuiz(potluck, 0, 3);
			}
		
		}
		
		completionLabel = new JLabel(myQuiz.getPercentageDone() + " % completed");
		currentSet = myQuiz.getNextSet();
		createMainWindow();
		setLabel();
		createQuestionPanel();
		initializeButtons();
		createAnswerPanel();
		addPanelsToWindow();
		addButtonListener();
		
		mainDialog.setVisible(true);
	}
	
	void createMainWindow()
	{
		mainDialog = new JDialog();
		mainDialog.setSize(800,600);
		mainDialog.setTitle("Kanji Learner Test");
		mainDialog.setModal(true);
		mainDialog.setLocationRelativeTo(null);
		mainDialog.setLayout(new BorderLayout());
	}
	
	void createQuestionPanel()
	{
		questionPanel = new JPanel();
		questionPanel.setLayout(new BorderLayout());
		questionPanel.add(questionLabel, BorderLayout.CENTER);
		questionPanel.add(completionLabel, BorderLayout.EAST);
	}
	
	void updatePercentageDone()
	{
		completionLabel.setText(myQuiz.getPercentageDone() + " % completed");
	}
	
	void initializeButtons()
	{
		button1 = new JButton(currentSet.get(0).image);
		button2 = new JButton(currentSet.get(1).image);
		button3 = new JButton(currentSet.get(2).image);
		button4 = new JButton(currentSet.get(3).image);
	}

	void changeButtons()
	{
		button1.setIcon(currentSet.get(0).image);
		button2.setIcon(currentSet.get(1).image);
		button3.setIcon(currentSet.get(2).image);
		button4.setIcon(currentSet.get(3).image);
	}
	void createAnswerPanel()
	{
		answerPanel = new JPanel();
		answerPanel.setLayout(new GridLayout(2,2));
		answerPanel.add(button1);
		answerPanel.add(button2);
		answerPanel.add(button3);
		answerPanel.add(button4);
	}
	
	void addPanelsToWindow()
	{
		mainDialog.add(questionPanel, BorderLayout.NORTH);
		mainDialog.add(answerPanel, BorderLayout.CENTER);
	}
	
	void setLabel()
	{
		if (isEnglish)
		{
			questionLabel = new JLabel(currentSet.get(getCorrectIndex()).englishDefinition);
		}
		
		else 
		{
			questionLabel = new JLabel(currentSet.get(getCorrectIndex()).romaji);
		}
		
		questionLabel.setFont(new Font(questionLabel.getName(), Font.BOLD, 36));
	}
	
	void changeLabel()
	{
		if (isEnglish)
		{
			questionLabel.setText(currentSet.get(getCorrectIndex()).englishDefinition);
		}
		
		else
		{
			questionLabel.setText(currentSet.get(getCorrectIndex()).romaji);
		}
		
		/*else
		{
			questionLabel = new JLabel("something is wrong");
		}*/
	}
	
	int getCorrectIndex()
	{
		
		int result = -1;
		for(int i = 0; i < currentSet.size();i++)
		{
		//	System.out.println(currentSet.get(i).romaji);
			if(currentSet.get(i).isAnswer)
			{
				myQuiz.incrementCorrectQuestionAmount();
				return i;
			}
		}
		
		return result;
	}
	
	void addButtonListener()
	{
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
	
	public ImageIcon changeColor(ImageIcon II, Color avoidColor, Color newColor) 
	{
		BufferedImage buffered = toBufferedImage(II.getImage());
		final int avoidRGB = avoidColor.getRGB();
	    final int newRGB = newColor.getRGB();
	    for (int x = 0; x < buffered.getWidth(); x++) 
	    {
	        for (int y = 0; y < buffered.getHeight(); y++) 
	        {
	            if (buffered.getRGB(x, y) != avoidRGB)
	            {
	            	buffered.setRGB(x, y, newRGB);
	            }
	        }
	    }
	    
	    II = new ImageIcon(buffered);
	    return II;
	    
	}
	
	public static BufferedImage toBufferedImage(Image img)
	{
	    if (img instanceof BufferedImage)
	    {
	        return (BufferedImage) img;
	    }

	    // Create a buffered image with transparency
	    BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

	    // Draw the image on to the buffered image
	    Graphics2D bGr = bimage.createGraphics();
	    bGr.drawImage(img, 0, 0, null);
	    bGr.dispose();

	    // Return the buffered image
	    return bimage;
	}
	
	void updateButtons()
	{
		changeButtons();
		changeLabel();
	}
	
	void updateButtonsAfterDelay(int millisec)
	{
		new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		                updateButtons();
		                clickingEnabled = true;
		            }
		        }, 
		        millisec 
		);
	}
	
	void handleButtonClick(JButton button, int number)
	{
		if (currentSet.get(number).isAnswer)
		{
			
			button.setIcon(changeColor(currentSet.get(number).image, Color.white, Color.green));
			clickingEnabled  = false;
			updateButtonsAfterDelay(1000);

			currentSet.get(number).correctCount++;
			if (!hasBeenWrong)
			{
				myQuiz.incrementCurrentItem();
				if (myQuiz.quizComplete)
				{
					this.mainDialog.dispose();
					System.out.println("you finishied");
				}
			}
			
			//printPercentageDone();
			updatePercentageDone();
			System.out.println(myQuiz.getPercentageDone());
			currentSet = myQuiz.getNextSet();
			
			hasBeenWrong = false;
		}
		else 
		{
			hasBeenWrong = true;
			//button.setIcon(RedX);
			button.setIcon(changeColor(currentSet.get(number).image, Color.white, Color.red));
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (clickingEnabled)
		{
			if (e.getSource() == button1)
			{
				handleButtonClick(button1, 0);
			}
			
			if (e.getSource() == button2)
			{
				handleButtonClick(button2, 1);
			}
			
			if (e.getSource() == button3)
			{
				handleButtonClick(button3, 2);
			}
			
			if (e.getSource() == button4)
			{
				handleButtonClick(button4, 3);
			}
		}
	}
	
	
	
}
