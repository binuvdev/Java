package com.java.study;

public class Node {
	
	Node next = null;
	String data;
	
	Node(String data) {
		super();
		this.data = data;
	}
	
	void appendToLast(Node aNode) {
		Node currNode = this;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = aNode;
	}
	void appendToLast(String data) {
		Node newNode = new Node(data);
		Node currNode = this;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	

}
