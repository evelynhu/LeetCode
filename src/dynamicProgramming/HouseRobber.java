package dynamicProgramming;

public class HouseRobber {
    public static int rob(int[] num) {
    		if (num == null || num.length < 1) return 0;
    		if (num.length == 1) return num[0];
        int[] result = new int[num.length];
        result[0] = num[0];
        result[1] = Math.max(num[0], num[1]);
        for (int i = 2; i < num.length; i++) {
        		result[i] = Math.max(result[i-1], result[i-2] + num[i]); 
        }
        return result[num.length-1];
    }
    public static int robDebug(int[] num) {
		if (num == null || num.length < 1) return 0;
		if (num.length == 1) return num[0];
	    int[] result = new int[num.length];
	    result[0] = num[0];
	    System.out.println("[0] : " + result[0]);
	    result[1] = Math.max(num[0], num[1]);
	    System.out.println("[1] : " + result[1]);
	    for (int i = 2; i < num.length; i++) {
	    		result[i] = Math.max(result[i-1], result[i-2] + num[i]); 
	    		System.out.println("["+i+"] : " + result[i]);
	    }
	    return result[num.length-1];
	}
}
