package recursionProcduct;

import java.util.Scanner;

public class RecursionProduct {
	
	public static void main(String[] args) {
	
	
	multiply(5);
	
	
	
	}

	private static int multiply(int numbers) {
	Scanner scnr = new Scanner(System.in);
	System.out.println("need this");
	numbers = scnr.nextInt();
	
	
	if (numbers == 5) {
		return numbers;
		
	}
	return multiply(numbers - 1);	
	}
}