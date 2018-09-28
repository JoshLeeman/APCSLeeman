
public class TextLab03v100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TextLab02, 100 Point Version\n");
		
		int a = 10000123;
		int b = a/3600000;
		int f = 10000123%3600000;
		int c = f/60000;
		int d = f%60000/10000;
		int e = f%600000%10000;
		
		System.out.println("Starting milli-seconds: " + a);
		System.out.println("Hours: " + b);
		System.out.println("Minutes: " + c);
		System.out.println("Seconds: " + d);
		System.out.println("Milli-seconds: " + e);
		
		
	}

}
