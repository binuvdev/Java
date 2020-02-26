package com.java.study;

public class SwapNumbers {

	public static void main (String[] args) {
		
		int a = 15;
		int b = 12;
		
		System.out.println("a = " + a + "; b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = " + a + "; b = " + b);
		
	}
	
}
