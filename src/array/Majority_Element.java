package array;

import java.util.Arrays;

public class Majority_Element {
    public static int majorityElement(int[] num) {
    	Arrays.sort(num);
    	return num[num.length/2];
    }
}
