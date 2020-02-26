package com.java.study;

import java.util.LinkedList;
import java.util.Map;

//4.12
public class TreePathSum {
	static TreeNode rootNode = new TreeNode(10);
	
	
	public static void main(String[] args) {
		rootNode.left = new TreeNode(5);  //10
		rootNode.right = new TreeNode(-5); //10
	
		rootNode.left.left = new TreeNode(3);  //5
		rootNode.left.right = new TreeNode(4); //5
		
		rootNode.left.left.left = new TreeNode(1); //3
		rootNode.left.left.right = new TreeNode(0); //3
		
		rootNode.left.right.left = new TreeNode(2); //4
		
		//rootNode.left.right.left.left = new TreeNode(10);
		//rootNode.left.right.left.right = new TreeNode(30);
		//rootNode.left.right.left.left.right = new TreeNode(25);
		
		
		//rootNode.left.right.right = new TreeNode(40);
		
		rootNode.right.left = new TreeNode(2); //-5
		rootNode.right.right = new TreeNode(6); //-5
		
		rootNode.right.left.left = new TreeNode(11); //2
		//rootNode.right.left.right = new TreeNode(65); //2
		
		rootNode.right.right.left = new TreeNode(8); //6
		rootNode.right.right.right = new TreeNode(8); //6	
		
		System.out.println(findNumberOfPaths(rootNode, 19));
		
		
	}	
	
	static int findNumberOfPaths(TreeNode t, int sum) {
		if (t == null) return 0;
		
		if ((sum - t.value == 0) && t.left == null && t.right == null) return 1;
		
		sum = sum - t.value;
		
		return (findNumberOfPaths(t.right,sum) + findNumberOfPaths(t.left,sum));
		
	}
	
	
}
