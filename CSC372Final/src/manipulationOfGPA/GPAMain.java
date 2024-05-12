package manipulationOfGPA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


public class GPAMain {

	public static void main(String[] args) {
		LinkedList<Student> students = new LinkedList<>();
		Scanner scnr = new Scanner(System.in);
		while(true) { 
			System.out.println("Do you want to enter in a new Student. Y(Yes) or N(No)");
			String answer = scnr.next();
			char ch = answer.charAt(0);
				if( ch == 'n' || ch == 'N') {
					
					System.out.println("Sorting by Name. Saving to: C:\\Temp\\GPA.txt \nExiting program.\n");
					StudentSorter.selectionSort(students, new StringComparator());
					for(Student student : students) {
						System.out.println(student);
		
						saveToFile(students);
						scnr.close();
					}
					System.exit(0);
				} else if(ch == 'y' || ch == 'Y') {
		
					System.out.println("Enter Name, Address and GPA. ");
					int i = 0;
//					while (i <= 3) {
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
								if (GPA <= 0.0 || GPA > 4.0) {
									System.out.println("Please enter a valid GPA.");
									GPA = -1.0;
										scnr.next();
								}
							}catch (InputMismatchException e) {
								System.out.println("Invalid entry. Please enter again.");
								scnr.next();
							}
						}
		
			
						students.add(new Student(name, address, GPA));
						i++;
			
//					}
					
					System.out.println("Students Added.");
	
		
				}else {
					System.out.println("Please enter in either 'Y' or 'N'. Thank you.");
				}
		
				System.out.println();
		}

	}
	public static void saveToFile(LinkedList<Student> students) {		
		File file = new File("C:\\Temp\\GPA.txt");		
	       try (FileWriter writer = new FileWriter(file)) {        	
	           for(Student student : students) {
	        	   writer.write(student.toString() + "\n");
	           }
	       } catch (IOException e) {
	           e.printStackTrace();
	       }
	}

}
