package com.java.study;

public class MultiStack {
	
	int maxSize = 5;
	int currentStackSize = 0;
	LinkedStack activeStatck = new LinkedStack();
	Integer push(int data) {
		
		if (currentStackSize == maxSize) {
			LinkedStack newStack = new LinkedStack();
			newStack.next = activeStatck;
			activeStatck = newStack;
			currentStackSize = 0;
		}
		
		currentStackSize +=1;
		return activeStatck.aPlateStack.push(data);
		
		
	}
	
	Integer pop() {
		
		if (currentStackSize == 0) {
			activeStatck = activeStatck.next;
			currentStackSize = maxSize;
		}
		if (activeStatck == null ) return null;
		currentStackSize -= 1;
		return activeStatck.aPlateStack.pop();
		
		
	}
	
	public static void main (String[] args) {
		MultiStack aMultiStack = new MultiStack();
		aMultiStack.push(1);
		aMultiStack.push(2);
		aMultiStack.push(3);
		aMultiStack.push(4);
		aMultiStack.push(5);
		
		aMultiStack.push(6);
		aMultiStack.push(7);
		
		System.out.println(aMultiStack.pop());
		System.out.println(aMultiStack.pop());
		System.out.println(aMultiStack.pop());
		System.out.println(aMultiStack.pop());
		System.out.println(aMultiStack.pop());
		System.out.println(aMultiStack.pop());
		System.out.println(aMultiStack.pop());
		System.out.println(aMultiStack.pop());
		
		
	}

}
