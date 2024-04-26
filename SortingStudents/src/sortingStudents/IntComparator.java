package sortingStudents;

import java.util.Comparator;

public class IntComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getRollNo(), o2.getRollNo());
	}
}
