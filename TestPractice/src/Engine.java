
public class Engine {

	private int horsePower;
	public Engine(int hp) {
		horsePower = hp;

	}

}
public class Car
{
	String type;
	Engine engine;
	
	public Car(String t, int hp) {
		type = t;
		engine = new Engine(hp);
	}
}
