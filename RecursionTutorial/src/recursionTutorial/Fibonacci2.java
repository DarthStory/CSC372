package recursionTutorial;

public class Fibonacci2 {
	// for memoization
	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		
		int n = 50;
		// to do "memoization", where you remember the calculations you did, so you do not have to do 
		// them again. 
		fibonacciCache = new long[n + 1];
		
		System.out.println(fibonacci(n));
		
		// prints the list fibonacci
		for(int i = 0; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		

	}

	private static long fibonacci(int n) {
		
		// base to stop infinite run
		if (n <= 1) {
			return n;
		}
		// we cannot start on 0
		if (fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		// creates the long array to store the calculations
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		fibonacciCache[n] = nthFibonacciNumber;
		// returns the numbers
		return nthFibonacciNumber;
		
		
	}

}
