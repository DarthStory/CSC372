package military;

public class ToArms {

	public static void main(String[] args) {
		President president = new President();
		General general = new General();
		Major1 major1 = new Major1();
		Major2 major2 = new Major2();
		Lieutenant1 lieutenant1 = new Lieutenant1();
		Lieutenant2 lieutenant2 = new Lieutenant2();
		Lieutenant3 lieutenant3 = new Lieutenant3();
		Lieutenant4 lieutenant4 = new Lieutenant4();
		LieutenantA lieutenantA = new LieutenantA();
		LieutenantB lieutenantB = new LieutenantB();
		LieutenantC lieutenantC = new LieutenantC();
		LieutenantD lieutenantD = new LieutenantD();
		
		president.callToArms();
		
		general.announceRank();
		major1.announceRank();
		major2.announceRank();
		lieutenant1.announceRank();
		
	}

}
