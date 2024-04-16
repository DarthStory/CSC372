package bank;

import java.text.DecimalFormat;

public class BankAccount extends BankMain{
	
	// set decimal format to help readability
	DecimalFormat dF = new DecimalFormat("#0.00");
	
	// set variables
	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
	
	
	// constructor
	public BankAccount(String firstName, String lastName, int accountID) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAccountID(accountID);
			
	}
	// setter
	public BankAccount() {
		this.setBalance(balance = 10.20);
	}
	// getter
	public String getFirstName() {
		return firstName;
	}
	// setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	// getter
	public String getLastName() {
		return lastName;
	}
	// setter
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	// getter
	public int getAccountID() {
		return accountID;
	}
	// setter
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	// getter
	public String getBalance() {
		return dF.format(balance);
	}
	// setter
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// method for accountSummary
	public void accountSummary() {
		System.out.print(firstName + " " 
				+ lastName + " " 
				+ accountID + " " 
				+ dF.format(balance) + " ");
	}
	// method for display account
	public void displayAccount() {
		System.out.print("First Name: " + firstName 
				+ "\nLast Name: " + lastName 
				+ "\nAccount ID: " + accountID 
				+ "\nBalance: $"	+ dF.format(balance) + " ");
	}
	
}
