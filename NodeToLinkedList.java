package com.java.study;

import java.util.HashMap;

//4.3

import java.util.LinkedList;
import java.util.Map;

public class NodeToLinkedList {

	static HashMap<Integer,LinkedList> lists = new <Integer,LinkedList>HashMap();
	static TreeNode rootNode = new TreeNode(50);
	
	
	
	public static void main (String[] args) {
		
		rootNode.left = new TreeNode(25);
		rootNode.right = new TreeNode(75);

		rootNode.left.left = new TreeNode(10);
		rootNode.left.right = new TreeNode(35);
		
		rootNode.left.left.left = new TreeNode(2);
		rootNode.left.left.right = new TreeNode(15);
		
		rootNode.left.right.left = new TreeNode(32);
		
		//rootNode.left.right.left.left = new TreeNode(10);
		//rootNode.left.right.left.right = new TreeNode(30);
		//rootNode.left.right.left.left.right = new TreeNode(25);
		
		
		rootNode.left.right.right = new TreeNode(40);
		
		rootNode.right.left = new TreeNode(60);
		rootNode.right.right = new TreeNode(85);
		
		rootNode.right.left.left = new TreeNode(55);
		rootNode.right.left.right = new TreeNode(65);
		
		rootNode.right.right.left = new TreeNode(80);
		rootNode.right.right.right = new TreeNode(90);		
		
//4.3
		populateNodes(0,rootNode,lists);
		
		System.out.println("Process Completed");
		
		for (Map.Entry<Integer,LinkedList> alist : lists.entrySet()) {
			System.out.println(alist.getKey() + " - " + alist.getValue());
		}
	
		System.out.println(isBinaryTree(rootNode, Integer.MIN_VALUE,Integer.MAX_VALUE));
		
	}
	
	static void populateNodes(int level, TreeNode aNode, HashMap<Integer,LinkedList> lists) {
		
		if (aNode == null) return;
		
		LinkedList aList = lists.get(level);
		
		if (aList!=null) {
			aList.addLast(aNode.value);
		} else {
			LinkedList newList = new LinkedList();
			newList.addLast(aNode.value);
			lists.put(level, newList);
		}
		
		populateNodes(level+1,aNode.left,lists);
		populateNodes(level+1,aNode.right,lists);
		
	}
	
	//4.5
	
	static boolean isBinaryTree(TreeNode aNode, int leftHigh, int rightLow) {
		
		if (aNode == null) {
			return true;
		}
		
		if(aNode.value <= leftHigh || aNode.value > rightLow)
			return false;

		if (!isBinaryTree(aNode.left,leftHigh,aNode.value) || !isBinaryTree(aNode.right,aNode.value,rightLow)) {
			return false;
		}
		
		return true;
		
	}
	
}
