package weekOneInheritance;

public class Geometry {
	
	public static void main(String[] args) {
		Shape circle = new Circle("Coin");
		System.out.println("The area for the coin is: " + circle.calculateArea());
		Shape square = new Rectangle();
		System.out.println("The area of the square is: " + square.calculateArea());
		Shape triangle = new Triangle("Pyramid");
		System.out.println("The are of the pyramid is: " + triangle.calculateArea());
		
	}
}
