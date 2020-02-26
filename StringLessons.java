package com.java.study;

import java.util.Queue;

public class StringLessons {

	public static void main(String[] args) {
		
		StringLessons aLesson = new StringLessons();
		String str = "TactCoa";
		String str1 = "pales";
		String str2 = "pale";
		
		
		
		//System.out.println(aLesson.checkUnique(str));
		//System.out.println(aLesson.palidromeCheck(str.trim().toLowerCase()));
		//System.out.println(aLesson.checkNumberOfDifferences(str1,str2));
		//System.out.println(aLesson.oneEditAway(str1,str2));
		
		String str4 = "saabccccccccccccccccccccaaa";
		System.out.println(aLesson.compressString(str4));
	
	}
	
	boolean checkUnique(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			for (int j = i+1; j< str.length();j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
						
			}
			
			
		}
		return true;
		
	}
	
	boolean palidromeCheck(String str) {
		
		int[] charCount = new int[128];
		for(int i = 0; i<str.length();i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				charCount[str.charAt(i)] += 1;
			}	
		}
		
		boolean oddFound = false;
		
		for(int i = 0; i<128; i++) {
			if (charCount[i] % 2 != 0) {
				if (oddFound) {
					return false;
				}
				oddFound = true;
			}
		}
		
		return true;
		
	}
	
	boolean checkNumberOfDifferences(String str1, String str2) {
		int lengthDiff = str1.length() - str2.length();
		boolean diffFound = false;
		
		if (lengthDiff < -1 || lengthDiff > 1) {
			return false;
		}
		
		if (lengthDiff == 1) {
			for (int i=0, j=0; i<str1.length(); i++, j++) {
				if (str1.charAt(i) != str2.charAt(j)) {
					if (diffFound) {
						return false;
					} else {
						diffFound = true;
						j--;
					}
				}
			}
		}
		
		if (lengthDiff == -1) {
			for (int i=0, j=0; i<str2.length(); i++, j++) {
				if (str2.charAt(i) != str1.charAt(j)) {
					if (diffFound) {
						return false;
					} else {
						diffFound = true;
						j--;
					}
				}
			}
		}

		if (lengthDiff == 0) {
			for (int i=0; i<str2.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					if (diffFound) {
						return false;
					} else {
						diffFound = true;
					}
				}
			}
		}
		
		return true;
	}
	
	
	public static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				
				foundDifference = true;
			}
		}
		return true;
	}
	
	/* Check if you can insert a character into s1 to make s2. */
	public static boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}		
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}	
	
	public static boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return oneEditReplace(first, second);
		} else if (first.length() + 1 == second.length()) {
			return oneEditInsert(first, second);
		} else if (first.length() - 1 == second.length()) {
			return oneEditInsert(second, first);
		} 
		return false;
	}	
	
	
// Solution 1.6
	
	String compressString(String str) {
		
		int length = str.length();
		int counter = 1;
		int compareIndex = 0;
		
		if (length < 3) return str;
		
		char[] strChar = str.toCharArray();
		StringBuilder stBuffer = new StringBuilder();
		stBuffer.append(strChar[0]);
		for (int i=1; i< length; i++) {
			if(strChar[compareIndex] == strChar[i]) {
				counter +=1;
			} else if (counter > 1) {
				stBuffer.append(counter);
				counter = 1;
				compareIndex = i;
				stBuffer.append(strChar[i]);
			} else {
				stBuffer.append(strChar[i]);
				compareIndex = i;
			}
		}
		
		
		
		if (str.length() >= stBuffer.length()) {
			return stBuffer.toString();
		} else {
			return str;
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
}
