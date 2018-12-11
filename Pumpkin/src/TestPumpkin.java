
public class TestPumpkin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pumpkin skinnyPumpkin = new Pumpkin (5);
		Pumpkin averagePumpkin = new Pumpkin(10);
		Pumpkin fatPumpkin = new Pumpkin(15);
	
		
		System.out.println("first Pumpkin's weight is " + skinnyPumpkin.getWeight());
		
		System.out.println("second Pumpkin's weight is " + averagePumpkin.getWeight());
		
		System.out.println("third Pumpkin's weight is " + fatPumpkin.getWeight());
		System.out.println();
		System.out.println("second Pumpkin's weight is " + averagePumpkin.getWeight());
		System.out.println("third Pumpkin's weight is " + fatPumpkin.getWeight());
		System.out.println("the total weight is " + (skinnyPumpkin.getWeight() + averagePumpkin.getWeight() + fatPumpkin.getWeight()));
		
		
	
	
	for(double i=1; i <4; i++) {
		skinnyPumpkin.grow();
		averagePumpkin.grow();
		fatPumpkin.grow();
	}

}
}
