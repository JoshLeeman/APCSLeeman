
import java.util.ArrayList;
public class ArrayPractice {

		public static void main(String[] args) {   
		 
		       int list[]= new int[]{1,2,3,4,5};
		       int sum = 0;
		       for(int i=0; i < list.length ; i++)
		        sum = sum + list[i];
		        double average = sum / list.length;
		        System.out.println("Average value of the array elements is : " + average); 
		
		          
		        
		        
		        
		        int[] num = {1, 2, 3, 4, 5};
		            int toFind = 3;
		            boolean found = false;

		            for (int n : num) {
		                if (n == toFind) {
		                    found = true;
		                    break;
		                }
		            }

		            if(found) 
		                System.out.println(toFind + " is found.");
		            
		            else 
		                System.out.println(toFind + " is not found.");
		            

		            

		            ArrayList arrList = new ArrayList();

		    		//adding elements in the list
		    		arrList.add("100");
		    		arrList.add("200");
		    		arrList.add("300");
		    		arrList.add("400");
		    		arrList.add("500");

		    		//searching element "300"
		    		int index = arrList.indexOf("300");
		    		if(index == -1)
		    			System.out.println("Element is not found in the list");
		    		else
		    			System.out.println("Element found @ index: " + index);
		    	}
		
}