package shape;

public class shapeArray {

	public static void main(String[] args) {
		
		Sphere sphere = new Sphere(5.1);
		Cylinder cylinder = new Cylinder(5.0, 3.2);
		Cone cone = new Cone(5.0, 5.2);
		
		String[] shapeArray = new String[3];
		shapeArray[0] = sphere.toString();
		shapeArray[1] = cylinder.toString();
		shapeArray[2] = cone.toString();
		
		for(int i = 0; i < shapeArray.length; i++) {
			String output = shapeArray[i];
			System.out.println(output);
		}
//		
//		for(String output : shapeArray) {
//			System.out.println(output);
//		}	
	}
}
