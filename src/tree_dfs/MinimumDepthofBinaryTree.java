package tree_dfs;

import structures.TreeNode;

public class MinimumDepthofBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        int minLeft = root.left == null ? 0 : minDepth(root.left);
        int minRight = root.right == null ? 0 : minDepth(root.right);
        if (minLeft == 0 || minRight == 0) {
        		return Math.max(minLeft, minRight) + 1;
        }
        return Math.min(minLeft, minRight) + 1;
    }
}
