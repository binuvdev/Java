package com.java.study;

import java.util.LinkedList;
import java.util.Queue;

public class AllTreeTraverals {
	
	public static void main(String[] args) {
		
		
		TreeNode nodeA = new TreeNode("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		TreeNode nodeD = new TreeNode("D");
		TreeNode nodeE = new TreeNode("E");
		TreeNode nodeF = new TreeNode("F");
		TreeNode nodeG = new TreeNode("G");
		TreeNode nodeH = new TreeNode("H");
		TreeNode nodeI = new TreeNode("I");
		TreeNode nodeJ = new TreeNode("J");
		TreeNode nodeK = new TreeNode("K");
		
		nodeA.left = nodeB;
		nodeA.right = nodeC;
		
		nodeB.left = nodeD;
		nodeB.right = nodeE;
		
		nodeD.left = nodeH;
		nodeD.right = nodeI;
		
		nodeE.left = nodeJ;
		
		nodeC.left = nodeF;
		nodeC.right = nodeG;
		
		nodeG.left = nodeK;
	
		System.out.println("Pre Order Traversal:");
		preOrder(nodeA);
		System.out.println();
		System.out.println();
		
		System.out.println("In Order Traversal:");
		inOrder(nodeA);
		System.out.println();
		System.out.println();
		
		System.out.println("Post Order Traversal:");
		postOrder(nodeA);
		System.out.println();
		System.out.println();
		
		System.out.println("Level Order Traversal(Breadth-first search):");
		bfsOrder(nodeA);
		System.out.println();
		System.out.println();
				
		
	}
	
	static void preOrder(TreeNode n) {
		
		if (n == null) return;
		
		System.out.print(n.data + " ");
		preOrder(n.left);
		preOrder(n.right);
		return;
	}

	static void inOrder(TreeNode n) {
		
		if (n == null) return;
		
		inOrder(n.left);
		System.out.print(n.data  + " ");
		inOrder(n.right);
		return;
	}

	static void postOrder(TreeNode n) {
		
		if (n == null) return;
		
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.data  + " ");
		return;
	}

	static void bfsOrder(TreeNode n) {
		
		if (n == null) return;
		
		Queue<TreeNode> aQueue = new LinkedList<TreeNode>();
		aQueue.add(n);
		
		while (!aQueue.isEmpty()) {
			TreeNode aNode = aQueue.remove();
			System.out.print(aNode.data + " ");
			if (aNode.left != null) aQueue.add(aNode.left);
			if (aNode.right != null) aQueue.add(aNode.right);
		}
		return;
	}

}
