package stack;

import java.util.Stack;

public class Min_Stack {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> min_stack = new Stack<Integer>();
	
    public void push(int x) {
    	stack.push(x);
    	if (min_stack.isEmpty() || x <= min_stack.peek()) {
    		min_stack.push(x);
    	}
    }

    public void pop() {
    	if (stack.isEmpty()) {
    		return;
    	}
        if (stack.peek().equals(min_stack.peek())) {
        	min_stack.pop();
        }
        stack.pop();
    }

    public int top() {
    	if (min_stack.isEmpty()) {
    		return 0;
    	} else {
    		return stack.peek();
    	}
    }

    public int getMin() {
    	if (min_stack.isEmpty()) {
    		return 0;
    	} else {
    		return min_stack.peek();
    	}
    }
}