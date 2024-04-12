package military;

public class Major2 extends General{

	private String major = "Major1: I report to the General";
	
	public String getMajor2() {
		return major;
	}
	@Override
	public String rank() {
		return major;
	}
}
