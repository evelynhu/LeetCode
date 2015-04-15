package math;

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
    	if (x < 0) return false;
    	int div = 10;
    	while (x/div >9) {
    		div*=10;
    	}
    	
    	while (x > 9) {
    		if(x/div != x%10) {
    			return false;
    		}
    		x = x%div/10;
    		div/=100;
    		if(div!=0 && x/div == 0 && x%10 !=0) return false;
    	}
        return true;
    }
}
