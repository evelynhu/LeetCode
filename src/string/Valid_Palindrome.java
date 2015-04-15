package string;

public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
        	return true;
        }
        s = s.toUpperCase();
        int start = 0, end = s.length() -1;
        while (start < end) {
        	if (!Character.isLetterOrDigit(s.charAt(start))) {
        		start++;
        		continue;
        	}
        	if (!Character.isLetterOrDigit(s.charAt(end))) {
        		end--;
        		continue;
        	}
        	if (s.charAt(start) != s.charAt(end)) {
        		return false;
        	} else {
        		start++;
        		end--;
        	}
        }

        return true;
    }
}
