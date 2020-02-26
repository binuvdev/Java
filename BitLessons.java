package com.java.study;

public class BitLessons {
	
	public static void main (String[] args) {
		int num = 7;
		
		//System.out.println(Integer.BYTES);
		
		int a = 5;
		int b = 7;
		
		int c = a ^ b;
		
		int count = 0;
		
		while (c!=0) {
			System.out.println(c & 1);
			count += c & 1;
			
			c >>>= 1;
		}
		
		System.out.println(count);
		
	}

}
