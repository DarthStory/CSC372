package bank;

public class BankMain {

	public static void main(String[] args) {
		// create the checking account method
		CheckingAccount checking = new CheckingAccount();
		
		//initialize variables
		checking.setFirstName("David");
		checking.setLastName("Owen");
		checking.setAccountID(12345);
		
		// print variables and call methods
		System.out.println(checking.getFirstName());
		System.out.println(checking.getLastName());
		System.out.println(checking.getAccountID());
		System.out.println(checking.getBalance());
		System.out.println();
		checking.accountSummary();
		checking.displayAccount();
		
		
		
		
	}

}
