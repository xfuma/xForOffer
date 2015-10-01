package sword;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 * 
 * @author xhy
 *
 */
public class Solution05 {
	public ArrayList<Integer> printListFromTailToHead(ListNode node) {
		ArrayList<Integer> arr = new ArrayList<>();
		print(node, arr);
		return arr;
	}

	// 递归实现
	private void print(ListNode node, ArrayList<Integer> arr) {
		if (node != null) {
			print(node.next, arr);
			arr.add(node.val);
		}
	}

	// 借助栈实现
	private void print2(ListNode node, ArrayList<Integer> arr) {
		Stack<Integer> stack = new Stack<>();
		while (node != null) {
			stack.push(node.val);
			node = node.next;
		}
		while (!stack.isEmpty())
			arr.add(stack.pop());
	}
}