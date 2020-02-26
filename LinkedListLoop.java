package com.java.study;

import java.util.ArrayList;

public class LinkedListLoop {
	
	public static void main(String[] args) {
		
		Node aList = new Node("M");
		Node head = aList;
		aList.appendToLast("A");
		aList.appendToLast("L");
		aList.appendToLast("A");
		aList.appendToLast("Y");
		Node connectNode = new Node("Connect");
		aList.appendToLast(connectNode);
		aList.appendToLast("A");
		aList.appendToLast("L");
		aList.appendToLast("A");
		aList.appendToLast("M");
		aList.appendToLast(connectNode);
		
		Node resNode;
		if ((resNode = checkLoop(aList)) == null) {
			System.out.println("No loop found");
		} else {
			System.out.println("Loop found at value - " + resNode.data);
		}
		
		
	}
	
	static Node checkLoop(Node aList) {
		
		ArrayList<Node> nodeArray = new <Node>ArrayList();
		
		if (aList == null) return null;
		
		while (aList.next != null) {
			if (nodeArray.contains(aList.next)) {
				return aList.next;
			}	
			nodeArray.add(aList.next);
			aList = aList.next;
		}
		
		return null;
	}

}
