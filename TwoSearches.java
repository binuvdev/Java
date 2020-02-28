package com.java.study;

import java.util.LinkedList;
import java.util.Queue;

//BFS and DFS

public class TwoSearches {

	public static void main(String[] args) {

		TreeNode myTree = new TreeNode(1);
		myTree.left = new TreeNode(2);
		myTree.right = new TreeNode(3);

		myTree.left.left = new TreeNode(4);
		myTree.left.right = new TreeNode(5);

		Queue<TreeNode> aQueue = new LinkedList<>();

		myTree.right.left = new TreeNode(6);
		myTree.right.right = new TreeNode(7);

		System.out.println("This is Depth First Search");
		doDFS(myTree);

		System.out.println();

		System.out.println("This is Breadth First Search");

		if (myTree != null) {
			aQueue.add(myTree);
			doBFS(aQueue);

		}

	}

	static void doDFS(TreeNode aTree) {
		if (aTree == null)
			return;

		System.out.print(aTree.value + " "); // Process current Node

		doDFS(aTree.left);
		doDFS(aTree.right);
	}

	static void doBFS(Queue<TreeNode> aQueue) {

		TreeNode aTree;

		while (!aQueue.isEmpty()) {
			aTree = aQueue.remove();

			System.out.print(aTree.value + " ");

			if (aTree.left != null) {
				aQueue.add(aTree.left);
			}

			if (aTree.right != null) {
				aQueue.add(aTree.right);
			}

		}
	}

}
