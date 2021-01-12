package entities;

public class Account {
	private int accountNumber;
	private String holderName;
	private double balance;
	
	public Account() {
	}

	public Account(int accountNumber, String holderName, double intialDeposit) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		deposit(intialDeposit);
	}
	
	public Account(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.00;
	}
	
	public String toString() {
		return accountNumber
			+", Holder: "
			+ holderName
			+", Balance: $ "
			+ String.format("%.2f", balance);
	}
}
