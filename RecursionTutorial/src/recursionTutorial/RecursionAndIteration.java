package recursionTutorial;

public class RecursionAndIteration {

	public static void main(String[] args) {
		
		System.out.println(factorial(4));
	}
	
	private static int factorial(int num) {
		if(num < 1) return 1;
		return num * factorial(num -1);
	}
}
