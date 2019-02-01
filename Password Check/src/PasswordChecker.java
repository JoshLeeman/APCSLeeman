import java.util.Scanner;
public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your password");
		String password = input.nextLine();
		if(password.equals("APCS2019")) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Wrong Password - Try Again");
			System.out.println("Enter your password");
			 password = input.nextLine();
		}
	}

}
