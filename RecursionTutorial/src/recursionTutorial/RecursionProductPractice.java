package recursionTutorial;

import java.util.Scanner;

public class RecursionProductPractice{
	
	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Enter 5 numbers: ");
		
		
				for (int i = 0; i < 5; i++) {
					System.out.print("Number " + (i + 1) + ": ");
					numbers[i] = scnr.nextInt();
				}
				
		
		int product = multiply(numbers, 0);
		System.out.println("The product of the numbers is: " + product);
	}
				public static int multiply(int[] numbers, int index) {
					if(index >= numbers.length) {
						return 1;
					}
					return numbers[index] * multiply(numbers, index + 1);
	}
}