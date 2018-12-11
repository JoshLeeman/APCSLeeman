
public class Pumpkin {
	private double weight;
	private double pricePerPound = 0.25;
	private double sum;
	
public Pumpkin(double pounds) {
	weight = pounds;
}
public void setWeight(double w) {
	if(w>1000)
		weight = w;
		
}
public double getWeight() {
	return weight;
}
public void grow() {
	weight = weight + .5;
}

public double getPrice() {
	return pricePerPound;
}
public double getTotal() {
	return weight*pricePerPound;
}
public double getSum(double s) {
	sum = s;
	return sum;
}
}