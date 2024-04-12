package military;

public abstract class General {

	static void command() {
		System.out.println("General: \"I report to the President himself!\"");
	}
	public abstract String rank();
	
	
	@Override
	public String toString() {
		return rank();
	}
}
