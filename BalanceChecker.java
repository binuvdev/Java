package com.java.study;

import java.util.HashMap;

//Question : Given a binary tree, write a function to test if the tree is a binary search tree.
//There are two methods.  Version 2 is better.

public class BalanceChecker {
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(5);

		root.left = new TreeNode(2);
		root.right = new TreeNode(7);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(4); //Not Balanced
		//root.right.right = new TreeNode(8); //Balanced
		
		//System.out.println(checkBalance(root,'L').get("result"));
		//System.out.println(checkBalance(root,'R').get("result"));
		
		
		if (checkBalance(root,'L').get("result") == null || checkBalance(root,'R').get("result") == null) {
			System.out.println("This is a balanced Tree");
		} else {
			System.out.println("This is NOT a balanced Tree");
		}

		
		
		if (isBalanced(root)) {
			System.out.println("This is a balanced Tree");
		} else {
			System.out.println("This is NOT a balanced Tree");
		}
		
		
	}

	//Version 2
	static boolean isBalanced(TreeNode n) {
		HashMap<String, Integer> returnMap = new HashMap<String, Integer>();
		checkBalance(n.left, 'L',returnMap);
		
		if (returnMap.get("result") != null) return false;
		
		returnMap = new HashMap<String, Integer>();
		checkBalance(n.right, 'R',returnMap);
		
		if (returnMap.get("result") != null) return false;
		
		return true;
		
		
	}
	
	//Version 2	
	static void checkBalance(TreeNode n, char ind, HashMap<String, Integer> returnMap) {
		
		//System.out.println("Calling check Balance");
		
		if (returnMap.get("result") != null) return;
		
		if (n == null) {
			returnMap.put("left", Integer.MIN_VALUE);
			returnMap.put("right", Integer.MAX_VALUE);
			returnMap.put("result", 0);
			return;
		}
		
		HashMap<String, Integer> leftMap = new HashMap<String, Integer>();
		HashMap<String, Integer> rightMap = new HashMap<String, Integer>();
		checkBalance(n.left, 'L',leftMap);
		checkBalance(n.right, 'R',rightMap);

		if (n.value < leftMap.get("left")) {
			returnMap.put("result", -1);
		}
		int leftValue  = Math.max(n.value,leftMap.get("left"));
		returnMap.put("left", leftValue);
		
		
		if (n.value > rightMap.get("right")) {
			returnMap.put("result", -1);
		}
		int rightValue = Math.min(n.value,rightMap.get("right"));
		
		
		returnMap.put("right", rightValue);
		
		return;
		
	}
	
	
	//Version 1	
	static HashMap<String,Integer> checkBalance(TreeNode n, char ind) {
		
		//System.out.println("Previous Calling check Balance");

		HashMap<String, Integer> returnMap = new HashMap<String, Integer>();
		if (n == null) {
			returnMap.put("left", Integer.MIN_VALUE);
			returnMap.put("right", Integer.MAX_VALUE);
			returnMap.put("result", 0);
			return returnMap;
		}
		
		HashMap<String, Integer> leftMap = checkBalance(n.left, 'L');
		HashMap<String, Integer> rightMap = checkBalance(n.right, 'R');

		if (n.value < leftMap.get("left")) {
			returnMap.put("result", -1);
		}
		int leftValue  = Math.max(n.value,leftMap.get("left"));
		returnMap.put("left", leftValue);
		
		
		if (n.value > rightMap.get("right")) {
			returnMap.put("result", -1);
		}
		int rightValue = Math.min(n.value,rightMap.get("right"));
		
		
		returnMap.put("right", rightValue);
		
		return returnMap;
		
	}
	
}
