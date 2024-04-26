package sortingStudents;

public class Student {

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
