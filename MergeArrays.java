package com.java.study;

//Given k sorted arrays, merge them into a single sorted array.
//Not the best solution, however it is not the brute force either.
//Using priority Queue - better solution (Time complexity because priority queue sorts the 
//entries

public class MergeArrays {
	
	public static void main (String[] args) {
		
		int[][] input = {{ 1 , 4 , 7 },{ 2 , 5 , 8 },{ 3 , 6 , 9 }};
		
		int [] result = merge(input);
		for(int i : result) {
			System.out.print(i + " ");
		}
		
	}

	static int[] merge(int[][] inputArrays) {
		
		int[] pointers = new int[inputArrays.length];
		
		int lengthOfResult = 0;
		
		for (int i = 0; i < inputArrays.length; i++) {
			lengthOfResult = lengthOfResult + inputArrays[i].length;
		}
		
		int[] resultArray = new int[lengthOfResult];
		
		for(int i = 0; i < lengthOfResult; i++) {
			resultArray[i] = findMin(inputArrays,pointers); 
		
		}
		return resultArray;
		
	}

	static int findMin(int[][] inputArrays,int[] pointers) {

		int min = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i = 0; i<pointers.length; i++) {
			if (pointers[i] < inputArrays[i].length && inputArrays[i][pointers[i]] < min) {
				min = inputArrays[i][pointers[i]]; 
				index = i;
			}	
		}
		
		pointers[index] = pointers[index] + 1;
		

		
		return min;

	}	
	
}
