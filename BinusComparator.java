package com.java.study;

import java.util.Comparator;

public class BinusComparator implements Comparator<String>{
	
	public int compare(String s1, String s2) {
		if(s1.startsWith("Binu")) {
			return 1;
		} else {
			//return s1.compareTo(s2);
			return -1;
		}
		
	}
}	
