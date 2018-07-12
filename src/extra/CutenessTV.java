package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton b1;
	JButton b2;
	JButton b3;
	JFrame frame;
	public static void main(String[] args) {
		 new CutenessTV().userinterface();
	}
	void userinterface() {
		JFrame frame = new JFrame(); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		b1 = new JButton();
		b1.setText("duck vid");
		b1.addActionListener(this);
		b2 = new JButton();
		b2.setText("frog vid");
		b2.addActionListener(this);
		b3 = new JButton();
		b3.setText("unicorns vid ");
		b3.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		frame.add(panel);
		frame.pack();
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=ObK0cZxP35U");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b1) {
			showDucks();
		}
		else if (e.getSource()==b2) {
			showFrog();
		}
		else if(e.getSource()==b3){
			showFluffyUnicorns();
		}
	
	}





}