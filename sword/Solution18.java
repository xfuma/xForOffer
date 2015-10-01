package sword;

/**
 * 树的子结构
 * 
 * @author xhy
 *
 */
public class Solution18 {
	public boolean hasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val)
				result = doseTree1HasTree2(root1, root2);
			if (!result)
				result = hasSubtree(root1.left, root2);
			if (!result)
				result = hasSubtree(root1.right, root2);
		}
		return result;
	}

	private boolean doseTree1HasTree2(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return doseTree1HasTree2(root1.left, root2.left) && doseTree1HasTree2(root1.right, root2.right);
	}
}