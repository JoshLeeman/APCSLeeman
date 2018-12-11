
public class tenRun {
	public static void main(String[] args) {
		tenRun(2, 10, 3, 4, 20, 5);
	}

	public int[] tenRun(int[] nums) {
		int current;
		int i = 0;

		while (i < nums.length && nums[i] % 10 != 0)
			i++;

		if (i >= nums.length)
			return nums;

		current = nums[i];
		i++;

		while (i < nums.length) {
			if (nums[i] % 10 == 0)
				current = nums[i];
			else
				nums[i] = current;
			i++;
		}

		return nums;
	}
}