
public class Savings extends Account {

	private double interestRate;

	public Savings(double balance, double rate) {
		super(balance + (balance * rate));
		interestRate = rate;
	}

}
