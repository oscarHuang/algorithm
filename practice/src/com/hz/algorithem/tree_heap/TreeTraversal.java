package com.hz.algorithem.tree_heap;

import java.util.ArrayList;

public class TreeTraversal {
	ArrayList<Integer> result = new ArrayList<Integer>();
	
	/**
	 * preorder, 先遍历中，再左右子结点
	 * @param rootNode
	 */
	public void preOrder(TreeNode rootNode){
		if(rootNode == null){
			return;
		}
		result.add(rootNode.value);
		preOrder(rootNode.leftNode);
		preOrder(rootNode.rightNode);
	}
	
	/**
	 * inorder, 左中右
	 * @param rootNode
	 */
	public void inOrder(TreeNode rootNode){
		if(rootNode == null){
			return;
		}
		inOrder(rootNode.leftNode);
		result.add(rootNode.value);
		inOrder(rootNode.rightNode);
	}
	
	/**
	 * postOrder, 左右中
	 * @param rootNode
	 */
	public void postOrder(TreeNode rootNode){
		if(rootNode == null){
			return;
		}
		postOrder(rootNode.leftNode);
		postOrder(rootNode.rightNode);
		result.add(rootNode.value);
	}
	
	public void printResult(){
		for(Integer value : result){
			System.out.print(value + ",");
		}
		System.out.println();
		result.clear();
	}
	
	private void invertTree(TreeNode rootNode){
		if(rootNode == null){
			return;
		}
		TreeNode temp = rootNode.leftNode;
		rootNode.leftNode = rootNode.rightNode;
		rootNode.rightNode = temp;
		
		invertTree(rootNode.leftNode);
		invertTree(rootNode.rightNode);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化
		TreeNode rootNode = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		
		rootNode.leftNode = node1;
		rootNode.rightNode = node2;
		
		node1.leftNode = node3;
		node1.rightNode = node4;
		
		node2.leftNode = node5;
		node2.rightNode = node6;
		
		TreeTraversal treeTraverSal = new TreeTraversal();
		treeTraverSal.preOrder(rootNode);
		treeTraverSal.printResult();
		treeTraverSal.invertTree(rootNode);
		treeTraverSal.preOrder(rootNode);
		treeTraverSal.printResult();
//		treeTraverSal.postOrder(rootNode);
//		treeTraverSal.printResult();
//		treeTraverSal.inOrder(rootNode);
//		treeTraverSal.printResult();
		
	}

}

