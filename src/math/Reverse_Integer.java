package math;

public class Reverse_Integer {
    public static int reverse(int x) {
    	if (x < Integer.MIN_VALUE) {
    		return Integer.MIN_VALUE;
    	}
    	int res = 0;
    	int num = Math.abs(x);
    	while (num !=0) {
    		// check the boundary
    		if (res > (Integer.MAX_VALUE - num%10)/10) {
    			return 0;
    		}
    		res = res * 10 + num%10;
    		num /=10;
    	}
        return x > 0 ? res : -res;
    }
}
