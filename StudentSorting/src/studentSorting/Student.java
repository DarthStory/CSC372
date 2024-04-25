package studentSorting;

public class Student {

	int rollno;
	String name;
	String address;
	
	public Student(String name, int rollno, String address) {
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollno;
	}
	public void setRollNo(int rollno) {
		this.rollno = rollno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "\nName: " + name + "\nRoll Number: " + rollno + "\nAddress: " + address;
	}
}
