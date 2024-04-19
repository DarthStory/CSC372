package recursionProcduct;

import java.util.Scanner;

public class RecursionProduct {
	
	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		// array for the numbers to be stored, 5 is set as we know the limit
		int[] numbers = new int[5];
		// instructions
		System.out.println("Enter 5 numbers: ");
		// progression through each array index
		for (int i = 0; i < 5; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			// add the number to the array
			numbers[i] = scnr.nextInt();
		}
		// variable assigned to the method "multiply" with the numbers in and index start point
		int product = multiply(numbers, 0);
		// final output
		System.out.println("The product of the numbers is: " + product);
	}
	// recursion method to progress through the array and multiply the numbers. 
	public static int multiply(int[] numbers, int index) {
		// if the current index is less than the length of the array
		if(index >= numbers.length) {
			// this was interesting to learn about. you use "1" for multiplication and division, and a "0" for addition and subtraction
			// you need this to return the value as just "return" doesn't return anything
			// base
			return 1;
		}
		// Recursion 
		return numbers[index] * multiply(numbers, index + 1);
	}
}