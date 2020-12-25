package _04_practice._2_code_4_life;

import java.applet.AudioClip;
import java.io.File;
import java.net.URI;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
public static void main(String[] args) {
	

	// 1. Ask the user how many hours they spent coding this week.
String code = JOptionPane.showInputDialog(null,"How many hours have you spent coding this week?");
int codee = Integer.parseInt(code);
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.
if (codee <= 2) {
	JOptionPane.showMessageDialog(null,"STOP WATCHING YOUTUBE AND CODE!!!!!");
}
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja
else if (codee >= 3 && codee <= 5) {
	JOptionPane.showMessageDialog(null,"Your a code ninja! good job :)");
}
	// 4. If it is more than 5, call the method below to play the Batman theme song.
	// NOTE: You may have to get batman.wav from league-sounds on github: https://github.com/jointheleague/league-sounds
else if (codee > 5) {
	playVideo("https://www.youtube.com/watch?v=VSaDPc1Cs5U");	
}




}
	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
