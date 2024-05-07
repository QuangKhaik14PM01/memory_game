import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Music {
	static Clip clipBG = null;
	static AudioInputStream audioStreamBG;
	static Clip clipClickP = null;
	static AudioInputStream audioStreamClickP;
	static Clip clipClickR = null;
	static AudioInputStream audioStreamClickR;
	static Clip clipFlip = null;
	static AudioInputStream audioStreamFlip;
	public static void getBackGroundMusic(String s)
	{
		try 
		{
			audioStreamBG = AudioSystem.getAudioInputStream(UI.class.getResource(s));
			clipBG = AudioSystem.getClip();
			clipBG.open(audioStreamBG);
		} 
		catch (Exception e) {}
		setVolume(clipBG,0.1D);
	}
	public static void getClickSoundP()
	{
		try 
		{
			audioStreamClickP = AudioSystem.getAudioInputStream(UI.class.getResource("Music/click_sound_pressed.wav"));
			clipClickP = AudioSystem.getClip();
			clipClickP.open(audioStreamClickP);
		} 
		catch (Exception e) {}
		setVolume(clipClickP,0.2D);
	}
	public static void getClickSoundR()
	{
		try 
		{
			audioStreamClickR = AudioSystem.getAudioInputStream(UI.class.getResource("Music/click_sound_released.wav"));
			clipClickR = AudioSystem.getClip();
			clipClickR.open(audioStreamClickR);
		} 
		catch (Exception e) {}
		setVolume(clipClickR,0.2D);
	}
	public static void getFlipSound()
	{
		try 
		{
			audioStreamFlip = AudioSystem.getAudioInputStream(UI.class.getResource("Music/cardFlip_sound.wav"));
			clipFlip = AudioSystem.getClip();
			clipFlip.open(audioStreamFlip);
		} 
		catch (Exception e) {}
		setVolume(clipFlip,0.5D);
	}
	public static void setVolume(Clip clip, double a)
	{
		FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		double gain = a; // number between 0 and 1 (loudest)
		float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
		gainControl.setValue(dB);
	}
	public static void startBGMusic()
	{
		clipBG.start();
		clipBG.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public static void stopBGMusic()
	{
		clipBG.stop();
	}
	public static void playClick_P()
	{
		getClickSoundP();
		clipClickP.start();
	}
	public static void playClick_R()
	{
		getClickSoundR();
		clipClickR.start();
	}
	public static void playFlip()
	{
		getFlipSound();
		clipFlip.start();
	}
	
}
