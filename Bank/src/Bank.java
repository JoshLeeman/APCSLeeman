
public class Bank {
	private Customer[] customers = new Customer[100];
	private int numberOfCustomers;
	
	public Bank() {
		numberOfCustomers = 0;
	}
	public void addCustomer(String f, String l, double initBalance) {
		Customer c = new Customer(f, l, initBalance);
		customers[numberOfCustomers] = c;
		numberOfCustomers = numberOfCustomers + 1;
		
	}
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
