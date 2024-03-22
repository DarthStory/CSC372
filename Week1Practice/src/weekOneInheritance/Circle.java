package weekOneInheritance;

import java.util.*;

public class Circle extends Shape {
	Scanner scnr = new Scanner(System.in);
	public Circle() {
		super("Circle");
	}
	public Circle(String name) {
		super(name);
	}
	public double calculateArea() {
		System.out.println("Enter the radius of the circle: ");
		double radius = scnr.nextDouble();
		return Math.PI * Math.pow(radius, 2);
	}
}
