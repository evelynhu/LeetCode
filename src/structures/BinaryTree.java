package structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
	TreeNode root = null;

	public BinaryTree(int[] data) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		if(data[0] == -1) {
			System.out.println("root can't be null!");
			return;
		}
		int index = 0;
		root = new TreeNode(data[index]);
		index++;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(root.val);
		output.add(list);
		while (index < data.length) {
			ArrayList<TreeNode> tempList = new ArrayList<TreeNode>();
			ArrayList<Integer> tempValueList = new ArrayList<Integer>();
			while (!queue.isEmpty()) {
				TreeNode node = queue.remove();
				tempList.add(node);
			}
			
			for (int i = 0; i < tempList.size(); i++) {
				if(index >= data.length) break;
				TreeNode pre = tempList.get(i);
				if (pre == null || pre.val == -1) {
					tempValueList.add(-1);
					tempValueList.add(-1);
					index = index+2;
					continue;
				}
				TreeNode left = data[index] == -1 ? null : new TreeNode(data[index]);
				index ++;
				pre.setLeft(left);
				queue.add(left);
				tempValueList.add(left == null ? -1 : left.val);
				if(index >= data.length) break;

				TreeNode right = data[index] == -1 ? null : new TreeNode(data[index]);
				index ++;
				pre.setRight(right);
				queue.add(right);
				tempValueList.add(right == null ? -1 : right.val);
			}
			output.add(tempValueList);
		}
		
		//output
		for (int i = 0; i < output.size(); i++) {
			ArrayList<Integer> row = output.get(i);
			System.out.print("[");
			for (int j = 0; j <  row.size(); j++) {
				System.out.print(row.get(j));
				if(j != row.size() - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}

	}

	public TreeNode getTree(){
		return root;
	}
	public void Traversal(TreeNode pre, TreeNode n, int v, boolean left) {
		if (n != null) {
			if (n.val > v) {
				Traversal(n, n.getLeft(), v, true);
			} else if (n.val < v) {
				Traversal(n, n.getRight(), v, false);
			} else {
				n.addCount();
			}
		} else {
			n = new TreeNode(v);
			if (left) {
				pre.setLeft(n);
			} else {
				pre.setRight(n);
			}
		}
	}
	public void Insert(TreeNode pre, TreeNode n, int v, boolean right) {
		if (n != null) {
			if (n.getLeft() == null) {
				Traversal(n, n.getLeft(), v, false);
			} else if (n.getRight() == null) {
				Traversal(n, n.getRight(), v, true);
			} else {
				Traversal(n, n.getLeft(), v, false);
			}
		} else {
			n = new TreeNode(v);
			if (right) {
				pre.setRight(n);
			} else {
				pre.setLeft(n);
			}
		}
	}

	public void Output(TreeNode n) {
		if (n != null) {
			Output(n.getLeft());
			System.out.print("[" + n.val + "] ");
			Output(n.getRight());
		}
	}

}


