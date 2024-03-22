package bank;


public class BankMain {

	public static void main(String[] args) {
		Checking checking = new Checking();
		
		checking.setFirstName("David");
		checking.setLastName("Owen");
		checking.setAccountID(12345);
		
		System.out.println(checking.getFirstName());
		System.out.println(checking.getLastName());
		System.out.println(checking.getAccountID());
		System.out.println(checking.getBalance());
		
		System.out.println(checking.processWithdrawl());
		checking.displayAccount();
		
		
		
		
	}

}
