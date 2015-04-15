package math;

public class Factorial_Trailing_Zeroes {
    public static int trailingZeroes(int n) {
    	int result = 0;
        for (int i=5; (n/i)>=1;) {
        	result += n / i;
            n /= 5;
        }
    	return result;
    }
}
