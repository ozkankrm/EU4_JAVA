package javaeu4.day33_classObjet_Constructors;

public class BankAccount {
	
	//instance variable
	double balance;
	
	// This constructor sets the starting balance to 0.0
	public BankAccount() {
		balance = 0.0;
	}
	
	//This constructor sets the starting balance to the value passes as an argument
	public BankAccount(double startBalance) {
		balance = startBalance;
	}
	
	//This constructor sets the starting balance to the value in the String argument
	//String i parse ile integer �evir
	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}

	//Deposit method make a deposit into account
	public void deposit(String str) {
		balance = balance + Double.parseDouble(str);
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	
}
