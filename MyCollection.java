package com.java.study;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class MyCollection {
	
	public static void main(String[] args) {
		Set aSet = new HashSet<String>();
		aSet.add("Binu");
		aSet.add("Priya");
		aSet.add("Advaith");
		aSet.add("Achyuth");
		aSet.add("Binu");
		
		System.out.println(aSet);
		
		TreeSet tSet = new TreeSet(aSet);
		
		System.out.println(tSet);
		
		tSet.add("Binu");
		
		Iterator it = tSet.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println(tSet);
		
	}

}
