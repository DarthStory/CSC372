package shape;

public class Cylinder extends Shape{

	// variables
	double radius;
	double height;
	
	// constructor
	public Cylinder(double radius, double height) {
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
	
	// Override the shape method for Cylinder specific method
	@Override
	public double surface_area() {
		return(2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
	}

	// Override the shape method for Cylinder specific method
	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}
	
	// toString for output
	@Override
	public String toString() {
		return "Surface Area: " + dF.format(surface_area()) + ", Volume: " + dF.format(volume());
	}

}
