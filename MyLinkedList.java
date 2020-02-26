package com.java.study;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;


public class MyLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList aLinkedList = new LinkedList<String>();
		aLinkedList.add("Binu");
		aLinkedList.add("Priya");
		aLinkedList.add("Advaith");
		aLinkedList.add("Binu");
		aLinkedList.add("Achyuth");
		System.out.println(aLinkedList);
		
		ListIterator it = aLinkedList.listIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			it.set("Binu");
		}
		
		it = aLinkedList.listIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		aLinkedList.addFirst("Hello");
		it = aLinkedList.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
