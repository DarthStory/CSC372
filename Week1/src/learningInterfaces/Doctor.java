package learningInterfaces;

public class Doctor implements Surgery{

	// method for using the operates method in the Surgery interface
	@Override
	public void operates() {
		System.out.println("Doctor cuts open patient");
	}
}
