package _02_nested_loops._1_snowflake;

import org.jointheleague.graphical.robot.Robot;

public class Playinaround extends Robots {
public static void main(String[] args) {

	
	Robot miles = new Robot();
	miles.setSpeed(1000000000);
	miles.penDown();
	miles.setPenColor(75, 245, 66);
	for (int i = 0; i < 360; i++) {
	miles.move(4);	
	miles.turn(1);
}
for (int j = 0; j < 360; j++) {
	miles.move(-4);	
	miles.turn(1);
}	
	miles.turn(90);
	for (int p = 0; p < 360; p++) {
		miles.move(-4);	
		miles.turn(1);
	}	
	
for (int w = 0; w < 360; w++) {
	miles.move(4);	
	miles.turn(1);
}	





}
}
