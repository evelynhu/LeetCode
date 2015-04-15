package string;

public class Implement_strStr {
	public static int strStr(String haystack, String needle) { 
		int len_h = haystack.length();
		int len_n = needle.length();
		for (int i = 0; i < len_h - len_n + 1; i++) {
			if(haystack.substring(i, i+len_n).equals(needle)) return i;
		}
		
		return -1;
	}
    public static int strStr_KMP(String haystack, String needle) { // TODO
    	int len_h = haystack.length();
    	int len_n = needle.length();
    	if (len_n == 0) return 0;
    	if (haystack == null || needle == null || len_h == 0) {
    		return -1;
    	}
    	int[] next = new int[len_n + 1];
    	getNext(needle, next);
    	int i = 0, j = 0;
    	while (i < len_h) {
    		while (j > -1 && needle.charAt(j) != haystack.charAt(i)) {
    			j = next[j];
    		}
    		i++;
    		j++;
    		if (j == len_n) {
    			return i-j;
    		}
    	}
        return -1;
    }
    private static void getNext(String str, int[] next) {
    	int i = 0, j = next[0] = -1;
    	int n = next.length;

    	while (i < n-1) {
    		while (j > -1 && str.charAt(j) != str.charAt(i)) {
    			j = next[j];
    		}
    		i++;
    		j++;
    		if (i < n-1 && j < n - 1 && str.charAt(j) == str.charAt(i)) {
    			next[i] = next[j];
    		} else {
    			next[i] = j;
    		}
    	}
    }
}
