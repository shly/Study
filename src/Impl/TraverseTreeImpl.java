package Impl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import Interface.TraverseTreeInterface;


public class TraverseTreeImpl implements TraverseTreeInterface{
	List<Integer> list = new ArrayList<Integer>();
	@Override
	public List<Integer> preOrder(TreeNode root) {
		if(root!=null){
			list.add(root.value);
			preOrder(root.left);
			preOrder(root.right);
		}
		return list;
	}

	@Override
	public List<Integer> preOrder1(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root!=null){
			stack.push(root);
			while(!stack.empty()){
				root = stack.pop();
				list.add(root.value);
				if(root.right!=null){
					stack.push(root.right);
				}
				if(root.left!=null){
					stack.push(root.left);
				}
			}
		}
		return list;
	}

	@Override
	public List<Integer> inOrder(TreeNode root) {
		if(root!=null){
			inOrder(root.left);
			list.add(root.value);
			inOrder(root.right);
		}
		return list;
	}

	@Override
	public List<Integer> inOrder1(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null||!stack.empty()){
			if(root!=null){
				stack.push(root);
				root = root.left;
			}else{
				TreeNode p = stack.pop();
				list.add(p.value);
				root = p.right;
			}
		}
		return list;
	}

	@Override
	public List<Integer> postOrder(TreeNode root) {
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			list.add(root.value);
		}
		return list;
	}

	@Override
	public List<Integer> postOrder1(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<TreeNode> output = new Stack<TreeNode>();
		while(root!=null||!stack.empty()){
			if(root!=null){
				stack.push(root);
				output.push(root);
				root = root.right;
			}else{
				TreeNode p = stack.pop();
				root = p.left;
			}
		}
		while(!output.empty()){
			list.add(output.pop().value);
		}
		return list;
	}

	@Override
	public List<Integer> breadFirst(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		if(root!=null){
			queue.offer(root);
			while(!queue.isEmpty()){
				TreeNode p = queue.poll();
				list.add(p.value);
				if(p.left!=null){
					queue.offer(p.left);
				}
				if(p.right!=null){
					queue.offer(p.right);
				}
			}
		}
		return list;
	}

}
