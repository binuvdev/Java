package com.java.study;

import java.util.Arrays;

//16.16

public class FindIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {2,1,4,3,6,5};
		
		System.out.println(findIndices(input));

	}
	
	static String findIndices(int[] input) {
		int[] copyArray = Arrays.copyOf(input, input.length);
		Arrays.sort(input);
		int start = -1;
		int end = -1;
		
		for (int i=0; i<input.length; i++) {
			if ( start == -1 && input[i] != copyArray[i]) {
				start = i;
				break;
			}
		}	

		for (int i=input.length-1; i>=0; i--) {
			if ( end == -1 && input[i] != copyArray[i]) {
				end = i;
				break;
			}
		}	
			
		return ("start: " + start + "   " + "end: " + end);
	}	
	

}
