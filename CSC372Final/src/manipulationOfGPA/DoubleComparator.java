package manipulationOfGPA;

import java.util.Comparator;

public class DoubleComparator implements Comparator<Student> {
	
	/*
	 * Comparator for the Integer objects in the Student class
	 */

	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o1.getGPA(), o2.getGPA());
	}
}
