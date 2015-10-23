package sword;

import java.util.Stack;

/**
 * 二叉树的镜像
 * 
 * @author xhy
 *
 */
public class Solution19 {
	// 递归实现
	public void mirror(TreeNode root) {
		if (root == null || (root.left == null && root.right == null))
			return;
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		mirror(root.left);
		mirror(root.right);
	}

	// 循环实现
	public void mirror2(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			TreeNode tmp = node.left;
			node.left = node.right;
			node.right = tmp;
			// 其实指向交换前的right
			node = node.left;
		}
	}
}