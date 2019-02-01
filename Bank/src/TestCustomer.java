
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer leeman = new Customer("Josh", "Leeman", 1000);
		Account leemanAccount = leeman.getAccount();
		leeman.getAccount().deposit(500);
		leeman.getAccount().withdraw(100);
		System.out.println(leeman.getFirstName()+" balance is "+leeman.getAccount().getBalance());
		
		Customer Noa = new Customer("Noa", "Rogoszinski", 500);
		Account NoaAccount = Noa.getAccount();
		
		NoaAccount.deposit(1000);
		NoaAccount.withdraw(10);
		System.out.println(Noa.getFirstName()+" balance is "+NoaAccount.getBalance());
		
		
	}

}
