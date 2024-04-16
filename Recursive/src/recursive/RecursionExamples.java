package recursive;






import java.util.Scanner;

/**
 *
 * @author Producer
 */
public class RecursionExamples {
        static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //use recursion to print a list in reverse order
        int[] numList = {10,20,30,40,50};
        reversePrint(numList);
        System.out.println("");
        
        //use recursion to find the factorial of a number
//        System.out.println("Enter a number for the factorial problem: ");
//        int f = in.nextInt();
//        System.out.println("Factorial of 5 is: "+factorial(f));
        
        //call GCD
//        System.out.println("Enter two numbers and I'll find the GCD");
//        int x = in.nextInt();
//        int y = in.nextInt();
//        System.out.println(Greatest(x,y));
        
    }
    private static void reversePrint(int[] numbers)
    {
    	// if the length of the array is equal to 0, then return;
        if(numbers.length == 0)
        	return;
        // if not, we want to recall reverse print that is not 0, it has to be one less since we are taking out the first value. (base)
        int[] a = new int[numbers.length - 1];
        // copy the values into a
        for(int i = 0; i<numbers.length-1; i++)
        	// the new array is equal to 1
        	a[i] = numbers[i=1];
        // call reverse print, passing the new array. 
        reversePrint(a);
        // print out the value in the numbers array. 
        System.out.println(numbers[0]+" ");
        // the reverse print will call itself until there are no more items, 
        // then it will go back in all the items in the array and print 
        // them out until it gets back to the first item. 

    }
 //   private static int factorial(int b)
    {
       
    }
    /*
    Greatest Common denominator recursive function
    based on Euclid
    */
 //   private static int Greatest(int a, int b)
    {
       
    }
    
}
