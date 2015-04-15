package string;

public class String_to_Integer {
    public static int atoi(String str) {
    	if (str == null || str.length() < 1) return 0;
    	
    	str = str.trim();
    	
        int result = 0;
        int i = 0;
        int flag = '+';
        if (str.charAt(0) == '-') {
        	flag = '-';
        	i++;
        } else if (str.charAt(0) == '+'){
        	i++;
        }
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
        	if (Integer.MAX_VALUE/10 < result ||
        			Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE%10 < str.charAt(i) - '0') {
        		return flag == '-' ? Integer.MIN_VALUE  : Integer.MAX_VALUE;
        	}
        	result = result * 10 + (str.charAt(i) - '0');
        	i++;
        }
        if (flag == '-') {
        	return -result;
        }

        return result;
    }
}
