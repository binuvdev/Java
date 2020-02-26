package com.java.study;

//16.6

import java.util.Arrays;

public class FindMinDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1,11,2,15};
		int[] array2 = {19,18,127,235,5,127};
		
		//String[] test = {"abc","xyz","jih"};
		
		//Arrays.sort(test);
		
		//Arrays.stream(test).forEach(entry  -> System.out.println(entry));
		
		System.out.println(findSmallestDiff(array1,array2));

	}
	
	static int findSmallestDiff(int[] arrayA, int[] arrayB) {
		
		int smallDiff = Integer.MAX_VALUE;
		
		Arrays.sort(arrayA);  //O(AlogA)
		Arrays.sort(arrayB);  //O(BlogB)
		
		int i = 0;
		int j = 0;
		
		while (i < arrayA.length && j < arrayB.length) {
			smallDiff = Math.min(smallDiff, Math.abs(arrayA[i] - arrayB[j]));
			if (Math.abs(arrayA[i])< Math.abs(arrayB[j])) { i++; }
			else { j++; } 
		}
		
		return smallDiff;


	}
}
