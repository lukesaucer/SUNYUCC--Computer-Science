package account;

public class Account {
	private String name; // instance variable
	private double balance; // stores the account balance
	
	
	// Constructor
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double depositAmount) {
		if (balance > 0.0)
			balance = balance + depositAmount;
	}
	
	/* setter */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/* getter */
	
	public String getName() {
		return name;
		
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
