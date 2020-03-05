package com.java.study;

//Find median of two integer arrays

import java.util.Arrays;

public class MeanFinder {
	
	public static void main (String[] args) {
		
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4,6};
		
		System.out.println(findMedian(arr1, arr2));
		
	}

	static double findMedian(int[] array1, int[] array2) {
		int[] array3 = new int[array1.length + array2.length];
		
		int i = 0;
		
		for (int a: array1) {
			array3[i] = a;
			i++;
		}
		
		for (int a: array2) {
			array3[i] = a;
			i++;
		}
		
		Arrays.sort(array3);
		
		//division by 2.0 is important to convert to double
		
		return array3.length % 2 == 0 ? (array3[array3.length/2] + array3[(array3.length/2) - 1])/2.0 : array3[array3.length/2];

	}	
	
}
