package Interface;

import java.util.List;

import Impl.TreeNode;


public interface TraverseTreeInterface {
	/**
	 * 先序遍历递归实现
	 * @param root
	 * @return 
	 */
	public List<Integer> preOrder(TreeNode root);
	/**
	 * 先序遍历非递归
	 * @param root
	 * @return
	 */
	public List<Integer> preOrder1(TreeNode root);
	/**
	 * 中序遍历递归
	 * @param root
	 * @return
	 */
	public List<Integer> inOrder(TreeNode root);
	/**
	 * 中序遍历非递归
	 * @param root
	 * @return
	 */
	public List<Integer> inOrder1(TreeNode root);
	/**
	 * 后续遍历递归
	 * @param root
	 * @return
	 */
	public List<Integer> postOrder(TreeNode root);
	/**
	 * 后序遍历非递归
	 * @param root
	 * @return
	 */
	public List<Integer> postOrder1(TreeNode root);
	/**
	 * 广度优先遍历
	 * @param root
	 * @return
	 */
	public List<Integer> breadFirst(TreeNode root);
	

}
