
public class Person {
	
	String firstName;
	String secondName;
	int age;
	
		//constructor
	public Person() {
		firstName = "John";
		secondName = "Doe";
		age = 39;
	}
	//second constructor where I can create a person with first, last, and age.
	public Person(String fn, String ln, int a) {
		firstName = fn;
		secondName = ln;
		age = a;
	}
	
	//methods
	public int increaseAge(int incAmt) {
		age = age + incAmt;
		return age;
	}
}
