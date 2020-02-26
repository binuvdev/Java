package com.java.study;

public class BinaryTreeGenerator {
	
	static int [] anArray = {1,3,5,10,14,22,34,55,63,74,75,89,99};
	
	
	public static void main(String[] args) {
		TreeNode finalNode = createBinaryTree(anArray);
		
		System.out.println(finalNode.value);
		
	}
	
	static TreeNode createBinaryTree(int[] aArray) {
		
		if (aArray == null || aArray.length == 0) return null;
		
		if (aArray.length == 1) return new TreeNode(aArray[0]);
		
		int mid = aArray.length/2;
		
		TreeNode newNode = new TreeNode(aArray[mid]);
		int[] leftArray = spitArray(aArray,0,mid-1);
		int[] rightArray = spitArray(aArray,mid+1,aArray.length - 1);
		newNode.left = createBinaryTree(leftArray);
		newNode.right = createBinaryTree(rightArray);
		
		return newNode;
		
	}
	
	static int[] spitArray(int[] a, int start, int end) {
		
		int[] retArr = new int[end - start + 1];
		
		for(int i=start, j=0;i<=end;i++,j++) {
			retArr[j] = a[i]; 
		}
		
		return retArr;
				
	}
	

}
