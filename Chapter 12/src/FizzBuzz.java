public class FizzBuzz {
	public static void main (String[] args) {
		fizzBuzz(1,60);
	}

	public static String[] fizzBuzz(int start, int end) {
		int size = end - 1;
		String[] fizzBuzz = new String[size];
		for (int i = start - 1; i < end-1; i++) {
			System.out.print(fizzBuzz[i] + " ");

			if ((i + 1) % 3 == 0 && (i+1) % 5 == 0) {
				System.out.println("FizzBuzz3");
			} else if ((i + 1) % 5 == 0) {
				System.out.println("Buzz");
			} else if ((i + 1) % 3 == 0) {
				System.out.println("Fizz");
			} else {
				fizzBuzz[i] = String.valueOf(i + 1);
				System.out.println (fizzBuzz[i]);
			}

		}
		return fizzBuzz;
	}
}