
public class MultipleSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade = 55;
		if (grade >= 90) {
			System.out.println("My grade is an A");
			
		}
		else if(grade < 90 && grade >=80) {
			System.out.println("My grade is a B");
		}
		else if(grade < 80 && grade >= 70) {
			System.out.println("My grade is a C");
		}
		else if(grade < 70 && grade >= 60) {
			System.out.println("My grade is a D");
		}
		else {
			System.out.println("My grade is an F");
	}

}
}