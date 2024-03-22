package weekOneInheritance;

public abstract class Shape {
	private String shapeName;
	private double area;

	public Shape()	{	
	}
	public Shape (String shapeName) {
		this.shapeName = shapeName;
		area = 0;
	}
	public Shape (String name, double area) {
		this.shapeName = shapeName;
		this.area = area;
	}
	public abstract double calculateArea();
}