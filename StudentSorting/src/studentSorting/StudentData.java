package studentSorting;

import java.util.ArrayList;
import java.util.List;

public class StudentData {

		public List<Student> students;
		
		public StudentData() {
			students = new ArrayList<>();
		}
		
		public void addStudent(String name, int rollno, String address) {
			Student student = new Student(name, rollno, address);
			
			students.add(student);
//			System.out.println("\n" + student.getName()
//				+ " " + student.getRollNo()
//				+ " " + student.getAddress() + "\n");
		}
		public void viewStudent() {
			if(students.isEmpty()) {
				System.out.println("No Students found.");
				return;
			}
			for(int i = 0; i < students.size(); i++) {
				System.out.println(students.get(i));
			}
		}
		public List<Student> getStudent() {
			return students;
		}
}
