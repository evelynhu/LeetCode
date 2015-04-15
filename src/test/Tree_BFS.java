package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import structures.BinaryTree;
import tree_bfs.BinaryTreeLevelOrderTraversal;
import tree_bfs.BinaryTreeLevelOrderTraversalII;
import tree_dfs.MaximumDepthofBinaryTree;

public class Tree_BFS {
	@Test
	public void testBinaryTreeLevelOrderTraversalII() {
    	int[] data = {3,9,20,-1,-1,15,7};//{9, 5, 3, 1, 4, 8, 15, 11, 21, 20, 29};
    	BinaryTree tree = new BinaryTree(data);
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<Integer> row1 = new ArrayList<>();
		row1.add(-1);
		row1.add(-1);
		row1.add(15);
		row1.add(7);
		result.add(row1);
		List<Integer> row2 = new ArrayList<>();
		row2.add(9);
		row2.add(20);
		result.add(row2);
		List<Integer> row3 = new ArrayList<>();
		row3.add(3);
		result.add(row3);
		assertEquals(result, BinaryTreeLevelOrderTraversalII.levelOrderBottom(tree.getTree()));
	}
	@Test
	public void testBinaryTreeLevelOrderTraversal() {
    	int[] data = {3,9,20,-1,-1,15,7};//{9, 5, 3, 1, 4, 8, 15, 11, 21, 20, 29};
    	BinaryTree tree = new BinaryTree(data);
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<Integer> row1 = new ArrayList<>();
		row1.add(-1);
		row1.add(-1);
		row1.add(15);
		row1.add(7);
		List<Integer> row2 = new ArrayList<>();
		row2.add(9);
		row2.add(20);
		List<Integer> row3 = new ArrayList<>();
		row3.add(3);
		result.add(row3);
		result.add(row2);
		result.add(row1);
		assertEquals(result, BinaryTreeLevelOrderTraversal.levelOrder(tree.getTree()));
	}
}
