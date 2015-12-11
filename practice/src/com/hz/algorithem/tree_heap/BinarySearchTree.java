package com.hz.algorithem.tree_heap;

public class BinarySearchTree {
	
	private void constructBST(){
		int[] array = {1,2,3,4,5,6,8,9,10};
		
		TreeNode rootNode = sortedArrayToBST(array, 0, array.length -1);
		
		TreeTraversal treeTraversal = new TreeTraversal();
		treeTraversal.preOrder(rootNode);
		treeTraversal.printResult();
	}
	
	private TreeNode sortedArrayToBST(int[] array, int start, int end){
		if(start > end){
			return null;
		}
		int mid = (start + end)/2;
		int midValue = array[mid];
		TreeNode treeNode = new TreeNode(midValue);
		treeNode.leftNode = sortedArrayToBST(array, start, mid -1);
		treeNode.rightNode = sortedArrayToBST(array, mid+1, end);
		return treeNode;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.constructBST();
	}

}
