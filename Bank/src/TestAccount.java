
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account(100);
		System.out.println("Initial balance: $" +myAccount.getBalance());
		
		System.out.println("---Deposit $50---");
		myAccount.deposit(50);
		System.out.println("Balance after deposit: $" +myAccount.getBalance());
		
		System.out.println("---Withdraw $147---");
		myAccount.withdraw(147);
		System.out.println("Balance after withdrawal: $" + myAccount.getBalance());
	}

}
