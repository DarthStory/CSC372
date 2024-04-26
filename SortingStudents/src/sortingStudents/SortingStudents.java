package sortingStudents;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortingStudents {


	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		 
		
		System.out.println("Enter Name, Roll Number, and Address. ");
		int i = 0;
		while (i <= 5) {
			System.out.println("Name: ");
			String name = scnr.next();
		
			int rollno = -1;
			while(rollno < 0) {
				try {
					System.out.println("Roll Number: ");
					rollno = scnr.nextInt();
				}catch (InputMismatchException e) {
					System.out.println("Invalid entry. Please enter again.");
					scnr.next();
				}
			}
		
			scnr.nextLine();
			System.out.println("Address: ");
			String address = scnr.nextLine();
			students.add(new Student(name, rollno, address));
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
		
		System.out.println("Sorting by Roll Number: ");
		StudentSorter.selectionSort(students, new IntComparator());
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
