package array;

public class Rotate_Array {
    public static void rotate(int[] nums, int k) {
    	k %= nums.length;
    	reverse(nums, 0, nums.length -1);
    	reverse(nums, 0, k-1);
    	reverse(nums, k, nums.length -1);
    }
    private static void reverse(int[] nums, int i, int j) {
    	while (i < j) {
    		int temp = nums[i];
    		nums[i] = nums[j];
    		nums[j] = temp;
    		i++;
    		j--;
    	}
    }
}
