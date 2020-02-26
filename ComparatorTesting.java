package com.java.study;

import java.util.Arrays;

public class ComparatorTesting {
	
	public static void main(String[] args) {
		String[] arr = {"AAAA", "Binu", "ZZZZ"};
		
		Arrays.sort(arr,new BinusComparator());
		
		for(String s : arr) {
			System.out.println(s);
		}
		
	}

}
