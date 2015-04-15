package bitManipulation;

public class Number_of_1Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int m1 = 0x55555555; //binary: 0101...
        int m2 = 0x33333333; //binary: 0011...
        int m4 = 0x0f0f0f0f; //binary: 4 zeros, 4 ones
        int m8 = 0x00ff00ff; //binary: 8 zeros, 8 ones
        int m16 = 0x0000ffff; //binary: 16 zeros, 16 ones
        
        n = ( n & m1 ) + ( n>>1 & m1 );
        n = ( n & m2 ) + ( n>>2 & m2 );
        n = ( n & m4 ) + ( n>>4 & m4 );
        n = ( n & m8 ) + ( n>>8 & m8 );
        n = ( n & m16 ) + ( n>>16 & m16 );
        return n;
    }
}
