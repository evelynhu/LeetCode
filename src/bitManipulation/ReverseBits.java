package bitManipulation;

public class ReverseBits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
    		int[] bits = new int[Integer.SIZE];
        int result = 0;

        if (n < 0) {
        		n = n ^ Integer.MIN_VALUE;
        		bits[bits.length - 1] = 1;
        }
        for (int i = 0; i < bits.length -1; i++) {
        		bits[i] = n % 2;
        		n/=2;
        }
        for (int i = 1; i < bits.length; i++) {
        		result <<= 1;
        		result += bits[i];
        }
        
        return bits[0] == 1 ? result | Integer.MIN_VALUE : result;
    }
    public static int reverseBitsDebug(int n) {
		int[] bits = new int[Integer.SIZE];
		System.out.println("Integer.SIZE : " + Integer.SIZE);
	    int result = 0;
	
	    if (n < 0) {
	    		System.out.println("original : " + n);
	    		n = n ^ Integer.MIN_VALUE;
	    		System.out.println("XOR min : " + n);
	    		bits[bits.length - 1] = 1;
	    		System.out.println("[" + (bits.length - 1) + "] : "+ 1);
	    }
	    for (int i = 0; i < bits.length -1; i++) {
	    		bits[i] = n % 2;
	    		n/=2;
	    		System.out.println("[" +i+"] : " + bits[i]);
	    }
	    for (int i = 1; i < bits.length; i++) {
	    		result <<= 1;
	    		result += bits[i];
	    		System.out.println("result : " + result);
	    }
	    System.out.println("final result : " + result);
	    
	    //return bits[0] == 1 ? result | Integer.MIN_VALUE : result;
	    if (bits[0] == 1) {
	    		result |= Integer.MIN_VALUE; 
	    		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
	    }
	    System.out.println("return : " + result);
	    return result;
	}
}
