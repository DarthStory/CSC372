package shape;

public class Sphere extends Shape{

	double radius;
		
	public Sphere(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	@Override
	public double surface_area() {
		return 4 * Math.PI * radius * radius;
	}

	@Override
	public double volume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}
	
	@Override
	public String toString() {
		return "Surface Area: " + dF.format(surface_area()) + ", Volume: " + dF.format(volume());
	}
}
