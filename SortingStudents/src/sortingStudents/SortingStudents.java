package sortingStudents;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortingStudents {
	
	/*
	 * This is the main method, While the programs are small, I use this as the interface between the program and the user. I would
	 * assume that in the real world there are procedures to follow that might make this not the way to go about it
	 * 
	 * First I established the array that I will store the data and ask the user for the information to be input. Then close the interaction. 
	 * 
	 * I then label the process, run the sorting method with the array and the comparator for both Strings and Integers
	 * Lastly it goes through the sorted array and prints out the data. 
	 */


	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		try (Scanner scnr = new Scanner(System.in)) {
		 
		
			System.out.println("Enter Name, Roll Number, and Address. ");
			int i = 0;
			while (i <= 10) {
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
		}catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
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
