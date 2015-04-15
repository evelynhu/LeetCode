package string;

public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
        	return "";
        } else if (strs.length ==1) {
        	return strs[0];
        }
        int i = 0;
        for (; i < strs[0].length(); i++){
        	char c = strs[0].charAt(i);
        	for (int j = 1; j < strs.length ; j++){
        		if (i > strs[j].length() -1 || c != strs[j].charAt(i)) {
        			return strs[0].substring(0, i);
        		}
        	}
        }
        return strs[0].substring(0, i);
    }
}
