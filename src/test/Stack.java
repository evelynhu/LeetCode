package test;

import static org.junit.Assert.*;

import org.junit.Test;

import stack.ValidParentheses;

public class Stack {
	@Test
	public void testMinStack() {
		stack.Min_Stack stack = new stack.Min_Stack();
		stack.push(5);
		stack.push(1);
		stack.push(3);
		assertEquals(3, stack.top());
		assertEquals(1, stack.getMin());
		stack.pop();
		assertEquals(1, stack.top());
		
		//test case 1
		stack = new stack.Min_Stack();
		stack.push(0);
		stack.push(1);
		stack.push(0);
		assertEquals(0, stack.getMin());
		stack.pop();
		assertEquals(0, stack.getMin());
		
		//test case 2
		stack = new stack.Min_Stack();
		stack.push(512);
		stack.push(-1024);
		stack.push(-1024);
		stack.push(512);
		stack.pop();
		assertEquals(-1024, stack.getMin());
		stack.pop();
		assertEquals(-1024, stack.getMin());
		stack.pop();
		assertEquals(512, stack.getMin());
	}
	@Test
	public void testValidParentheses() {
		assertTrue(ValidParentheses.isValid("({})[]"));
		assertTrue(!ValidParentheses.isValid("({})[]("));
		assertTrue(!ValidParentheses.isValid("({)[]"));
		assertTrue(!ValidParentheses.isValid("}"));
	}
	@Test
	public void test() {
		
	}
}
