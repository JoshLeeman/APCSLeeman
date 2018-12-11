
public class bigDiff {
	public static void main(String[] args) {

	    bigDiff test = new bigDiff();

	    System.out.println("The difference of the biggest and smallest values is " + test.bigDiff(new int[] {10, 3, 5, 6}));
	    System.out.println("The difference of the biggest and smallest values is " + test.bigDiff(new int[] {7, 2, 10, 9}));
	    System.out.println("The difference of the biggest and smallest values is " + test.bigDiff(new int[] {2, 10, 7, 2}));
	  }

	  public int bigDiff(int[] nums) {
	    int Min;
	    int Max;    
	    
	    if (nums.length > 1) {
	      int min = nums[0];
	      int max = nums[0];
	      
	      for (int i = 0; i < nums.length-1; i++) {
	        Min = Math.min(nums[i], nums[i+1]);
	        Max = Math.max(nums[i], nums[i+1]);
	        
	        if(Min < min) min = Min;
	        if(Max > max) max = Max;
	      }
	      
	      return max - min;
	    }
	    
	    return 0;
	  }
}
