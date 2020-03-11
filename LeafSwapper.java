package com.java.study;

//Given a binary tree, we need to write a program to swap leaf nodes in the given binary tree pairwise starting from left to right
//Ref: https://www.geeksforgeeks.org/pairwise-swap-leaf-nodes-binary-tree/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class LeafSwapper {
	public static void main(String[] args) {

		TreeNode node1 = new TreeNode("1");
		TreeNode node2 = new TreeNode("2");
		TreeNode node3 = new TreeNode("3");
		TreeNode node4 = new TreeNode("4");
		TreeNode node5 = new TreeNode("5");
		TreeNode node6 = new TreeNode("6");
		TreeNode node7 = new TreeNode("7");
		TreeNode node8 = new TreeNode("8");
		TreeNode node9 = new TreeNode("9");
		TreeNode node10 = new TreeNode("10");

		node1.left = node2;
		node1.right = node3;

		node2.left = node4;

		node3.left = node5;
		node3.right = node8;

		node5.left = node6;
		node5.right = node7;

		node8.left = node9;
		node8.right = node10;

		System.out.println("Pre Order Traversal - before swap");
		inOrder(node1);
		System.out.println();
		System.out.println();

		swapLeaf(node1);

		System.out.println("Pre Order Traversal - after swap");
		inOrder(node1);
		System.out.println();
		System.out.println();

	}

	static void swapLeaf(TreeNode n) {

		if (n == null)
			return;

		Map<TreeNode, TreeNode> leafMap = new HashMap<TreeNode, TreeNode>();
		Queue<Map<TreeNode, String>> leafQueue = new LinkedList<Map<TreeNode, String>>();

		swapLeaf(n, leafMap, leafQueue);

		Map<TreeNode, String> aMapEntry = new HashMap<TreeNode, String>();
		Map<TreeNode, String> bMapEntry = new HashMap<TreeNode, String>();

		TreeNode aTreeNode = null;
		TreeNode bTreeNode = null;

		TreeNode aParentNode = null;
		TreeNode bParentNode = null;

		String aDirection = null;
		String bDirection = null;

		while (!leafQueue.isEmpty()) {

			aMapEntry = leafQueue.remove();
			for (Entry<TreeNode, String> i : aMapEntry.entrySet()) {
				aTreeNode = i.getKey();
				aDirection = i.getValue();
				aParentNode = leafMap.get(aTreeNode);
				break;
			}

			if (!leafQueue.isEmpty()) {
				bMapEntry = leafQueue.remove();
				for (Entry<TreeNode, String> i : bMapEntry.entrySet()) {
					bTreeNode = i.getKey();
					bDirection = i.getValue();
					bParentNode = leafMap.get(bTreeNode);
					break;
				}
			} else {
				break;
			}

			if (aDirection != null && aDirection.equalsIgnoreCase("L")) {
				aParentNode.left = bTreeNode;
			}

			if (aDirection != null && aDirection.equalsIgnoreCase("R")) {
				aParentNode.right = bTreeNode;
			}
			if (bDirection != null && bDirection.equalsIgnoreCase("L")) {
				bParentNode.left = aTreeNode;
			}
			if (bDirection != null && bDirection.equalsIgnoreCase("R")) {
				bParentNode.left = aTreeNode;
			}

		}

	}

	static void swapLeaf(TreeNode n, Map<TreeNode, TreeNode> leafMap, Queue<Map<TreeNode, String>> leafQueue) {

		if (n == null)
			return;

		if (n.left != null && n.left.left == null && n.left.right == null) {
			leafMap.put(n.left, n);
			Map<TreeNode, String> aHashMap = new HashMap<TreeNode, String>();
			aHashMap.put(n.left, "L");
			leafQueue.add(aHashMap);
		}

		if (n.right != null && n.right.left == null && n.right.right == null) {
			leafMap.put(n.right, n);
			Map<TreeNode, String> aHashMap = new HashMap<TreeNode, String>();
			aHashMap.put(n.right, "R");
			leafQueue.add(aHashMap);
		}

		swapLeaf(n.left, leafMap, leafQueue);

		swapLeaf(n.right, leafMap, leafQueue);

	}

	static void inOrder(TreeNode n) {

		if (n == null)
			return;

		inOrder(n.left);
		System.out.print(n.data + " ");
		inOrder(n.right);
		return;
	}

}
