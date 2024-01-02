package bank;

import java.io.Serializable;

public class Account implements Serializable{

	private int accountNum;
	private String firstName;
	private String lastName;
	private double balance;

    public Account()
    {
    	this(0, "", "", 0.0);
    }
    
    public Account(int accountNum, String firstName,
    		       String lastName, double balance) {
    	this.setAccountNum(accountNum);
    	this.setFirstName(firstName);
    	this.setLastName(lastName);
    	this.setBalance(balance);
    }

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
