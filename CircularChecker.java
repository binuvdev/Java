package com.java.study;
//Given a linked list, determine whether it contains a cycle

import java.util.HashSet;

public class CircularChecker {

	public static void main(String[] args) {
		
		IntNode aNode1 = new IntNode(1);
		IntNode aNode2 = new IntNode(2);
		IntNode aNode3 = new IntNode(3);
		IntNode aNode4 = new IntNode(4);
		
		aNode1.next = aNode2;
		aNode2.next = aNode3;
		aNode3.next = aNode4;
		//aNode4.next = aNode2;  // To make loop; uncomments
		
		System.out.println(isCircular(aNode1));
	}
	




	static boolean isCircular(IntNode aNode) {
		if (aNode == null) return false;
		
		HashSet<IntNode> aList = new HashSet<IntNode>();
		
		while (aNode != null) {
			if (aList.contains(aNode)) return true;
			aList.add(aNode);
			aNode = aNode.next;
		}
		
		return false;
	}	
	
	
}
