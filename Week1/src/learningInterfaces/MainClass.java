package learningInterfaces;

public class MainClass {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor();
		Nurse nurse = new Nurse();
		
		doctor.operates();
		nurse.blood();
		nurse.operates();
	}
}
