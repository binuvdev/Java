package com.java.study;

//Given a linked list, write a function to split the list into two equal halves.

public class NodeDivider {

	public static void main(String[] args) {
		IntNode aNode1 = new IntNode(1);
		IntNode aNode2 = new IntNode(2);
		IntNode aNode3 = new IntNode(3);
		IntNode aNode4 = new IntNode(4);
		IntNode aNode5 = new IntNode(5);
		
		
		aNode1.next = aNode2;
		aNode2.next = aNode3;
		aNode3.next = aNode4;
		//aNode4.next = aNode5;  //For odd number of Node uncomment this
		
		
		IntNode divNode = divide(aNode1);
		
		
		while(aNode1 != null) {
			System.out.print(aNode1.data + " ");
			aNode1 = aNode1	.next;
		}
		
		System.out.println();
		
		while(divNode != null) {
			System.out.print(divNode.data + " ");
			divNode = divNode	.next;
		}
		
	}
	
	static IntNode divide(IntNode n) {
		if (n==null) return n;
		
		IntNode currNode = n;
		IntNode runner = n.next;
		
		while(runner != null && runner.next != null) {
			currNode = currNode.next;
			runner = runner.next.next;
		}
		
		IntNode retNode = currNode.next;
		currNode.next = null;
		return (retNode);
		
	}
	
}
