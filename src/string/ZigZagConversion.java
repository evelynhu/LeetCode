package string;

public class ZigZagConversion {
    public static String convert(String s, int nRows) {
    		if (s == null || s.length() < 1 || nRows < 1) {
    			return "";
    		}
    		if (nRows == 1) {
    			return s;
    		}
    		StringBuilder sb = new StringBuilder();
    		int size = 2 * nRows - 2;
    		for (int i = 0; i < nRows; i++) {
    			for (int j = i; j < s.length(); j+=size) {
    				sb.append(s.charAt(j));
    				if (i!=0 && i!=nRows -1) {
    					int k = j + size - 2 * i;
    					if ( k < s.length()) {
    						sb.append(s.charAt(k));
    					}
    				}
    			}
    		}
    		return sb.toString();
    }
        
}
