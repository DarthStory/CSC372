package sortingStudents;

public class Student {
	
	/*
	 * Setup of the Student object, lists the variables and components. 
	 */

	public String name;
	public int rollno;
	public String address;
	
	public Student(String name, int rollno, String address) {
		this.name = name;
		this.rollno = rollno;
		this.address = address;
		
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollno;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nRoll Number: " + rollno + "\nAddress: " + address;
	}
}
