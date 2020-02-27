package com.java.study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyCalculator {
	public static void main (String[] args) {
		
		String input = "2*3+5/6*3+15+2*3+5/6*3+15*100/34/7/6+2+66*5";
		//2*3+5/6*3+15+2*3+5/6*3+15*100/34/7/6+2+66*5
		
		System.out.println(calculate(input));
		
	}

	static double calculate(String exp) {
		Stack<String> calStack = new Stack<>();
		Queue<String> calQueue = new LinkedList<>();
		
		String op1, op2, item;
		StringBuilder num;
		double result;
		
		
		int i = 0;
		result = 0;
		
		while (i<exp.length()) {
			if (isOperation(exp.charAt(i))) {
				calQueue.add(Character.toString(exp.charAt(i)));
				i++;
			} else {
				num = new StringBuilder();
				while(i<exp.length() && !isOperation(exp.charAt(i))) {
					num.append(exp.charAt(i));
					i++;
				}
				calQueue.add(num.toString());
			}
		}
		
		
		while (!calQueue.isEmpty()) {
			
			item = calQueue.remove();
			if (item.equals("/") ) {
				op1 = calStack.pop();
				op2 = calQueue.remove();
				calStack.push(Double.toString(new Double(op1) / new Double(op2)));
			} else if (item.equals("*") ) {
				op1 = calStack.pop();
				op2 = calQueue.remove();
				calStack.push(Double.toString(new Double(op1) * new Double(op2)));
			} else {
				calStack.add(item);
			}
		}	
		
		calStack.forEach(v -> calQueue.add(v));
		
		result = new Double(calQueue.remove());
		
		while (!calQueue.isEmpty()) {		
			item = calQueue.remove();
			
			if (item.equals("+") ) {
				op2 = calQueue.remove();
				result = result + new Double(op2);
			}
			
			if (item.equals("-") ) {
				op2 = calQueue.remove();
				result = result - new Double(op2);
			}
		}
		
		return (result);

	}
	
	static boolean isOperation(char c) {
		
		switch (c) {
			case '/':
			case '*':
			case '+':
			case '-':	return true;
			default:	return false;
		}
		
		
	}
	
}
