package recursionTutorial;

public class RecursionTutorial {

	public static void main(String[] args) {
		// iteration to start and finish at as it goes out and comes back
		sayHi(6);
		
	}
	
	// recursive method
	private static void sayHi(int count) {
		System.out.println("Hi");
		
		//base statement "what it goes to, then back again"
		if(count <= 1) {
			return;
		}
		// control of the progression
		sayHi(count - 1);
	}
}
