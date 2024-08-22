package access;

public class BankAccount {
	
	private int balance;

	public BankAccount() {
		balance = 0;
	}
	
	// public �޼��� : deposit �Ա�
	public void deposit(int amount) {
		if(isAmountValid(amount)) {
		balance += amount;
		}else {
			System.out.println("��ȿ���� ���� �ݾ��Դϴ�.");
		}
	}
	
	// public �޼��� : withdraw ���
	public void withdraw(int amount) {
		if(isAmountValid(amount) && balance - amount >= 0) {
			balance -= amount;
		}else {
			System.out.println("��ȿ���� ���� �ݾ��̰ų� �ܾ��� �����մϴ�.");
		}
	}
	
	// getBalance �ܰ�
	public int getBalance() {
		return balance;
	}
	
	private boolean isAmountValid(int amount) {
		// �ݾ��� 0���� Ŀ����
		return amount > 0;
	}
	
	
	

}
