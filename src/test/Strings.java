package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import string.Add_Binary;
import string.Compare_Version_Numbers;
import string.Count_and_Say;
import string.Implement_strStr;
import string.LengthofLastWord;
import string.Longest_Common_Prefix;
import string.Romanto_Integer;
import string.String_to_Integer;
import string.Valid_Palindrome;
import string.ZigZagConversion;

public class Strings {
	@Test
	public void testAddBinary() {
		assertEquals("100", Add_Binary.addBinary("11", "1"));
		assertEquals("11", Add_Binary.addBinary("10", "1"));
	}
	@Test
	public void testRomantoInteger() {
		assertEquals(48, Romanto_Integer.romanToInt("XLVIII"));
		assertEquals(98, Romanto_Integer.romanToInt("XCVIII"));
		assertEquals(900, Romanto_Integer.romanToInt("CM"));
		assertEquals(600, Romanto_Integer.romanToInt("DC"));
		assertEquals(400, Romanto_Integer.romanToInt("CD"));
	}
	@Test
	public void testCountAndrSay() {
    	assertEquals("111221", Count_and_Say.countAndSay(5));
	}
	@Test
	public void testStringToInteger() {
		assertEquals(0, String_to_Integer.atoi(null));
		assertEquals(0, String_to_Integer.atoi(""));
		assertEquals(2147483647, String_to_Integer.atoi("2147483648"));
		assertEquals(-2147483648, String_to_Integer.atoi("-2147483649"));
		assertEquals(9000, String_to_Integer.atoi("+9000 "));
		assertEquals(10, String_to_Integer.atoi("    010"));
	}
	@Test
	public void testCompareVersion() {
		assertEquals(0, Compare_Version_Numbers.compareVersion("1.0","1"));
		assertEquals(0, Compare_Version_Numbers.compareVersion("01","1"));
		assertEquals(-1, Compare_Version_Numbers.compareVersion("1.0","1.2"));
		assertEquals(1, Compare_Version_Numbers.compareVersion("1.6.5","1.6"));
	}
	@Test
	public void testValidPalindrome() {
	    	assertTrue(Valid_Palindrome.isPalindrome(""));
	    	assertTrue(Valid_Palindrome.isPalindrome("i"));
	    	assertTrue(Valid_Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
	    	assertTrue(!Valid_Palindrome.isPalindrome("race a car"));
	}
	@Test
	public void testLongestCommonPrefix() {
		String str1 = "This is a car";
		String str2 = "This is a book";
		String str3 = "This is";
		String[] strs = {str1, str2, str3};
    		assertEquals("This is", Longest_Common_Prefix.longestCommonPrefix(strs));
	}
	@Test
	public void testImplement_strStr() {
		assertEquals(0,Implement_strStr.strStr("abcdabc", "abcd"));
		assertEquals(-1,Implement_strStr.strStr("abcdabc", "def"));
	}

	@Test
	public void testZigZagConversion() {
		assertEquals("PAHNAPLSIIGYIR", ZigZagConversion.convert("PAYPALISHIRING", 3));
	}
	
	@Test
	public void testLengthofLastWord() {
		//assertEquals(5, LengthofLastWord.lengthOfLastWord("Hello World"));
		assertEquals(0, LengthofLastWord.lengthOfLastWord(" "));
	}
	@Test
	public void test() {
		assertEquals("PAHNAPLSIIGYIR", ZigZagConversion.convert("PAYPALISHIRING", 3));
	}
}
