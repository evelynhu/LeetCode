package string;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        if(s == null || s.length() < 1){
        		return 0;
        }
        String[] strs = s.split(" ");
        if(strs == null || strs.length < 1){
	    		return 0;
	    }
        return strs[strs.length-1].length();
    }
}
