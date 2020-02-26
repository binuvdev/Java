package com.java.study;

import java.util.HashMap;

//16.15 - Not very efficient

public class MasterMind {
	
	public static void main(String[] args) {
		
		String comp = "RGBY";
		
		String guess = "YBGR";
		
		HashMap<String, Integer> returnMap = findHits(comp, guess);
		
		System.out.println("Hits     : " + returnMap.get("Hits"));
		System.out.println("PsedoHits: " + returnMap.get("PsedoHits"));
		
	}
	
	
	static HashMap<String, Integer> findHits(String comp, String guess) {
		char[] compChar = comp.toCharArray();
		char[] guessChar = guess.toCharArray();
		
		int hits = 0;
		int pHits = 0;
		int index;
		
		for (int i = 0; i< guessChar.length; i++) {
			if (guessChar[i] == compChar[i]) {
				hits ++;
				compChar[i] = 'X';
				guessChar[i] = 'X';
			} 
		
		}
		
		for (int i = 0; i< guessChar.length; i++) {
			if (guessChar[i] != 'X') {
				for (int j=0; j<compChar.length;j++) {
					if ((guessChar[i] == compChar[j])) {
						pHits ++;
						compChar[j] = 'X';
						break;
					}
				}
			}	
		}
		
		HashMap<String, Integer> returnMap = new HashMap<String, Integer>();
		
		returnMap.put("Hits",hits);
		
		returnMap.put("PsedoHits",pHits);
		
		return returnMap;
	}	

}
