package assignments.Assignment_14_OOP;

public class Question_11 {

	public static void main(String[] args) {
		
	}

}

class BankAccount{
	
	double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public BankAccount(double interestRate) {

		this.interestRate = interestRate;
	}
	
	
	
}
class SavingAccount extends BankAccount{
	
	public SavingAccount(double interestRate) {
		super(interestRate);

	}

	
	
	
}

