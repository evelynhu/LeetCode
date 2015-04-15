package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import structures.BinaryTree;
import tree_dfs.BalancedBinaryTree;
import tree_dfs.MaximumDepthofBinaryTree;
import tree_dfs.MinimumDepthofBinaryTree;
import tree_dfs.PathSum;
import tree_dfs.SameTree;
import tree_dfs.SymmetricTree;

public class Tree_DFS {
	@Test
	public void testMaxDepth() {
	    	int[] data = {3,9,20,-1,-1,15,7};//{9, 5, 3, 1, 4, 8, 15, 11, 21, 20, 29};
	    	BinaryTree tree = new BinaryTree(data);
	    	assertEquals(3, MaximumDepthofBinaryTree.maxDepth(tree.getTree()));
	}
	@Test
	public void testMinDepth() {
	    	int[] data = {3,9,20,-1,-1,15,7};
	    	BinaryTree tree = new BinaryTree(data);
	    	assertEquals(2, MinimumDepthofBinaryTree.minDepth(tree.getTree()));
	    	int[] data2 = {1,2};
	    	BinaryTree tree2 = new BinaryTree(data2);
	    	assertEquals(2, MinimumDepthofBinaryTree.minDepth(tree2.getTree()));
	}
	@Test
	public void testBalancedBinaryTree() {
	    	int[] data = {3,9,20,-1,-1,15,7};
	    	BinaryTree tree = new BinaryTree(data);
	    	assertTrue(BalancedBinaryTree.isBalanced(tree.getTree()));
	    	int[] data2 = {3,-1,20,-1,-1,15,7};
	    	BinaryTree tree2 = new BinaryTree(data2);
	    	assertTrue(!BalancedBinaryTree.isBalanced(tree2.getTree()));
	}
	@Test
	public void testSameTree() {
	    	int[] data = {3,9,20,-1,-1,15,7};
	    	BinaryTree tree = new BinaryTree(data);
	    	int[] data1 = {3,-1,20,-1,-1,15,7};
	    	BinaryTree tree1 = new BinaryTree(data1);
	    	int[] data2 = {3,9,20,-1,-1,15,7};
	    	BinaryTree tree2 = new BinaryTree(data2);
	    	assertTrue(!SameTree.isSameTree(tree.getTree(), tree1.getTree()));
	    	assertTrue(SameTree.isSameTree(tree.getTree(), tree2.getTree()));
	}
	@Test
	public void testSymmetricTree() {
	    	int[] data = {1,2,2,-1,3,-1,3};
	    	BinaryTree tree = new BinaryTree(data);
	    	int[] data1 = {1,2,2,3,-1,-1,3};
	    	BinaryTree tree1 = new BinaryTree(data1);
	    	assertTrue(!SymmetricTree.isSymmetric(tree.getTree()));
	    	assertTrue(SymmetricTree.isSymmetric(tree1.getTree()));
	}
	@Test
	public void testPathSum() {
	    	int[] data = {5,4,8,11,-1,13,4,7,2,-1,-1,-1,1};
	    	BinaryTree tree = new BinaryTree(data);
	    	assertTrue(PathSum.hasPathSum(tree.getTree(),22));
	    	assertTrue(!PathSum.hasPathSum(tree.getTree(),23));
	}
}
