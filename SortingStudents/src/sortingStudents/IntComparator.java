package sortingStudents;

import java.util.Comparator;

public class IntComparator implements Comparator<Student> {
	
	/*
	 * Comparator for the Integer objects in the Student class
	 */

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getRollNo(), o2.getRollNo());
	}
}
