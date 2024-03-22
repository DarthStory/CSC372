package bank;

public class Checking extends Account{

	double interest = .01;
	double overdraft = 30.00;
		
		
	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	public double processWithdrawl() {
		double fee = balance - overdraft;
		return fee;
	}
	
	public void displayAccount() {
		return;
	}
	@Override
	public String toString() {
		return firstName + " " 
				+ lastName + " " 
				+ accountID + " " 
				+ balance + " " 
				+ interest;
	}
}
