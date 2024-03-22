package bank;

public class Account extends BankMain{
	
	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
		
	public Account(String firstName, String lastName, int accountID) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAccountID(accountID);
			
	}
	public Account() {
		this.setBalance(balance = 0.0);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
