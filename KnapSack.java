package com.java.study;

public class KnapSack {

	
	public static void main(String[] args) {
		
		int[] value = {3,9,12,8};
		int[] weight = {1,3,4,2};
		int weight_limit = 5;
		System.out.println(findMaxValue(weight, value, value.length, weight_limit));
		
	}
	
	
	static int findMaxValue(int[] weight, int[] value, int numberOfItems, int weightLimit) {
		
		if (numberOfItems == 0 || weightLimit == 0) return 0;
		
		if (weight[numberOfItems - 1] > weightLimit) {
			return findMaxValue(weight, value, numberOfItems - 1, weightLimit);
		} else {
			return Math.max(findMaxValue(weight, value,numberOfItems - 1, weightLimit), 
					findMaxValue(weight, value, numberOfItems - 1, weightLimit - weight[numberOfItems - 1]) + value[numberOfItems - 1]);
		}	
	
	}	
	
}
