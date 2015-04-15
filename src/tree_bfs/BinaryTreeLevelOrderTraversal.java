package tree_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.TreeNode;

public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
    		List<List<Integer>> result = new ArrayList<List<Integer>>();
    		if (root == null) {
    			return result;
    		}
    		Queue<TreeNode> queue = new LinkedList<TreeNode>();
    		queue.add(root);

    		while (!queue.isEmpty()) {
    			List<Integer> list = new ArrayList<Integer>();
    			Queue<TreeNode> tmpQueue = new LinkedList<TreeNode>();

        		while (!queue.isEmpty()) {
        			TreeNode node = queue.remove();
        			list.add(node.val);
        			tmpQueue.add(node);
        		}
        		result.add(list);
        		
        		while (!tmpQueue.isEmpty()) {
        			TreeNode node = tmpQueue.remove();
        			if (node.left != null) {
        				queue.add(node.left);
        			}
        			if (node.right != null) {
        				queue.add(node.right);
        			}
        		}
    		}

    		return result;
    }
}
