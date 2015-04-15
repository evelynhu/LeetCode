package math;

public class Excel_Sheet_Column_Number {
    public static int titleToNumber(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
        	result = (int) ((s.charAt(i) - 'A' + 1) * Math.pow(26, s.length() - 1 - i) + result);
        }
    	return result;
    }
}
