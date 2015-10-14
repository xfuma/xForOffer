package sword;

/**
 * 二叉树的深度VS平衡二叉树
 * 
 * @author xhy
 *
 */
public class Solution39 {
	public int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	public boolean isBalanced(TreeNode root) {
		if (checkHeight(root) == -1)
			return false;
		return true;
	}

	private int checkHeight(TreeNode root) {
		if (root == null)
			return 0;
		int leftHeight = checkHeight(root.left);
		if (leftHeight == -1)
			return -1;
		int rightHeight = checkHeight(root.right);
		if (rightHeight == -1)
			return -1;
		if (Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		return Math.max(leftHeight, rightHeight) + 1;
	}
}