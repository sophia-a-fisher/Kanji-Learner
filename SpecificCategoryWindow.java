
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SpecificCategoryWindow implements ActionListener
{
	JDialog mainDialog;
	JLabel titleLabel;
	JPanel categoryPanel;
	
	JButton Level1Button;
	JButton Level2Button;
	JButton Level3Button;
	JButton Level4Button;
	JButton Level5Button;
	JButton Level6Button;
	JButton Level7Button;
	JButton Level8Button;
	JButton potluckButton;
	
	Color green;
	Color darkGreen;
	Color darkDarkGreen;
	Color black;
	Color chosenColor;
	
	int categoryChoice;
	boolean myOption;
	KanjiQuizWindow myQuiz;
	
	SpecificCategoryWindow(int _categoryChoice, boolean _myOption)
	{
		categoryChoice = _categoryChoice;
		myOption = _myOption;
		generateScreen(_categoryChoice);
	}
	
	void generateScreen(int categoryChoice)
	{
		mainDialog = new JDialog();
		JPanel panel = (JPanel)mainDialog.getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

		mainDialog.setTitle("Kanji Learner");
		mainDialog.setSize(640,480);
		mainDialog.setLayout(new BorderLayout(0,20));
		mainDialog.setLocationRelativeTo(null);
		mainDialog.setModal(true);
		
		categoryPanel = new JPanel();
		categoryPanel.setLayout(new GridLayout(2,4,20,20));
		
		Level1Button = new JButton("Level 1");
		Level2Button = new JButton("Level 2");
		Level3Button = new JButton("Level 3");
		Level4Button = new JButton("Level 4");
		Level5Button = new JButton("Level 5");
		Level6Button = new JButton("Level 6");
		Level7Button = new JButton("Level 7");
		Level8Button = new JButton("Level 8");
		
		black = new Color(0,0,0);
		Level1Button.setBorder(BorderFactory.createLineBorder(black,3));
		Level2Button.setBorder(BorderFactory.createLineBorder(black,3));
		Level3Button.setBorder(BorderFactory.createLineBorder(black,3));
		Level4Button.setBorder(BorderFactory.createLineBorder(black,3));
		Level5Button.setBorder(BorderFactory.createLineBorder(black,3));
		Level6Button.setBorder(BorderFactory.createLineBorder(black,3));
		Level7Button.setBorder(BorderFactory.createLineBorder(black,3));
		Level8Button.setBorder(BorderFactory.createLineBorder(black,3));
		
		titleLabel = new JLabel();
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		if(categoryChoice == 1)
		{
			green = new Color(200,255,200);
			
			titleLabel.setText("Basic Kanji");
			titleLabel.setFont(new Font(titleLabel.getName(), Font.BOLD, 36));
			
			Level1Button.setBackground(green);
			Level2Button.setBackground(green);
			Level3Button.setBackground(green);
			Level4Button.setBackground(green);
			Level5Button.setBackground(green);

			categoryPanel.add(Level1Button);
			categoryPanel.add(Level2Button);
			categoryPanel.add(Level3Button);
			categoryPanel.add(Level4Button);
			categoryPanel.add(Level5Button);
		}
		
		else if(categoryChoice == 2)
		{
			darkGreen = new Color(100,255,100);
			
			titleLabel.setText("Intermediate Kanji");
			titleLabel.setFont(new Font(titleLabel.getName(), Font.BOLD, 36));
			
			Level1Button.setBackground(darkGreen);
			Level2Button.setBackground(darkGreen);
			Level3Button.setBackground(darkGreen);
			Level4Button.setBackground(darkGreen);
			Level5Button.setBackground(darkGreen);
	
			categoryPanel.add(Level1Button);
			categoryPanel.add(Level2Button);
			categoryPanel.add(Level3Button);
			categoryPanel.add(Level4Button);
			categoryPanel.add(Level5Button);
		}
		
		else if(categoryChoice == 3)
		{
			darkDarkGreen = new Color(0,220,0);
			
			titleLabel.setText("Hard Kanji");
			titleLabel.setFont(new Font(titleLabel.getName(), Font.BOLD, 36));
			
			Level1Button.setBackground(darkDarkGreen);
			Level2Button.setBackground(darkDarkGreen);
			Level3Button.setBackground(darkDarkGreen);
			Level4Button.setBackground(darkDarkGreen);
			Level5Button.setBackground(darkDarkGreen);
	
			categoryPanel.add(Level1Button);
			categoryPanel.add(Level2Button);
			categoryPanel.add(Level3Button);
			categoryPanel.add(Level4Button);
			categoryPanel.add(Level5Button);
		}
		
		Level1Button.addActionListener(this);
		Level2Button.addActionListener(this);
		Level3Button.addActionListener(this);
		Level4Button.addActionListener(this);
		Level5Button.addActionListener(this);
		Level6Button.addActionListener(this);
		Level7Button.addActionListener(this);
		Level8Button.addActionListener(this);
		
		potluckButton = new JButton("Potluck Mini-Quiz");
		potluckButton.setBackground(new Color(220,220,220));
		potluckButton.setBorder(BorderFactory.createLineBorder(black,3));
		potluckButton.addActionListener(this);
		
		mainDialog.add(titleLabel, BorderLayout.NORTH);
		mainDialog.add(categoryPanel, BorderLayout.CENTER);
		mainDialog.add(potluckButton, BorderLayout.SOUTH);
		
		mainDialog.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (categoryChoice == 1)
		{
			if (e.getSource() == Level1Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 1, myOption);
			}
			
			if (e.getSource() == Level2Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 2, myOption);
			}
			
			if (e.getSource() == Level3Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 3, myOption);
			}
			
			if (e.getSource() == Level4Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 4, myOption);
			}
			
			if (e.getSource() == Level5Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 5, myOption);
			}
			
			if(e.getSource() == potluckButton)
			{
				myQuiz = new KanjiQuizWindow(true, categoryChoice, 0, myOption);
			}
		}
		
		else if (categoryChoice == 2)
		{
			if (e.getSource() == Level1Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 6, myOption);
			}
			
			if (e.getSource() == Level2Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 7, myOption);
			}
			
			if (e.getSource() == Level3Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 8, myOption);
			}
			
			if (e.getSource() == Level4Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 9, myOption);
			}
			
			if (e.getSource() == Level5Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 10, myOption);
			}
			
			if(e.getSource() == potluckButton)
			{
				myQuiz = new KanjiQuizWindow(true, categoryChoice, 0, myOption);
			}
		}
		
		else if (categoryChoice == 3)
		{
			if (e.getSource() == Level1Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 11, myOption);
			}
			
			if (e.getSource() == Level2Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 12, myOption);
			}
			
			if (e.getSource() == Level3Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 13, myOption);
			}
			
			if (e.getSource() == Level4Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 14, myOption);
			}
			
			if (e.getSource() == Level5Button)
			{
				myQuiz = new KanjiQuizWindow(false, categoryChoice, 15, myOption);
			}
			
		}
		
		/*else if (potluckButton == e.getSource())
		{
			myQuiz = new KanjiQuizWindow(1, myOption);
		}*/
		
	}

}
