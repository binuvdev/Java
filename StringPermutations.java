package com.java.study;

import java.util.ArrayList;

//8.7 & 8.8
public class StringPermutations {
	
	public static void main(String[] args) {
		
		String text = "aabb";
		
		//ArrayList<String> list = getPerms(text);
		
		//System.out.println(list.toString());
		
		//8.9
		
		printParems(1);
		
	}
	
	static void printParems(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i<=n;i++) {
			sb.append("()");
		}
		
		String input = sb.toString();
		
		ArrayList<String> aList = getPerms(input);
		
		for (String entry: aList) {
			if (entryValid(entry)) {
				System.out.println(entry); 
			}
		}
		
	}
	
	static boolean entryValid(String entry) {
		
		int sum =0;
		for(char a: entry.toCharArray()) {
			if (a=='(') {
				sum = sum + 1;
			} else {
				sum = sum - 1;
			}
			
			if (sum < 0) return false;
		}
		
		return true;
		
	}
	static ArrayList<String> getPerms(String aText) {
		
		if (aText == null) return null;
		
		ArrayList<String> resList = new ArrayList<String> ();
		
		if (aText.length() == 0) {
			resList.add("");
			return resList;
		}
		
		char firstChar = aText.charAt(0);
		String reminder = aText.substring(1);
		ArrayList<String> moreList = getPerms(reminder);
		for(String item: moreList) {
			for(int i=0;i<=item.length(); i++) {
				String updatedItem = insertChar(item,firstChar,i);
				if(!resList.contains(updatedItem)) {  //For 8.8
					resList.add(updatedItem);
				}									  //For 8.8	
			}
		}
		
		return resList;
		
	}
	
	static String insertChar(String aStr, char a, int i) {
		String firstPart = aStr.substring(0,i);
		String secondPart = aStr.substring(i);
		
		return firstPart + a + secondPart;
		
	}	
		
}
	
