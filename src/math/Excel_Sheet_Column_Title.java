package math;

public class Excel_Sheet_Column_Title {
    public static String convertToTitle(int n) {
    	String result = "";
        while (n > 0) {
        	String ch = Character.toString ((char)('A' + (n - 1) % 26));
        	result = ch + result;
            n = (n - 1) / 26;     	
        }
        return result;
    }
}
