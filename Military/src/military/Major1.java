package military;

public class Major1 extends General{

	private String major = "I report to the General";
	

	public String getMajor1() {
		return major;
	}	
	
	@Override
	public String rank() {
		return major;
	}	
}
