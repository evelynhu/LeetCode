package stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if(s.length() < 1) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
        		char c = s.charAt(i);
        		if (c == '(' || c == '[' || c == '{') {
        			stack.push(c);
            	} else if (c == ')') {
        			if (stack.isEmpty() || stack.pop() != '(') return false;
        		} else if (c == ']') {
        			if (stack.isEmpty() || stack.pop() != '[') return false;
        		} else if (c == '}') {
        			if (stack.isEmpty() || stack.pop() != '{') return false;
        		}
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
