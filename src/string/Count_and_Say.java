package string;

public class Count_and_Say {
    public static String countAndSay(int n) {
        String str = "1";
        int count = 1;
        int round = 0;
        int i = 1;
        StringBuffer sb = new StringBuffer("1");
        while (++round < n) {
        	count = 1;
        	sb.setLength(0);
            for (i = 1; i < str.length(); i++) {
            	if (str.charAt(i) == str.charAt(i-1)) {
            		count++;
            	} else {
            		sb.append(count).append(str.charAt(i-1));
            		count = 1;
            	}
            }
            sb.append(count).append(str.charAt(i-1));
            str = sb.toString();
        }
        return sb.toString();
    }
}
