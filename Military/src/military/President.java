package military;

public class President extends MilitaryMight{

	@Override
	public void announceRank() {
		System.out.println("I am the President!");
		
	}
	public void callToArms() {
		announceRank();
	}
	
}
