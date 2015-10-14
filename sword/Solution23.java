package sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印二叉树
 * 
 * @author xhy
 *
 */
public class Solution23 {
	public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
		ArrayList<Integer> arr = new ArrayList<>();
		if (root == null)
			return arr;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			arr.add(node.val);
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
		}
		return arr;
	}
}