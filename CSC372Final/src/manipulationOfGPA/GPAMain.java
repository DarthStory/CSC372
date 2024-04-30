package manipulationOfGPA;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

//import manipulationOfGPA.DoubleComparator;
//import manipulationOfGPA.StringComparator;
//import manipulationOfGPA.Student;
//import manipulationOfGPA.StudentSorter;

public class GPAMain {

	public static void main(String[] args) {
		LinkedList<Student> students = new LinkedList<>();
		Scanner scnr = new Scanner(System.in);
		 
		
		System.out.println("Enter Name, Address and GPA. ");
		int i = 0;
		while (i <= 3) {
			System.out.println("Name: ");
			String name = scnr.next();
			
			System.out.println("Address: ");
			String address = scnr.nextLine();
			scnr.nextLine();
			
			double GPA = -1.0;
			while(GPA < 0.0) {
				try {
					System.out.println("GPA: ");
					GPA = scnr.nextDouble();
				}catch (InputMismatchException e) {
					System.out.println("Invalid entry. Please enter again.");
					scnr.next();
				}
			}
		
			
			students.add(new Student(name, address, GPA));
			i++;
			
		}
		scnr.close();
		System.out.println("Students Added.\n");
	
		System.out.println("Sorting by Name: ");
		StudentSorter.selectionSort(students, new StringComparator());
		for(Student student : students) {
			System.out.println(student);
		}
		
		System.out.println();
		
		System.out.println("Sorting by GPA: ");
		StudentSorter.selectionSort(students, new DoubleComparator());
		for(Student student : students) {
			System.out.println(student);
		}
	}

}
