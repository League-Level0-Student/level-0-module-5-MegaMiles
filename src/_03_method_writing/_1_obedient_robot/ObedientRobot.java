package _03_method_writing._1_obedient_robot;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class ObedientRobot {
	static Robot bob = new Robot();
	
public static void main(String[] args) {
	bob.penDown();
String Shape = JOptionPane.showInputDialog(null,"What shape do you want the robot to draw?"
		+ " A Square,Triangle, or Circle");

String color = JOptionPane.showInputDialog(null,"what color do you want the robot to draw in?"
		+ "Red, yellow, green, or blue");
if (color.equalsIgnoreCase("Red")) {
	bob.setPenColor(Color.RED);
}
if (color.equalsIgnoreCase("yellow")) {
	bob.setPenColor(Color.YELLOW);
}
if (color.equalsIgnoreCase("green")) {
	bob.setPenColor(Color.GREEN);
}
if (color.equalsIgnoreCase("blue")) {
	bob.setPenColor(Color.BLUE);
}
if (Shape.equalsIgnoreCase("Square")) {
	drawSquare();
}
if (Shape.equalsIgnoreCase("Triangle")) {
	drawTriangle();
}
if (Shape.equalsIgnoreCase("Circle")) {
	drawCircle();
}
}
static void drawSquare() {
bob.move(100);	
bob.turn(90);
bob.move(100);
bob.turn(90);	
}
static void drawTriangle() {
bob.move(100);
bob.turn(60);
bob.move(100);
bob.turn(60);
bob.move(100);
bob.turn(60);
}
static void drawCircle() {
for (int i = 1; i < 360; i++) {
bob.move(2);
bob.turn(1);
}	
}

}
