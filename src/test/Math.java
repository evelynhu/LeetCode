package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import math.Palindrome_Number;
import math.Reverse_Integer;
import math.Excel_Sheet_Column_Number;
import math.Excel_Sheet_Column_Title;
import math.Factorial_Trailing_Zeroes;

import org.junit.Test;

public class Math {
	@Test
	public void testFactorialTrailingZeroes() {
		assertEquals(452137076, Factorial_Trailing_Zeroes.trailingZeroes(1808548329));
	}
	@Test
	public void testExcelSheetColumnTitle() {
		assertEquals("JQ", Excel_Sheet_Column_Title.convertToTitle(277));
	}
	@Test
	public void testExcelSheetColumnNumber() {
		assertEquals(26, Excel_Sheet_Column_Number.titleToNumber("Z"));
	}
	@Test
	public void testPalindromeNumber() {
		assertTrue(!Palindrome_Number.isPalindrome(1000021));
		assertTrue(Palindrome_Number.isPalindrome(1200021));
		assertTrue(Palindrome_Number.isPalindrome(11));
		assertTrue(Palindrome_Number.isPalindrome(5));
		assertTrue(Palindrome_Number.isPalindrome(535));
		assertTrue(Palindrome_Number.isPalindrome(45354));
		assertTrue(!Palindrome_Number.isPalindrome(5345));
		assertTrue(!Palindrome_Number.isPalindrome(-5));
	}
	@Test
	public void testReverseInteger() {
		assertEquals(-6543, Reverse_Integer.reverse(-3456));
		assertEquals(6543, Reverse_Integer.reverse(3456));
		assertEquals(0, Reverse_Integer.reverse(1534236469));
		assertEquals(0, Reverse_Integer.reverse(1563847412));
		assertEquals(0, Reverse_Integer.reverse(-1563847412));
	}
}
