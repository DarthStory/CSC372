package recursionProcduct;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionProduct {
	
	/* array for the numbers to be stored, 5 is set as we know the limit
		* instructions
		* progression through each array index
		* add the number to the array
		* variable assigned to the method "multiply" with the numbers in and index start point
		* final output
		* 
		*/
	
	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			while(i < 5)
				try {
					System.out.print("Number " + (i + 1) + ": ");
					numbers[i] = scnr.nextInt();
					if (numbers[i] >= 0) {
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Please enter in a valid number.");
					scnr.nextLine();
				}
			
		}
		scnr.close();
		int product = multiply(numbers, 0);
		System.out.println("The product of the numbers is: " + product);
	}
	
	
	/* recursion method to progress through the array and multiply the numbers. 
	* if the current index is less than the length of the array
	* this was interesting to learn about. you use "1" for multiplication and division, 
	* and a "0" for addition and subtraction
	* you need this to return the value as just "return" doesn't return anything
	* base
	* Recursion 
	*/
	public static int multiply(int[] numbers, int index) {
		if(index >= numbers.length) {
			return 1;
		}
		return numbers[index] * multiply(numbers, index + 1);
	}
}