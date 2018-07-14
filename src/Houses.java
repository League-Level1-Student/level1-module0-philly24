import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(10);
		rob.setX(50);
		rob.setY(600);
		rob.penDown();
		rob.setPenWidth(10);
		for (int i = 0; i < 9; i++) {
			String answer2 = JOptionPane.showInputDialog("what type of roof? peak or flat");
			
			String answer=JOptionPane.showInputDialog("how tall");
			
			rob.setPenColor(Integer.parseInt(JOptionPane.showInputDialog("red color")), Integer.parseInt(JOptionPane.showInputDialog("green color")),
					Integer.parseInt(JOptionPane.showInputDialog("blue color")));
			
			int num;
			if (answer.equalsIgnoreCase("small")) {
				num=60;
			}
			else if (answer.equalsIgnoreCase("medium")) {
				num=120;
			} else {
				num=250;
				
			}
			if (answer2.equalsIgnoreCase("flat")) {
				house(rob,num,null,false);
				
			}else {
				house(rob,num,null,true);
			}
			
	}

	}



	static void house(Robot rob,int height,Color c, boolean peak) {
		
			

			rob.move(height);
			if (peak==false) {
				
				rob.turn(90);
				rob.move(30);
				rob.turn(90);
				
			
			}
			else {
				
				rob.turn(45);
				rob.move(20);
				rob.turn(90);
				rob.move(20);
				rob.setAngle(180);
			}
		
			rob.move(height);
			rob.turn(270);
			rob.move(20);
			rob.turn(270);
		





	}
}

