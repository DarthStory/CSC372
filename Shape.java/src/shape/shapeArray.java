package shape;

public class shapeArray {

	public static void main(String[] args) {
		
		Sphere sphere = new Sphere(5.0);
		Cylinder cylinder = new Cylinder(5.0, 3.0);
		Cone cone = new Cone(5.0, 5.0);
		
		System.out.println(sphere);
		System.out.println(cylinder);
		System.out.println(cone);
	}
}
