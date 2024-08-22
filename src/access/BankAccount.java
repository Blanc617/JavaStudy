package access;

public class BankAccount {
	
	private int balance;

	public BankAccount(int balance) {
		balance = 0;
	}
	
	// public ¸Þ¼­µå : deposit
	public void deposit(int amount) {
		balance += amount;
	}
	

}
