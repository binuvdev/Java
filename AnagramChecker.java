package com.java.study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AnagramChecker {
	
	public static void main (String[] args) {
		
		String str1 = "ABCC";
		String str2 = "bac";
		
		System.out.println(isAnagram(str1,str2));
		
	}
	
	static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) return false;
		
		Set<Character> aSet = new HashSet<>();
		for(char c : str1.toLowerCase().toCharArray()) {
			aSet.add(c);
		}
		
		for(char c : str2.toLowerCase().toCharArray()) {
			aSet.remove(c);
		}
		
		return aSet.isEmpty();
		
	}

}
