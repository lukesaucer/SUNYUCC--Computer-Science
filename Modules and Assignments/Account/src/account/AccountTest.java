package account;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Account Holder Name");
		String theName = input.nextLine();
		
		// Create a Bank Account Object
		Account johnsAccount = new Account("John", 50.0);
		johnsAccount.deposit(100.0);
		Account suesAccount = new Account("Sue", 25.0);
		suesAccount.deposit(500.0);
		
		// Account myAccount = new Account(theName);
		
		// Set owner's name
		// myAccount.setName(theName);
		
		// Display Owner's Name
		System.out.printf("Account Created for %s%n",johnsAccount.getName());
		
		System.out.printf("John's Account Balance: $%.2f%n",johnsAccount.getBalance());
	}
		
	}
		
