package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	static FortuneCookie fc = new FortuneCookie();
	
	public static void main(String[] args) {
	fc.showButton();

	}
		public void showButton() {
    System.out.println("Button clicked");
    JFrame frame = new JFrame(); 
    frame.setVisible(true);
    JButton button = new JButton();
   button.setText("click here for fortune");
    frame.add(button);
   frame.setSize(300, 300);
    button.addActionListener(this);
		 
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand==0) {
			JOptionPane.showMessageDialog(null, "you will have a good day");
		}
		else if (rand==1) {
			JOptionPane.showMessageDialog(null,"you will win the lottery");
		
		}
		else if (rand==2) {
			JOptionPane.showMessageDialog(null, "you will get your dream job today");
		}
		else if (rand==3) {
			JOptionPane.showMessageDialog(null, "today will be a good day");
		}
		else {
			JOptionPane.showMessageDialog(null, "chase your dream");
		}
		}

}	