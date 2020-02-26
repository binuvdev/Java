package com.java.study;


public class IntNode {
	
	IntNode next = null;
	int data;
	
	IntNode(int data) {
		super();
		this.data = data;
	}
	
	void appendToLast(IntNode aNode) {
		IntNode currNode = this;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = aNode;
	}
	
	

}
