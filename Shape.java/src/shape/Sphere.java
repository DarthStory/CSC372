package shape;

public class Sphere extends Shape{

	// variable
	double radius;
	
	// constructor
	public Sphere(double radius) {
		this.radius = radius;
	}

	//getter
	public double getRadius() {
		return radius;
	}
	
	// Overrides shape method with specific method for Sphere
	@Override
	public double surface_area() {
		return 4 * Math.PI * radius * radius;
	}

	// Overrides shape method with specific method for Sphere
	@Override
	public double volume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}
	
	// toString method for output
	@Override
	public String toString() {
		return "Surface Area: " + dF.format(surface_area()) + ", Volume: " + dF.format(volume());
	}
}
