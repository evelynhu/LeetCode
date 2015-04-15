package tree_dfs;

import structures.TreeNode;

public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(depth(root.left) - depth(root.right)) > 1) {
        		return false;
        }
        	return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int depth(TreeNode node) {
    		if (node == null) return 0;
    		return Math.max(depth(node.left), depth(node.right)) + 1; 
    }
}
