
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options implements ActionListener
{
	JDialog optionDialog;
	JPanel questionPanel;
	JPanel optionPanel;
	JLabel questionLabel;
	JButton romajiButton;
	JButton englishButton;
	String option;
	boolean isEnglish;
	
	Options()
	{
		isEnglish = true;	
	}
	
	void createTheWindow()
	{
		optionDialog = new JDialog();
		optionDialog.setTitle("Kanji Learner Options");
		optionDialog.setSize(640,480);
		optionDialog.setLocationRelativeTo(null);
		optionDialog.setLayout(new BorderLayout());
		JPanel panel = (JPanel)optionDialog.getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		questionPanel = new JPanel();
		questionLabel = new JLabel("What would you like to quiz yourself on?");
		questionPanel.add(questionLabel);
		optionDialog.add(questionPanel, BorderLayout.NORTH);
		
		optionPanel = new JPanel();
		englishButton = new JButton("English");
		romajiButton = new JButton("Romaji");
		englishButton.setBackground(new Color(220,220,255));
		romajiButton.setBackground(new Color(255,220,245));
		optionPanel.setLayout(new GridLayout(1,2));
		optionPanel.add(englishButton);
		optionPanel.add(romajiButton);
		optionDialog.add(optionPanel, BorderLayout.CENTER);
		
		englishButton.addActionListener(this);
		romajiButton.addActionListener(this);
		
		optionDialog.setModal(true);
		//optionDialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		optionDialog.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == englishButton)
		{
			isEnglish = true;
			System.out.println(isEnglish);
			optionDialog.dispose();
		}
		
		if (e.getSource() == romajiButton)
		{
			isEnglish = false;
			System.out.println(isEnglish);
			optionDialog.dispose();
		}
		
	}

}
