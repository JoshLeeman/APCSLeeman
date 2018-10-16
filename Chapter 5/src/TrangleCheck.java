import java.util.Scanner;

import java.util.Scanner;

public class TrangleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Number  ===>>  ");										
		int number1 = input.nextInt(); //Grabs the first input from keyboard
		System.out.print("Enter 2nd Number  ===>>  ");										
		int number2 = input.nextInt(); //Grabs the number from the second line
		System.out.print("Enter 3rd Number  ===>>  ");
		int number3 = input.nextInt();
		
		int a = number1;
		int b = number2;
		int c = number3;
		
		if(a==b && a==c) {
			System.out.println("The triangle is equilatoral");
		}
		else if(a==b || b==c || a==c) {
			System.out.println("The traingle is iscosceles.");
		}
		else {
			System.out.println("The traingle is scalene.");
		}
	}

}
