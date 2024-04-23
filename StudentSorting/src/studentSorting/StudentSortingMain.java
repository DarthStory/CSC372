package studentSorting;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentSortingMain {

	public static void main(String[] args) {
		
		StudentData data = new StudentData();
		Scanner scnr = new Scanner(System.in);
		 
		
		System.out.println("Enter Name, Roll Number, and Address. ");
		int i = 0;
		while (i <= 1) {
			System.out.println("Name: ");
			String name = scnr.next();
		
			int rollno = -1;
			while(rollno <= 0) {
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
		i++;
		
		data.addStudent(name, rollno, address);
		System.out.println("Students Added.\n");
		}
		data.viewStudent();
	}
}
