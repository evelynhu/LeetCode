package structures;

public class TreeNode {
	public int val;
	private int count;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int i) {
		val = i;
	}

	public void setLeft(TreeNode n) {
		left = n;
	}

	public void setRight(TreeNode n) {
		right = n;
	}

	public TreeNode getLeft() {
		return left;
	}

	public TreeNode getRight() {
		return right;
	}

	public int getval() {
		return val;
	}

	public int getCount() {
		return count;
	}

	public void addCount() {
		++count;
	}

}
