
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KanjiLearner implements ActionListener
{
	JFrame mainFrame;
	JLabel titleLabel;
	
	JButton category1Button;
	JButton category2Button;
	JButton category3Button;
	JButton category4Button;
	JButton category5Button;
	JButton category6Button;
	JButton optionsButton;
	JButton potluckButton;
	
	Color green;
	Color darkGreen;
	Color darkDarkGreen;
	Color black;
	Color pink;
	Color red;
	Color tan;
	
	JPanel categoryPanel;
	JPanel titlePanel;
	
	SpecificCategoryWindow mySpecificCategoryWindow;
	
	Options myOption;
	boolean isEnglish;
	
	KanjiLearner()
	{
	green = new Color(200,255,200);	
	darkGreen = new Color(100,255,100);
	darkDarkGreen = new Color(0,220,0);
	black = new Color(0,0,0);
	pink = new Color(255,127,156);
	red = new Color(255,100,100);
	tan = new Color(200,50,100);
	myOption = new Options();
	
	isEnglish = myOption.isEnglish;
	
	createWindow();
	createTitlePanel();
	createCategoryPanel();
	createCategoryButtons();
	addPanelsToFrame();
	}
	
	void createWindow()
	{
		mainFrame = new JFrame();
		mainFrame.setTitle("Kanji Learner");
		mainFrame.setSize(640,480);
		mainFrame.setLayout(new BorderLayout(20,20));
		mainFrame.setLocationRelativeTo(null);
		JPanel panel = (JPanel)mainFrame.getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
	}
	
	void createTitlePanel()
	{
		titlePanel = new JPanel();
		titlePanel.setLayout(new GridLayout(2,1,10,20));
		titlePanel.setSize(640,200);
		
		titleLabel = new JLabel("Kanji Learner");
		titleLabel.setFont(new Font(titleLabel.getName(), Font.BOLD, 36));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		optionsButton = new JButton("Options");
		optionsButton.setBackground(new Color(200,200,200));
		optionsButton.addActionListener(this);
		
		titlePanel.add(titleLabel);
		titlePanel.add(optionsButton);
	}
	
	void createCategoryPanel()
	{
		categoryPanel = new JPanel();
		categoryPanel.setLayout(new GridLayout(2,5));
	}
	
	void createCategoryButtons()
	{
		category1Button = new JButton("Basic Kanji");
		category2Button = new JButton("Intermediate Kanji");
		category3Button = new JButton("Hard Kanji");
		category4Button = new JButton("Body Part Kanji");
		category5Button = new JButton("Food Kanji");
		category6Button = new JButton("Animal Kanji");
		
		category1Button.setBackground(green);
		category2Button.setBackground(darkGreen);
		category3Button.setBackground(darkDarkGreen);
		category4Button.setBackground(pink);
		category5Button.setBackground(red);
		category6Button.setBackground(tan);
		
		category1Button.addActionListener(this);
		category2Button.addActionListener(this);
		category3Button.addActionListener(this);
		category4Button.addActionListener(this);
		category5Button.addActionListener(this);
		category6Button.addActionListener(this);
		
		categoryPanel.add(category1Button);
		categoryPanel.add(category2Button);
		categoryPanel.add(category3Button);
		categoryPanel.add(category4Button);
		categoryPanel.add(category5Button);
		categoryPanel.add(category6Button);
	}
	
	void addPanelsToFrame()
	{
		mainFrame.add(titlePanel, BorderLayout.NORTH);
		mainFrame.add(categoryPanel, BorderLayout.CENTER);
		
		potluckButton = new JButton("Potluck Quiz");
		potluckButton.setBackground(new Color(220,220,220));
		potluckButton.setSize(640,200);
		potluckButton.addActionListener(this);
		mainFrame.add(potluckButton, BorderLayout.SOUTH);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		if (e.getSource() == optionsButton)
		{
			myOption.createTheWindow();
			isEnglish = myOption.isEnglish;
		}
		
		if (e.getSource() == potluckButton)
		{
			System.out.println("I amm hungry");
			
		}
		
		if (e.getSource() == category1Button)
		{
			mySpecificCategoryWindow = new SpecificCategoryWindow(1, isEnglish);
		}
		
		if (e.getSource() == category2Button)
		{
			mySpecificCategoryWindow = new SpecificCategoryWindow(2, isEnglish);
		}
		
		if (e.getSource() == category3Button)
		{
			mySpecificCategoryWindow = new SpecificCategoryWindow(3, isEnglish);
		}
		
	}

}
