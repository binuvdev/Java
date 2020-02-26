package com.java.study;

import java.util.Stack;

public class LinkedListPalidrome {
	
	public static void main(String[] args) {
		
		Node aList = new Node("M");
		Node head = aList;
		aList.appendToLast("A");
		aList.appendToLast("L");
		aList.appendToLast("A");
		aList.appendToLast("Y");
		aList.appendToLast("A");
		aList.appendToLast("L");
		aList.appendToLast("A");
		aList.appendToLast("M");
		
		System.out.println(checkPalidrome(head));
		
	}
	
	static boolean checkPalidrome(Node aList) {
		
		if (aList == null) return false;
		
		if (aList.next == null) return true;
		
		Node fast, slow;
		
		fast = aList.next;
		slow = aList;
		Stack<String> aStack = new <String>Stack(); 
		
		while (fast.next != null) {
			aStack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("Done");
		
		return true;
	}

}
