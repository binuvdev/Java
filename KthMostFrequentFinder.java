package com.java.study;
//Given a list of strings, write a function to get the kth most frequently
//occurring string.
//Ex:
//kthMostFrequent({ "a" , "b" , "c" , "a" , "b" , "a" }, 0 ) = "a"
//kthMostFrequent({ "a" , "b" , "c" , "a" , "b" , "a" }, 1 ) = "b"
//kthMostFrequent({ "a" , "b" , "c" , "a" , "b" , "a" }, 2 ) = "c"
//kthMostFrequent({ "a" , "b" , "c" , "a" , "b" , "a" }, 3 ) = null


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KthMostFrequentFinder {

	public static void main(String[] args) {
		
		int k = 2;
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("a");
		aList.add("b");
		aList.add("a");
		
		
		System.out.println(kthMostFrequent(aList,k));
		
	}
	
	
	static String kthMostFrequent(ArrayList<String> aList, int k) {
		Map<String,Integer> aMap = new HashMap<String,Integer>();
		
		Map<Integer,String> countMap = new HashMap<Integer,String>();
		int max = 1;
		
		if (k<0) return null;
		
		if (aList == null) return null;
		
		for(String str : aList) {
			if(aMap.containsKey(str)) {
				aMap.put(str, aMap.get(str)+1);
				countMap.put(aMap.get(str), str);
				if (aMap.get(str) > max) {
					max = aMap.get(str);
				}
			} else {
				aMap.put(str,1);
				countMap.put(1,str);
			}	
		} 
		
		if (max <= k ) return null;
		
		return countMap.get(max - k);
		
/*	This is another way of doing with out using the countMap	
		
		for(Entry<String,Integer> aEntry : aMap.entrySet()) {
			if (aEntry.getValue() == max - k) {
				return aEntry.getKey();
			}	
		}
		
		return null;
*/

	}
}
