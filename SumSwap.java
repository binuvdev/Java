package com.java.study;

//16.21
import java.util.ArrayList;
import java.util.List;

public class SumSwap {
	
	public static void main(String[] args) {
		
		int[] array1 = {1, 1, 1, 2, 2, 4};
		int[] array2 = {3, 3, 3, 6};
		System.out.println(findSwapNumbers(array1,array2));
		
		
	}
	
	static String findSwapNumbers(int[] array1, int[] array2) {

		int sum1 = 0;
		int sum2 = 0;
		List<Integer> array2List = new ArrayList<>();
		int diff = 0;
		
		for(int i: array1) {	
			sum1 += i;
		}
		

		for(int i: array2) {
			sum2 += i;
			array2List.add(i);
		}

		
		
		
		// sum1 - i + a = sum2 - a + i
		// a = ((sum2 - sum1)/2) + i 
		
		diff = (sum2 - sum1)/2;
		
		for(int i: array1) {
			if (array2List.contains(diff + i)) 
				return "(" + i + "," + (diff + i) + ")";
		}
		
		return "No swapping Numbers found";
	}


}
