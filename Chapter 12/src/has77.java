public class has77{
	public static void main (String[] args){
		
		has77 test = new has77();
		System.out.println(test.has77(new int[] {1,7,7}));
		System.out.println(test.has77(new int[] {1,7,1,7}));
		System.out.println(test.has77(new int[] {1,7,1,1,7}));
  }

public boolean has77(int[] nums) {
  boolean exists = false;
  for(int i=0; i<nums.length-1; i++) {
	  if(nums[i] ==7 && nums[i+1] ==7)
		  return true;
	  if(nums[i] ==7 && nums[i+2] ==7)
		  return true;
  }
  return false;
}
}