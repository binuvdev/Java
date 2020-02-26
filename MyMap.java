package com.java.study;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class MyMap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> aMap = new HashMap<String,String>();
		aMap.put("Binu", "HHSC");
		aMap.put("Priya","HHSC");
		aMap.put("Advaith", "WRMS");
		aMap.put("Achyuth","BCE");
		
		System.out.println(aMap.keySet());
		System.out.println(aMap.values());
		
		System.out.println(aMap.entrySet());
		
		
		Set s = aMap.entrySet();
		
		
		Iterator it = s.iterator();
		
		Map.Entry<String,String> aEntry = null;
		
		while (it.hasNext()) {
			//System.out.println(it.next());
			aEntry = (Map.Entry<String, String>)it.next();
			System.out.println(aEntry.getKey());
			
		}
		
	}

}
