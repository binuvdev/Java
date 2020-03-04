package com.java.study;

import java.util.Stack;

public class ReverseSubList {

	public static void main(String[] args) {

		// Define input List
		ListNode<Integer> inputNode = new ListNode<>(0, null);
		inputNode.next = new ListNode<>(11, null);
		inputNode.next.next = new ListNode<>(3, null);
		inputNode.next.next.next = new ListNode<>(5, null);
		inputNode.next.next.next.next = new ListNode<>(7, null);
		inputNode.next.next.next.next.next = new ListNode<>(2, null);
		inputNode.printList();
		System.out.println();

		int startIndex = 2;
		int endIndex = 4;

		ListNode<Integer> startNode = inputNode;
		ListNode<Integer> endNode;
		Stack<ListNode<Integer>> aStack = new Stack<>();
		ListNode<Integer> tailNode;

		int i = 0;

		while (startNode != null && i < startIndex - 1) {
			startNode = startNode.next;
			i++;
		}

		endNode = startNode;

		while (endNode != null && i < endIndex) {
			endNode = endNode.next;
			aStack.push(endNode);
			i++;
		}

		tailNode = endNode.next;
		while (!aStack.isEmpty()) {
			startNode.next = aStack.pop();
			startNode = startNode.next;
		}

		startNode.next = tailNode;
		
		inputNode.printList();
	}

}