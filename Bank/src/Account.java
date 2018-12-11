
public class Account {
	private double deposit;
	protected double balance;
	private double initBalance;
	
public Account (double initialBalance) {
		balance = initBalance;
	}
public double getBalance() {
	return balance;
}
public void deposit(double amt) {
	balance = balance + amt;
}
public boolean withdraw(double amt) {
	if((balance-amt) < 0) {
		return false;
	}
	else {
			balance = balance - amt;
			return true;
	}
}
}
