package tree_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.TreeNode;

public class BinaryTreeLevelOrderTraversalII {
    static public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if (root == null) {
    		return result;
    	}
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);

    	while (!queue.isEmpty()) {
    		List<Integer> tempList = new ArrayList<Integer>();
        	List<TreeNode> tempNodeList = new ArrayList<TreeNode>();
        	
        	while (!queue.isEmpty()) {
        		TreeNode node = queue.remove();
        		tempNodeList.add(node);
        		tempList.add(node.val);
        	}
        	list.add(tempList);
        	
        	for (int i = 0; i < tempNodeList.size(); i++) {
        		TreeNode node = tempNodeList.get(i);
        		if (node.left != null) {
        			queue.add(node.left);
        		}
        		if (node.right != null) {
        			queue.add(node.right);
        		}
        	}
    	}
    	for (int i = list.size() - 1; i >= 0; i--){
    		result.add(list.get(i));
    	}
    	return result;
    }
}
