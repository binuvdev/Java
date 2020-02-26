package com.java.study;

import java.util.Stack;

public class StackMin extends Stack<StackNode>{
	
	static int minValue = 99999;

	
	public StackNode push(StackNode aData) {
		aData.minValue = minValue;
		if (aData.data<this.minValue) {
			minValue = aData.data;
		} 
		super.push(aData);
		return aData;
	}

	public StackNode pop() {
		StackNode aNode = super.pop();
		minValue = aNode.minValue;
		return aNode;
	}

	public int min() {
		return minValue;
	}
	
	public static void main(String[] args) {
		StackMin aStack = new StackMin();

		aStack.push(new StackNode(30,0));
		aStack.push(new StackNode(50,0));
		System.out.println(aStack.min());
		aStack.push(new StackNode(10,0));
		aStack.push(new StackNode(20,0));
		aStack.push(new StackNode(1,0));
		aStack.push(new StackNode(17,0));
		System.out.println(aStack.min());
		
		aStack.pop();
		System.out.println(aStack.min());
		
		aStack.pop();
		System.out.println(aStack.min());
		aStack.push(new StackNode(2,0));
		System.out.println(aStack.min());		
		aStack.pop();
		aStack.pop();
		aStack.pop();
		aStack.pop();
		aStack.pop();
		System.out.println(aStack.min());	

		
	}
	
	
}
