package shape;

public class Cone extends Shape{

	double radius;
	double height;
	
	public Cone(double radius, double height) {
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
		return Math.PI * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
	}

	@Override
	public double volume() {
		return (Math.PI * radius * radius * height) / 3;
	}
	
//	@Override
//	public String toString() {
//		return "Surface Area: " + dF.format(surface_area()) + ", Volume: " + dF.format(volume());
//	}


}
