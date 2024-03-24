package learningInterfaces;

public class Nurse implements Surgery, DrawsBlood{

	
	@Override
	public void blood() {
		System.out.println("Draws blood");
		
	}

	
	@Override
	public void operates() {
		System.out.println("Helps the surgeon.");
		
	}

		
}
