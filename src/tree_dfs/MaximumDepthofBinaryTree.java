package tree_dfs;

import structures.TreeNode;

public class MaximumDepthofBinaryTree {
    /**
     * Definition for binary tree
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    static public int maxDepth(TreeNode root) {
    		if (root == null) return 0;
        int max_left = root.left == null ? 0 : maxDepth(root.left);
        int max_right = root.right == null ? 0 : maxDepth(root.right);
        return Math.max(max_left, max_right) + 1;
    }
}
