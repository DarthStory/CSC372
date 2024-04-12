package shape;

import java.text.DecimalFormat;

public abstract class Shape {

	DecimalFormat dF = new DecimalFormat("#.###");
	
	// A way to make sure that these methods are implemented in the subclasses. 
	public abstract double surface_area();
	public abstract double volume();
}
