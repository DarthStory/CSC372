package shape;

public class Cylinder extends Shape{

	double radius;
	double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public double surface_area() {
		return(2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
	}

	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}
//	@Override
//	public String toString() {
//		return "Surface Area: " + dF.format(surface_area()) + ", Volume: " + dF.format(volume());
//	}

}
