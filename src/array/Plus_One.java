package array;

public class Plus_One {
    public static int[] plusOne(int[] digits) {
        int[] result = digits;
        for (int i = digits.length -1; i >=0; i--) {
        	if (digits[i] + 1 >= 10) {
        		result[i] = 0;
        	} else {
        		result[i] = digits[i] + 1;
        		return result;
        	}
        }
        int[] new_results = new int[digits.length + 1];
        new_results[0] = 1;
        for (int i = 1; i < digits.length; i++) {
        	new_results[i] = result[i-1];
        }
        return new_results;
    }
}
