package com.java.study;

public class ListNode<T> {
	public ListNode(T i, ListNode<T> obj) {
		// TODO Auto-generated constructor stub
		this.data = i;
		next = obj;
	}
	public T data;
	public ListNode<T> next;
	
	public void printList() {
		ListNode<T> currNode = this;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		
	}

}
