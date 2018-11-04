package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
	public static void main(String[] args) {
		
		int x = 1;
		
		String color = JOptionPane.showInputDialog("Whats your favorite color?");
		
	while(x<9999) {
		color = JOptionPane.showInputDialog("Whats your favorite color?");
		if (color.equalsIgnoreCase("blue")) {
			JOptionPane.showMessageDialog(null, "Thats also my favorite color");
			break;
		}
	
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		
		}
		x++;
		
	}

	Robot robot = new Robot();
	robot.setSpeed(100);
	robot.penDown();
	robot.move(100);
	robot.turn(120);
	robot.move(100);
	robot.turn(120);
	robot.move(100);
	robot.turn(120);

}
}