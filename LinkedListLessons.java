package com.java.study;

import java.util.*;


public class LinkedListLessons {
	
	public static void main (String[] args) {
		
		Node nodeList = new Node("3");
		Node head  = nodeList;
		Node newNode = new Node("5");
		nodeList.appendToLast(newNode);
		newNode = new Node("8");
		nodeList.appendToLast(newNode);
		newNode = new Node("5");
		nodeList.appendToLast(newNode);
		newNode = new Node("10");
		nodeList.appendToLast(newNode);
		newNode = new Node("2");
		nodeList.appendToLast(newNode);
		newNode = new Node("1");
		nodeList.appendToLast(newNode);		

		
//		printList(head);
//		removeDups(nodeList);
//		nodeList = KtoLast(nodeList,1);


/* For 2.3		
		Node aNode = head;
		
		while(!aNode.data.equalsIgnoreCase("3")) {
			aNode = aNode.next;
		}
		
		removeANode(aNode);
*/		
		
		IntNode intNodeList = new IntNode(3);
		
		IntNode intHead = intNodeList;
		
		
		
		//printList(partition(intHead,"5"));
		
		
		
	}
	
//2.4 Solution
	
	static Node partition(Node aNode, String x) {
		
		if (aNode == null) return aNode;
		Node aResNode = new Node(x);
		
		do {
			if(aNode.data.compareTo(x) >= 0) {
				aResNode.appendToLast(new Node(aNode.data));
			} else {
				Node newNode = new Node(aNode.data);
				newNode.appendToLast(aResNode);
				aResNode = newNode;
			}
			
			aNode = aNode.next;
			
		} while (aNode.next != null);
		
		return aResNode;
	}
	
	
//2.3 Solution
	static void removeANode(Node aNode) {
		
		if (aNode == null || aNode.next == null) {
			return;
		}
		
		aNode.data = aNode.next.data;
		aNode.next = aNode.next.next;
		return;
		
	}
	
	
//2,2 Solution - Partial
	static Node KtoLast(Node aList, int k) {
		int i = 1;
		
		if (aList == null ) return aList; 
		
		while (i <= k && aList.next != null) {
			
			aList = aList.next;
			
			i++;
		}
		
		//printList(aList);
		return aList;
		
	}

//2.1 Solution	
	static void removeDups(Node aList) {
		
		Node runner = aList;
		Node prevNode;
		ArrayList<String> aArrayList = new <String>ArrayList();
		if (aList == null) return;
		
		if (aList.next == null) return;
		
		aArrayList.add(aList.data);
		while(runner.next != null) {
			prevNode = runner;
			runner = runner.next;
			if(aArrayList.contains(runner.data)) {
				prevNode.next = runner.next;
			} else {
				aArrayList.add(runner.data);
			}
			
		}
		
		
//		Iterator it = aList.iterator();
//		for(aList)
		
		
	}
	
	static void printList(Node aList) {
		if (aList == null) return;
		System.out.println(aList.data);
		
		while(aList.next!=null) {
			aList = aList.next;
			System.out.println(aList.data);
		}
	}
	

}
