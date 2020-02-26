package com.java.study;

public class BinaryTreeGenerator2 {
	
	static int [] anArray = {1,3,5,10,14,22,34,55,63,74,75,89,99};
	
	
	public static void main(String[] args) {
		TreeNode finalNode = createBinaryTree(anArray);
		
		System.out.println(finalNode.value);
		
	}
	
	static TreeNode createBinaryTree(int[] aArray) {
		
		return createBinaryTree(aArray,0,aArray.length - 1);
	}	
		
	static TreeNode createBinaryTree(int[] aArray, int start, int end) {
		
		if (end<start) return null;
		
		int mid = (start + end )/2;
		
		TreeNode newNode = new TreeNode(aArray[mid]);
//		int[] leftArray = spitArray(aArray,0,mid-1);
//		int[] rightArray = spitArray(aArray,mid+1,aArray.length - 1);
		newNode.left = createBinaryTree(aArray,start,mid-1);
		newNode.right = createBinaryTree(aArray,mid+1,end);
		
		return newNode;
		
	}
	


}
