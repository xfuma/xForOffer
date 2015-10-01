package sword;

import java.util.Arrays;

/**
 * 重建二叉树
 * 
 * @author xhy
 *
 */
public class Solution06 {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null || pre.length != in.length || pre.length == 0)
			return null;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == pre[0]) {
				TreeNode root = new TreeNode(in[i]);
				root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), 
						Arrays.copyOfRange(in, 0, i));
				root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length),
						Arrays.copyOfRange(in, i + 1, in.length));
				return root;
			}
		}
		return null;
	}
}