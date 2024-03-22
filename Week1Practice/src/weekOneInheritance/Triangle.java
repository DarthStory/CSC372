package weekOneInheritance;

import java.util.*;

public class Triangle extends Shape {
	Scanner scnr = new Scanner(System.in);
	public Triangle() {
	}
	public Triangle(String name) {
		super("Triangle");
	}
	public double calculateArea() {
		System.out.println("Enter in the base and height of the triangle: ");
		double height = scnr.nextDouble();
		double base = scnr.nextDouble();
		return .5 * height * base;
	}
}
