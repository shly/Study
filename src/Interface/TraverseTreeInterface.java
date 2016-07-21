package Interface;

import java.util.List;

import Impl.TreeNode;


public interface TraverseTreeInterface {
	/**
	 * ��������ݹ�ʵ��
	 * @param root
	 * @return 
	 */
	public List<Integer> preOrder(TreeNode root);
	/**
	 * ��������ǵݹ�
	 * @param root
	 * @return
	 */
	public List<Integer> preOrder1(TreeNode root);
	/**
	 * ��������ݹ�
	 * @param root
	 * @return
	 */
	public List<Integer> inOrder(TreeNode root);
	/**
	 * ��������ǵݹ�
	 * @param root
	 * @return
	 */
	public List<Integer> inOrder1(TreeNode root);
	/**
	 * ���������ݹ�
	 * @param root
	 * @return
	 */
	public List<Integer> postOrder(TreeNode root);
	/**
	 * ��������ǵݹ�
	 * @param root
	 * @return
	 */
	public List<Integer> postOrder1(TreeNode root);
	/**
	 * ������ȱ���
	 * @param root
	 * @return
	 */
	public List<Integer> breadFirst(TreeNode root);
	

}
