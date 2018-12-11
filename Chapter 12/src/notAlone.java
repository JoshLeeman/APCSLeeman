
public class notAlone {
	public static void main (String[] args) {
		notAlone test = new notAlone();
		System.out.println(test.notAlone(new int[] {1,2,3},2));
	}
	public int[] notAlone(int[] nums, int val) {
	    int[] array = new int[nums.length];
	    
	    
	                  
	    for(int i = 1; i < nums.length - 1; i++) {
	        if(nums[i] == val && nums[i] != nums[i-1] && nums[i] != nums[i+1])
	            array[i] = Math.max(nums[i-1], nums[i+1]);
	        else
	            array[i] = nums[i];
	    }
	                                            
	    return array;
	}
}
