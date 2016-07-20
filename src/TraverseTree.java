import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import javax.management.openmbean.OpenDataException;

public class TraverseTree {
	public static void main(String[] args) {
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
		TraverseTree test = new TraverseTree();
		System.out.println("先序遍历");
		test.preOrder(node1);
		System.out.println("\n");
		test.preOrder1(node1);
		System.out.println("\n");
		
		System.out.println("中序遍历");
		test.inOrder(node1);
		System.out.println("\n");
		test.inOrder1(node1);
		System.out.println("\n");
		
		System.out.println("后序遍历");
		test.postOrder(node1);
		System.out.println("\n");
		test.postOrder1(node1);
		System.out.println("\n");
		System.out.println("广度优先遍历");
		test.breadFirst(node1);
	}

	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.value);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void preOrder1(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root!=null){
			stack.push(root);
			while(!stack.empty()){
				TreeNode p = stack.pop();
				System.out.print(p.value);
				if(p.right!=null){
					stack.push(p.right);
				}
				if(p.left!=null){
					stack.push(p.left);
				}
			}
		}
	}

	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.value);
			inOrder(root.right);
		}
	}

	public void inOrder1(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null||!stack.empty()){
			if(root!=null){
				stack.push(root);
				root = root.left;
			}else{
				TreeNode p = stack.pop();
				System.out.print(p.value);
				root = p.right;
			}
		}
	}
	public void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.value);
		}
	}
	public void postOrder1(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<TreeNode> output = new Stack<TreeNode>();
		while(root!=null||!stack.empty()){
			if(root!=null){
				stack.push(root);
				output.push(root);
				root = root.right;
			}else{
				root = stack.pop();
				root = root.left;
			}
		}
		while(!output.empty()){
			System.out.print(output.pop().value);
		}
	}
	public void breadFirst(TreeNode root) {
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		if(root!=null){
			queue.offer(root);
			while(!queue.isEmpty()){
				TreeNode p = queue.poll();
				System.out.print(p.value);
				if(p.left!=null){
					queue.offer(p.left);
				}
				if(p.right!=null){
					queue.offer(p.right);
				}
			}
		}
	}

}
