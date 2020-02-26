package com.java.study;

public class SimpleMultiply {
	public static void main(String[] args) {
		
		int i = 22;
		int j = 5;
		
		//System.out.println("Result = " + (i << 2));
		
		int z = multiply(i,j);
		System.out.println("Result = " + z);
		
	}	
		
	static int multiply(int i, int j) {
		int result = 0;
		
		if (j==0 || i ==0 ) return 0;
		
		
		result = result + multiply(i,j,result);
		
		return result;
	}
	
	static int multiply(int i, int j, int res) {
		
		if (j==0) return res;
		
		res= res + i;
		
		return multiply(i,j-1,res);
	}
		
}
