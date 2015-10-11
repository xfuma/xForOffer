package sword;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * 
 * @author xhy
 *
 */
public class Solution07 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int item) {
		stack1.push(item);
	}

	public int pop() {
		shift();
		return stack2.pop();
	}

	private void shift() {
		if (stack2.isEmpty())
			while (!stack1.isEmpty())
				stack2.push(stack1.pop());
	}
}