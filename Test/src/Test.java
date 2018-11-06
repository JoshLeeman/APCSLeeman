//import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*boolean ans = isEven(10);
		System.out.println(ans);
		
		ans = isEven(7);
		System.out.println(ans);
		System.out.println(isEven(15));
		for(int i=0; i < 10; i++) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println(number + " is even: " +isEven(number));
		
	
	}
	}
	
	
	//defining whether a number is even or not.
	public static boolean isEven(int num) {
		boolean even = false;
		
		if(num % 2==0)
			even = true;
		else
			even = false;
		return even;
	}
*/
	}
//count the number of even numbers between 1 and user input.
		public static void fizzBuzz() {
		for(int i = 1; i <=100; i++) {
			if(i%3==0 && i%5!=0)
				System.out.println(i + " -Fizz");
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Buzz");
			}
			else if (i%5==0){
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
		}
		}
	}



