package tree_dfs;

import structures.TreeNode;

public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
        		return false;
        }
        sum -= root.val;
        if (root.left == null && root.right == null) {
        		return sum == 0;
        } else {
        		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
        }
    }
}
