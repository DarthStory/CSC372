package bank;

public class CheckingAccount extends BankAccount{

	// variables
	double amount = 30.00;
	double interest = .01;
	double overdraft = 30.00;
	double fee;
	
	// getter
	public double getInterest() {
		return interest;
	}
	
	// setter
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	// getter
	public double getOverdraft() {
		return overdraft;
	}
	
	// setter
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	// processWithdrawl method that has 2 outcomes, one if balance is = or greater than 0, the other if negative. 
	public String processWithdrawl() {
		balance = balance - amount;
		if (balance < 0) {
			balance = balance - overdraft;
			return "\nAccount overdrawn, Overdraft fee added. Balance: " + dF.format(balance);
		}else {
			return "\nBalance: " + dF.format(balance);
		}
	}
	
	// Overrides the BankAccount class
	@Override
	public void accountSummary() {
		System.out.print("First Name: " + firstName 
				+ "\nLast Name: " + lastName 
				+ "\nAccount ID: " + accountID 
				+ "\nBalance: " + dF.format(balance) 
				+ "\nAmount withdrawn: " + dF.format(amount));
		System.out.print(processWithdrawl() + "\n");
		System.out.println();
	}
	
	// Overrides the BankAccount class. 
	@Override
	public void displayAccount() {
		super.displayAccount();
		System.out.println("\nInterest: " + interest);
		System.out.println();
	}
	
	
}
