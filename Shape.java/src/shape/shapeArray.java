package shape;

public class shapeArray {

	public static void main(String[] args) {
		
		// Create all the objects and input data
		Sphere sphere = new Sphere(5.1);
		Cylinder cylinder = new Cylinder(5.0, 3.2);
		Cone cone = new Cone(5.0, 5.2);
		
		// Create the array to store the objects
		String[] shapeArray = new String[3];
		shapeArray[0] = sphere.toString();
		shapeArray[1] = cylinder.toString();
		shapeArray[2] = cone.toString();
		
		// print out all the objects in the array
		for(int i = 0; i < shapeArray.length; i++) {
			String output = shapeArray[i];
			System.out.println(output);
		}
		
		// I left this as I believe this is the "better" way to put it but for
		// simplicity, I left the above as the working for loop. 
//		
//		for(String output : shapeArray) {
//			System.out.println(output);
//		}	
	}
}
