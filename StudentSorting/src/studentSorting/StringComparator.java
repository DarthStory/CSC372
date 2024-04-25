package studentSorting;

import java.util.Comparator;

public class StringComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getName() instanceof String && o2.getName() instanceof String) {
			return o1.getName().compareTo(o2.getName());
		}
		else {
			throw new IllegalArgumentException("Cannot compare non-integer values.");	
		}
	}
}
