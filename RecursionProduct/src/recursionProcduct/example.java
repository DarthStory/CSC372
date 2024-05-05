package recursionProcduct;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
    
    public static void main(String[] args) {
    
        Scanner scnr = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = getInputInt(scnr);
        }
        scnr.close();
        int product = multiply(numbers, 0);
        System.out.println("The product of the numbers is: " + product);
    }
    
    public static int getInputInt(Scanner scnr) {
        while(true) {
            try {
                System.out.print("Next number: ");
                int number = scnr.nextInt();
                if (number >= 0) {
                    return number;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter in a valid number.");
                scnr.nextLine();
            }
        }
    }
    
    public static int multiply(int[] numbers, int index) {
		if(index >= numbers.length) {
			return 1;
		}
		return numbers[index] * multiply(numbers, index + 1);
	}
}
