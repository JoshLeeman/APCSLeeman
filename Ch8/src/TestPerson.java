
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person defaultPerson = new Person();
		String fn = defaultPerson.firstName;
		String ln = defaultPerson.secondName;
		System.out.println(fn + " " + ln);
		
		Person evan = new Person("Evan", "Spector", 17);
		System.out.println(evan.firstName + " "+ evan.secondName + " "+ evan.age);
		System.out.println("evan's age is: " +evan.increaseAge(10));
		
		Student noa = new Student("Noa", "Rogoszinski", 17);
		System.out.println(noa.firstName + " "+ noa.secondName + " "+ noa.age + " " +noa.id + " "+noa.gpa);
		
		Student josh = new Student("Josh", "Leeman", 17, 12345,6.0);
		System.out.println(josh.firstName + " "+ josh.secondName + " "+ josh.age + " " +josh.id + " "+josh.gpa);
	}
	

}
