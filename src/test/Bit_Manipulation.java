package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bitManipulation.Number_of_1Bits;
import bitManipulation.ReverseBits;

public class Bit_Manipulation {
	@Test
	public void testNumberof1Bits() {
		assertEquals(3, Number_of_1Bits.hammingWeight(11));
	}
	@Test
	public void testReverseBits() {
		assertEquals(Integer.MIN_VALUE, ReverseBits.reverseBits(1));
		assertEquals(964176192, ReverseBits.reverseBits(43261596));
		assertEquals(1, ReverseBits.reverseBits(-2147483648));
		assertEquals(-2147483647, ReverseBits.reverseBitsDebug(-2147483647));
	}
}
