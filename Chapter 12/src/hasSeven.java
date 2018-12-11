public class hasSeven {
	public static void main(String[] args) {

		hasSeven(1, 7, 7);
	}

	public boolean hasSeven(int[] nums) {
		boolean exists = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7 && nums[i + 1] == 7)
				return true;
			if (nums[i] == 7 && nums[i + 2] == 7)
				return true;
		}
		return false;
	}
}