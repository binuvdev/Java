package com.java.study;

//Given an unsorted linked list, write a function to remove all the duplicates.

import java.util.HashSet;

public class DeDuply {
	public static void main (String[] args) {
		IntNode aNode1 = new IntNode(1);
		IntNode aNode2 = new IntNode(2);
		IntNode aNode3 = new IntNode(3);
		IntNode aNode11 = new IntNode(1);
		IntNode aNode12 = new IntNode(2);
		
		aNode1.next = aNode2;
		aNode2.next = aNode3;
		aNode3.next = aNode12;
		aNode12.next = aNode11;
		
		deDup(aNode1);
		
		while(aNode1 != null) {
			System.out.print(aNode1.data + " ");
			aNode1 = aNode1	.next;
		}
		
		
		
		
	}
	
	
	static void deDup(IntNode aNode) {
		HashSet<Integer> visited = new HashSet<Integer>();
		
		IntNode currNode = aNode;
		IntNode prevNode = null;
		
		while(currNode != null) {
			if (visited.contains(currNode.data)) {
				prevNode.next = currNode.next;
				currNode = prevNode.next;
			} else {
				visited.add(currNode.data);
				prevNode = currNode;
				currNode = currNode.next;
			}
		}
		
		
		return;
	}

	
}
