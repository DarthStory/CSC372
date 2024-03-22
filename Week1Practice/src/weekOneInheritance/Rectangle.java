package weekOneInheritance;

import java.util.*;

public class Rectangle extends Shape {
	Scanner scnr = new Scanner(System.in);
	public Rectangle() {
	}
	public Rectangle (String name) {
		super("Rectangle");
	}
	public double calculateArea() {
		System.out.println("Enter the length and width of the rectangle: ");
		double length = scnr.nextDouble();
		double width = scnr.nextDouble();
		return length * width;
	}
}
