import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i < numArray.length; i++)
			System.out.print(numArray[i] + " ");
		System.out.println();
		System.out.print(does6Exist(numArray));
		
		
		int[] reverseArray = reverse(numArray);
		for(int i = 0; i<numArray.length; i--)
			 System.out.println(numArray[i]);
	}
		 public static boolean does6Exist(int[] testArray) {
			 boolean exists = false;
			 for(int x = 0; x < testArray.length; x++) {
				 System.out.print(testArray[x]);
				 
				 if(testArray[x] == 6) {
					exists = true;
					System.out.println("found");
				 }
				 else {
					 exists = false;
				 }
			 }
			 return exists;

	
	
}
		 //write a method that reverses the items in the array
		 public static int[] reverse(int[] array) {
			 int[] reversedArray = new int[array.length];
			 for(int i = 0;i< array.length; i++) {
				 System.out.print(reversedArray[array.length-1]);
				 reversedArray[array.length-i-1] = array[i];
		 }
			return array;
		 }
		 
}