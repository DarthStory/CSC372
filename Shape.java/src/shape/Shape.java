package shape;

import java.text.DecimalFormat;

public abstract class Shape {

	DecimalFormat dF = new DecimalFormat("#.###");
	
	public abstract double surface_area();
	public abstract double volume();
}
