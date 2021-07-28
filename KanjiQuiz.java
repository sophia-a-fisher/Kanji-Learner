
import java.util.*;
import javax.swing.ImageIcon;
import java.util.Random;

public class KanjiQuiz 
{
	//List<KanjiCharacter> temporaryList;
	List<KanjiCharacter> kanjiList;
	int categoryNumber;
	int currentItemIndex;
	int prefferedListSize;
	int questionAmount;
	int correctQuestionAmount;
	double percentageDone;
	int timesToGetCorrect;
	boolean quizComplete;
	
	KanjiQuiz(boolean potluck, int _categoryNumber, int mainCategory)
	{
		timesToGetCorrect = 4;
		prefferedListSize = 20;
		percentageDone = 0;
		correctQuestionAmount = 0;
		currentItemIndex = 0;
		quizComplete = false;
		kanjiList = new ArrayList<KanjiCharacter>();
		questionAmount = (prefferedListSize * timesToGetCorrect) - 4;
		
		if (!potluck)
		{
			categoryNumber = _categoryNumber;
			loadQuiz();
		}
		
		else 
		{
			if (mainCategory == 1)
			{
				loadQuiz1();
				loadQuiz2();
				loadQuiz3();
				loadQuiz4();
				loadQuiz5();
			}
			
			if (mainCategory == 2)
			{
				loadQuiz6();
				loadQuiz7();
				loadQuiz8();
				loadQuiz9();
				loadQuiz10();
			}
			
			if (mainCategory == 3)
			{
				loadQuiz11();
				loadQuiz12();
				loadQuiz13();
				loadQuiz14();
				loadQuiz15();
			}
			
			eliminateElements();
		}
		
		scramble(kanjiList);
		printScoreBar();
		
	}
	
	/*KanjiQuiz(boolean potluck, int category)
	{
		kanjiList = new ArrayList<KanjiCharacter>();
		quizComplete = false;
		//categoryNumber = _categoryNumber;
		currentItemIndex = 0;

		//loadQuiz();
		if (category == 1)
		{
			loadQuiz1();
			loadQuiz2();
			loadQuiz3();
			loadQuiz4();
			loadQuiz5();
		}
		
		if (category == 2)
		{
			loadQuiz6();
			loadQuiz7();
			loadQuiz8();
			loadQuiz9();
			loadQuiz10();
		}
		
		eliminateElements();
		scramble(kanjiList);
		System.out.println(kanjiList.size());
	}*/
	
	void loadQuiz()
	{
		switch (categoryNumber)
		{
		case 1: 
			
			loadQuiz1();
			break;  
			
		case 2:
			
			loadQuiz2();
			break;
			
		case 3:
			
			loadQuiz3();
			break;
			
		case 4:
			
			loadQuiz4();
			break;
			
		case 5:
			
			loadQuiz5();
			break;
			
		case 6:
			
			loadQuiz6();
			break;
		case 7:
			
			loadQuiz7();
			break;
			
		case 8:
			
			loadQuiz8();
			break;
			
		case 9:
			
			loadQuiz9();
			break;
			
		case 10:
			
			loadQuiz10();
			break;
			
		default:
			
			break;
		}
	}
	
	void loadQuiz1()
	{
		//System.out.println("it happened");
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.01.png"), "ichi/hito", "one"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.02.png"), "ni/futa/hatsu", "two"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.03.png"), "san/mi", "three"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.04.png"), "yon/shi/yo", "four"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.05.png"), "go/itsu", "five"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.06.png"), "roku/mu", "six"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.07.png"), "nana/shichi/nano", "seven"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.08.png"), "hachi/ya/yo", "eight"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.09.png"), "kyuu/kokono/ku", "nine"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.10.png"), "jyuu/to", "ten"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.11.png"), "hito/jin/nin", "person"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.12.png"), "hai/nyuu", "enter/insert"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.13.png"), "chikara/riki/ryoku", "power/strength"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.14.png"), "shita/ge/ka", "below/low"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.15.png"), "sen/chi", "thousand"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.16.png"), "ue/jo/kami", "above/top"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.17.png"), "kuchi/ko", "mouth"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.18.png"), "tsuchi/do/to", "soil/earth"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.01.png"), "onna/jo/nyo", "female"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.02.png"), "ko/shi/su", "child"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.04.png"), "yama/san", "mountain"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.19.png"), "yuu", "evening"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji1\\BeginningKanji1.20.png"), "oo/dai", "large"));
		
	}
	
	void loadQuiz2()
	{
		//System.out.println("it happened");

		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.03.png"), "chii/shou", "small"));

		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.05.png"), "kawa/sen", "river"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.06.png"), "ten", "heaven/sky"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.07.png"), "naka/chu", "inside/middle"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.08.png"), "en", "yen/circle"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.09.png"), "te/shu", "hand"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.10.png"), "fumi/mon/bun", "literature/writing"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.11.png"), "nichi/hi/ka", "sun/day"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.12.png"), "tsuki/getsu", "moon/month"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.13.png"), "ki/moku", "tree"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.14.png"), "mizu/sui", "water"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.15.png"), "hi/ka/ho", "fire"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.16.png"), "inu/ken", "dog"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.17.png"), "ou", "king"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.18.png"), "shou/tada", "correct"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.19.png"), "de/shu", "exit"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji2\\BeginningKanji2.20.png"), "hon/moto", "book"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.01.png"), "migi/yu/u", "right"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.02.png"), "hidari/sa", "left"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.03.png"), "tama/gyoku", "gem/ball"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.05.png"), "ta/den", "rice field"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.06.png"), "shiro/haku", "white"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.07.png"), "me/moku", "eye/look"));
		
	}
	
	void loadQuiz3()
	{
		//System.out.println("it happened");
	
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.04.png"), "yama/san", "living"));
	
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.08.png"), "en", "stone"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.09.png"), "ritsu/ryu", "stand"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.10.png"), "hyaku/momo", "hundred"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.11.png"), "nen/toshi", "year"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.12.png"), "tsuki/gatsu", "rest"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.13.png"), "ki/moku", "previous/ahead"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.14.png"), "na/mei", "name"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.15.png"), "aza/ji", "character/letter"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.16.png"), "inu/ken", "early/fast"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.17.png"), "ki", "spirit"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.18.png"), "chiku/take", "bamboo"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.19.png"), "ito", "string"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji3\\BeginningKanji3.20.png"), "mimi/ji", "ear"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.01.png"), "mushi/chu", "insect"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.02.png"), "mura/son", "village"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.03.png"), "otoko/dan/nan", "male"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.04.png"), "machi/cho", "town"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.05.png"), "hana/ka", "flower"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.07.png"), "kai", "clam"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.08.png"), "aka/seki", "red"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.09.png"), "ashi/soku", "leg/foot"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.10.png"), "kuruma/sha", "car"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.12.png"), "hayashi/rin", "woods"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.13.png"), "sora/ku", "air/sky"));
		
	}
	
	void loadQuiz4()
	{
		//System.out.println("it happened");

		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.06.png"), "ten", "see"));

		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.11.png"), "nichi/hi", "study/learn"));

		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.14.png"), "kane/kin", "gold"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.15.png"), "ame/u", "rain"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.16.png"), "ao/sei", "blue"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.17.png"), "kusa/so", "grass/weed"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.18.png"), "ne/on", "sound"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.19.png"), "de/shu", "school/exam"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji4\\BeginningKanji4.20.png"), "mori/shin", "forest"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.18.png"), "kokoro/shin", "heart"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.19.png"), "to/ko", "door"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.13.png"), "bun", "minute"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.11.png"), "ima/kon", "now"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.06.png"), "yumi/kyu", "bow"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.01.png"), "katana/to", "sword/knife"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.02.png"), "man", "ten-thousand"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.03.png"), "maru/gan", "circle/round"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji6.01.png"), "ke", "hair"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji6.02.png"), "chichi/fu", "father"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji6.03.png"), "ushi/gyu", "cow"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji6.04.png"), "kita/hoku", "north"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji6.05.png"), "ani/kei/kyo", "older brother"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji6.06.png"), "fuyu/to", "winter"));
	}
	
	void loadQuiz5()
	{
		//System.out.println("it happened");
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.07.png"), "soto/gai", "outside"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.08.png"), "haha/bo", "mother"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.09.png"), "ya/shi", "arrow"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.10.png"), "tera/ji", "temple"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.11.png"), "hikari/ko", "light"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.12.png"), "ike/chi", "pond"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.13.png"), "kome/bei/mai", "rice"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.14.png"), "ha/hane/u", "wing/feather"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.15.png"), "niku", "meat"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.16.png"), "iro/shoku/shiki", "color"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.17.png"), "nishi/sei", "west"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.18.png"), "karada/tai/tei", "body"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.19.png"), "ototo,tei/dai", "younger brother"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.20.png"), "koe/sei", "voice"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.21.png"), "sato/ri", "village/countryside"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.22.png"), "mugi/baku", "wheat"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.23.png"), "higashi/to", "east"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.24.png"), "yoru/ya/yo", "night"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.25.png"), "kuni/koku", "country"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji6\\BeginningKanji6.26.png"), "ane/shi", "older sister"));

		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.04.png"), "yama/san", "age"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.05.png"), "kawa", "craft/construction"));

		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.07.png"), "naka/chuu", "inside"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.08.png"), "en", "?"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.09.png"), "te/shu", "few"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.10.png"), "aya/bun", "healthy"));
	
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.12.png"), "tsuki/gatsu", "public"));
	
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.14.png"), "mizu/sui", "cut"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.15.png"), "hi/ka", "friend"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.16.png"), "inu/ken", "great/thick"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.17.png"), "ou", "pull"));

		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\BeginningKanji5\\BeginningKanji5.20.png"), "hon/moto", "direction"));
		
	}
	
	void loadQuiz6()
	{
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.01.png"), "imoto/mai", "younger sister"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.02.png"), "iwa/gan", "boulder"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.03.png"), "mise/ten", "shop"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.04.png"), "kado/mon", "gate"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.05.png"), "hiru/chu", "noon"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.06.png"), "mae/zen", "front"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.07.png"), "minami/nan", "south"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.08.png"), "ten", "dot"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.09.png"), "haru/shun", "spring"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.10.png"), "hoshi/sei", "star"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.11.png"), "umi/kai", "sea"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.12.png"), "aki/shu", "fall"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.13.png"), "cha/sa", "tea"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.14.png"), "kaze/fu", "wind"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.15.png"), "kubi/shu", "neck"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.16.png"), "natsu/ka", "summer"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.17.png"), "ie/ka", "house"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.18.png"), "toki/ji", "time"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.19.png"), "kami/shi", "paper"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji1\\IntermediateKanji1.20.png"), "uma/ba", "horse"));
	}
	
	void loadQuiz7()
	{
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.01.png"), "kawa", "group"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.02.png"), "ten", "boat"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.03.png"), "naka/chuu", "week"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.04.png"), "en", "field"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.05.png"), "te/shu", "snow"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.06.png"), "mon/bun", "fish"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.07.png"), "nichi/hi", "bird"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.08.png"), "tsuki/gatsu", "yellow"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.09.png"), "ki/moku", "black"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.10.png"), "mizu/sui", "picture"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.11.png"), "hi/ka", "morning"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.12.png"), "inu/ken", "road"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.13.png"), "ou", "cloud"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.14.png"), "hon/moto", "number"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.15.png"), "onna/jo", "song"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.16.png"), "ko/shi", "line"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.17.png"), "chii/shou", "parent"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.18.png"), "kawa", "head"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.19.png"), "ten", "face"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji2\\IntermediateKanji2.20.png"), "naka/chuu", "ice"));
	}
	
	void loadQuiz8()
	{
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.01.png"), "te/shu", "plate"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.02.png"), "aya/bun", "state"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.03.png"), "nichi/hi", "next"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.04.png"), "mizu/sui", "death"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.05.png"), "hi/ka", "row"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.06.png"), "ou", "sheep"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.07.png"), "shou/tada", "blood"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.08.png"), "de/shu", "slope"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.09.png"), "hon/moto", "beans"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.10.png"), "onna/jo", "front"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.11.png"), "ko/shi", "life"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.12.png"), "chii/shou", "taste/flavor"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.13.png"), "yama/san", "place"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.14.png"), "kawa", "old times"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.15.png"), "naka/chuu", "oil"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.16.png"), "en", "item/goods"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.17.png"), "te/shu", "clothes"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.18.png"), "aya/bun", "prefectures"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.19.png"), "tsuki/gatsu", "charcoal"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji3\\IntermediateKanji3.20.png"), "ki/moku", "pillar"));
	}
	
	void loadQuiz9()
	{
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.01.png"), "mizu/sui", "farm"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.02.png"), "hi/ka", "god"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.03.png"), "inu/ken", "second"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.04.png"), "ou", "island"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.05.png"), "shou/tada", "yard"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.06.png"), "hon/moto", "trip/travel"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.07.png"), "shou/tada", "root"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.08.png"), "de/shu", "alcohol"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.09.png"), "ki/moku", "breath"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.10.png"), "nichi/hi", "evil"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.11.png"), "ten", "hotel"));
		//kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.12.png"), "onna/jo", ""));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.13.png"), "ko/shi", "fruit"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.14.png"), "chii/shou", "lake"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.15.png"), "ki/moku", "brush"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.16.png"), "nichi/hi", "tooth"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.17.png"), "ten", "poem"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.18.png"), "onna/jo", "iron"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.19.png"), "ko/shi", "green"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji4\\IntermediateKanji4.20.png"), "chii/shou", "silver"));
	}
	
	void loadQuiz10()
	{
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.01.png"), "ki/moku", "station"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.02.png"), "nichi/hi", "nose"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.03.png"), "ten", "side"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.04.png"), "onna/jo", "box"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.05.png"), "ko/shi", "bridge"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.06.png"), "chii/shou", "medicine"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.07.png"), "onna/jo", "husband"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.08.png"), "ko/shi", "poison"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.09.png"), "chii/shou", "stomach"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.10.png"), "onna/jo", "storage"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.11.png"), "ko/shi", "grandchild"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.12.png"), "chii/shou", "japanese plum"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.13.png"), "onna/jo", "flower"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.14.png"), "ko/shi", "difference"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.15.png"), "chii/shou", "pulse"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.16.png"), "onna/jo", "nest"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.17.png"), "ko/shi", "elephant"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.18.png"), "chii/shou", "salt"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.19.png"), "onna/jo", "love"));
		kanjiList.add(new KanjiCharacter(new ImageIcon("bin\\IntermediateKanji5\\IntermediateKanji5.20.png"), "ko/shi",  "intestines"));
	}
	
	void loadQuiz11()
	{
		
	}
	
	void loadQuiz12()
	{
		
	}
	
	void loadQuiz13()
	{
		
	}
	
	void loadQuiz14()
	{
		
	}
	
	void loadQuiz15()
	{
		
	}
	
	void eliminateElements()
	{
		Random myRandom = new Random();
		int randInt;
		
		while (kanjiList.size() > prefferedListSize)
		{
			randInt = myRandom.nextInt(kanjiList.size());
			kanjiList.remove(randInt);
		}
	}
	
	void incrementCurrentItem()
	{
		if (kanjiList.get(currentItemIndex).correctCount >= timesToGetCorrect)
		{
			kanjiList.remove(currentItemIndex);
		}
		
		currentItemIndex++;
		if(currentItemIndex > kanjiList.size() - 1)
		{
			currentItemIndex = 0;
			scramble(kanjiList);
		}
		
		if (kanjiList.size() == 4)
		{
			quizComplete = true;
		}
	}
	
	String getPercentageDone()
	{
		percentageDone = ((correctQuestionAmount * 100) / questionAmount);
		String percentage = Double.toString(percentageDone);
		return percentage;
	}
	
	void incrementCorrectQuestionAmount()
	{
		correctQuestionAmount++;
	}
	
	void printScoreBar()
	{
		System.out.println(questionAmount);
	}
	
	void scramble(List<KanjiCharacter> theList)
	{
		KanjiCharacter character1;
		KanjiCharacter character2;
		int randomInt, randomInt2;
		
		Random myRandom = new Random();
		//System.out.println(theList.size());
		for(int i = 0; i < 100; i++)
		{
			randomInt = myRandom.nextInt(theList.size());
			character1 = theList.get(randomInt);
			
			randomInt2 = myRandom.nextInt(theList.size());
			character2 = theList.get(randomInt2);
			
			theList.set(randomInt, character2);
			theList.set(randomInt2, character1);
		}
		//System.out.println("bird");
		
	}
	
	ArrayList<KanjiCharacter> getNextSet()
	{
		//System.out.println(percentageDone);
		ArrayList<KanjiCharacter> temporaryResult;
		temporaryResult = new ArrayList<KanjiCharacter>();
		KanjiCharacter tempChar = kanjiList.get(currentItemIndex);
		tempChar.isAnswer = true;
		temporaryResult.add(tempChar);
	
		Random myRandom = new Random();
		
		int randInt;
		
		for(int i = 0; i<3; i++)
		{
			do 
			{
			randInt = myRandom.nextInt(kanjiList.size());
			tempChar = kanjiList.get(randInt);
			}
			while(temporaryResult.contains(tempChar));
			
			tempChar.isAnswer = false;
			temporaryResult.add(tempChar);
		}
		
		scramble(temporaryResult);
		return temporaryResult;
	}
}
