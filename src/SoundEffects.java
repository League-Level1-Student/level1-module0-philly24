import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 public class SoundEffects implements ActionListener {
	JButton b1;
	JButton b2;
	JButton b3;
	JFrame frame;

	public static void main(String[] args) {
		new SoundEffects().createuic();
	}

	public void createuic(){
		JFrame frame = new JFrame(); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		 b1 = new JButton();
		b1.setText("sound 1");
		b1.addActionListener(this);
		 b2 = new JButton();
		b2.setText("sound 2");
		b2.addActionListener(this);
		 b3 = new JButton();
		b3.setText("sound 3");
		b3.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		frame.add(panel);	
		frame.pack();
	}
	public void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
		sound.play();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			playSound("drum.wav");
		
		}
		else if (e.getSource()==b2) {
			playSound("cymbal.wav");
		} else {
			playSound("fart.wav");
		}


	}

	






}
