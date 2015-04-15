package string;

public class Add_Binary {
    public static String addBinary(String a, String b) {
        String results ="";
        int carry = 0;
        int length = Math.max(a.length(), b.length());
        for (int i = 0; i < length; i++){
        	int rem = 0;
        	if (i < a.length()) {
        		rem = a.charAt(a.length() - 1 - i) - '0';
        	}
        	if (i < b.length()) {
        		rem += b.charAt(b.length() - 1 - i) - '0';
        	}
        	rem += carry;
        	carry = rem/2;
        	rem %= 2;
        	results = rem + results;
        }
        if (carry > 0) {
        	results = 1 + results;
        }
        return results;
    }
}
