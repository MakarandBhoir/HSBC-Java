package test09;
public class Account {
	private double balance;
	
	public Account(double initBalance) {
		balance = initBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amt) {
		balance = balance + amt;
	}
	public void withdraw(double amt) {
		if(amt > balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance = balance - amt;
		}
	}
}
