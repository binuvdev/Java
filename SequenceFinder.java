package com.java.study;

//16.17

public class SequenceFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,  -8,  3,  2,  4,  -7, -9};
		
		System.out.println(findSequence(input));		

	}
	
	static String findSequence(int[] input) {
		int start = -1;
		int end   = -1;
		int sum   = Integer.MIN_VALUE;
		boolean keepLooking = true;

		int i = 0;
		int j = 0;
		int loopSum = 0;
		
		while (i<input.length) {
			
			while ( keepLooking && j<input.length) {
				loopSum = loopSum + input[j];
				if (loopSum > sum) {
					start = i;
					end = j;
					sum = loopSum;
					System.out.println("Sum: " + sum +"; " + "Start: " + start + "; " + "End: " + end);
					if (j==input.length-1) {
						keepLooking = false;
					} else {
						j++;
					}
				} else {
					j++;
				}
			}
			
			i++;
			j = i;
			loopSum = 0;
			keepLooking = true;
		}
		
		return "Sum: " + sum +"; " + "Start: " + start + "; " + "End: " + end; 
		
	}	
	

}
