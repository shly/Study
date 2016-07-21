package Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Impl.TraverseTreeImpl;
import Impl.TreeNode;

/**
 * @author Administrator
 *
 */
public class TraverseTreeTest {
	TreeNode root = buildBinaryTree();
	TraverseTreeImpl test = new TraverseTreeImpl();
	
	public TreeNode buildBinaryTree(){
		TreeNode node1 = new TreeNode(1, null, null);
		TreeNode node2 = new TreeNode(2, null, null);
		TreeNode node3 = new TreeNode(3, null, null);
		TreeNode node4 = new TreeNode(4, null, null);
		TreeNode node5 = new TreeNode(5, null, null);
		TreeNode node6 = new TreeNode(6, null, null);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		return node1;
	}

	/**
	 * Test method for {@link TraverseTreeImpl#preOrder(TreeNode)}.
	 */
	@Test
	public void testPreOrder() {
		List<Integer> result = test.preOrder(root);
		List<Integer> expecteds = new ArrayList<Integer>();
		expecteds.add(1);
		expecteds.add(2);
		expecteds.add(4);
		expecteds.add(5);
		expecteds.add(3);
		expecteds.add(6);
		Assert.assertEquals(expecteds, result);
	}

	/**
	 * Test method for {@link TraverseTreeImpl#preOrder1(TreeNode)}.
	 */
	@Test
	public void testPreOrder1() {
		List<Integer> result = test.preOrder1(root);
		List<Integer> expecteds = new ArrayList<Integer>();
		expecteds.add(1);
		expecteds.add(2);
		expecteds.add(4);
		expecteds.add(5);
		expecteds.add(3);
		expecteds.add(6);
		Assert.assertEquals(expecteds, result);
	}

	/**
	 * Test method for {@link TraverseTreeImpl#inOrder(TreeNode)}.
	 */
	@Test
	public void testInOrder() {
		List<Integer> result = test.inOrder(root);
		List<Integer> expecteds = new ArrayList<Integer>();
		expecteds.add(4);
		expecteds.add(2);
		expecteds.add(5);
		expecteds.add(1);
		expecteds.add(6);
		expecteds.add(3);
		Assert.assertEquals(expecteds, result);
	}

	/**
	 * Test method for {@link TraverseTreeImpl#inOrder1(TreeNode)}.
	 */
	@Test
	public void testInOrder1() {
		List<Integer> result = test.inOrder1(root);
		List<Integer> expecteds = new ArrayList<Integer>();
		expecteds.add(4);
		expecteds.add(2);
		expecteds.add(5);
		expecteds.add(1);
		expecteds.add(6);
		expecteds.add(3);
		Assert.assertEquals(expecteds, result);
	}

	/**
	 * Test method for {@link TraverseTreeImpl#postOrder(TreeNode)}.
	 */
	@Test
	public void testPostOrder() {
		List<Integer> result = test.postOrder(root);
		List<Integer> expecteds = new ArrayList<Integer>();
		expecteds.add(4);
		expecteds.add(5);
		expecteds.add(2);
		expecteds.add(6);
		expecteds.add(3);
		expecteds.add(1);
		Assert.assertEquals(expecteds, result);
	}

	/**
	 * Test method for {@link TraverseTreeImpl#postOrder1(TreeNode)}.
	 */
	@Test
	public void testPostOrder1() {
		List<Integer> result = test.postOrder1(root);
		List<Integer> expecteds = new ArrayList<Integer>();
		expecteds.add(4);
		expecteds.add(5);
		expecteds.add(2);
		expecteds.add(6);
		expecteds.add(3);
		expecteds.add(1);
		Assert.assertEquals(expecteds, result);
	}

	/**
	 * Test method for {@link TraverseTreeImpl#breadFirst(TreeNode)}.
	 */
	@Test
	public void testBreadFirst() {
		List<Integer> result = test.breadFirst(root);
		List<Integer> expecteds = new ArrayList<Integer>();
		expecteds.add(1);
		expecteds.add(2);
		expecteds.add(3);
		expecteds.add(4);
		expecteds.add(5);
		expecteds.add(6);
		Assert.assertEquals(expecteds, result);
	}

}
