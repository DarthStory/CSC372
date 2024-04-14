package shape;

public class Cone extends Shape{
	
	// variables
	double radius;
	double height;
	
	// Constructor
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	// getter
	public double getRadius() {
		return radius;
	}
	
	// getter
	public double getHeight() {
		return height;
	}
	
	// Override shape for specific Cone method
	@Override
	public double surface_area() {
		return Math.PI * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
	}

	// Override shape for specific Cone method
	@Override
	public double volume() {
		return (Math.PI * radius * radius * height) / 3;
	}
	
	// toString for output
	@Override
	public String toString() {
		return "Surface Area: " + dF.format(surface_area()) + ", Volume: " + dF.format(volume());
	}


}
