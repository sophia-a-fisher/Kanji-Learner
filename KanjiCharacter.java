
import javax.swing.ImageIcon;

public class KanjiCharacter 
{
	ImageIcon image;
	String romaji;
	String englishDefinition;
	boolean isAnswer;
	int correctCount;
	
	KanjiCharacter(ImageIcon _image, String _romaji, String _englishDefinition)
	{
		image = _image;
		romaji = _romaji;
		englishDefinition = _englishDefinition;
		isAnswer = false;
		correctCount = 0;
	}
	
}
