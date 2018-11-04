package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiti {
	public static void main(String[] args) {
		Robot robot = new Robot();
		
		robot.setSpeed(100);
		robot.penDown();
		robot.move(252);
		robot.turn(90);
		robot.move(100);
		robot.turn(180);
		robot.move(100);
		robot.turn(-90);
		robot.move(125);
		robot.turn(-90);
		robot.move(80);
		robot.turn(180);
		robot.move(80);
		robot.turn(-90);
		robot.move(125);
		robot.turn(-90);
		robot.move(100);
	}

}
