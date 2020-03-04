package com.java.study;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneWords {
	
	public static void main (String[] args) {
		HashMap<Integer,char[]> phone = new HashMap<>();
		
		phone.put(1,new char[] {'a'});
		phone.put(1,new char[] {'1'});
		phone.put(2,new char[] {'a','b','c'});
		phone.put(3,new char[] {'d','e','f'});
		phone.put(4,new char[] {'g','h','i'});
		phone.put(5,new char[] {'j','k','l'});
		phone.put(6,new char[] {'m','n','o'});
		phone.put(7,new char[] {'p','q','r','s'});
		phone.put(8,new char[] {'t','u','v'});
		phone.put(9,new char[] {'w','x','y','z'});
		phone.put(0,new char[] {'0'});
		
		
		String phoneNumber = "5122782762";
		HashSet<String> result = new HashSet<>();
		
		findWordsForPhoneNumber(phone, phoneNumber, 0, "",result);
		
		for(String entry: result) {
			System.out.println(entry);
		}
		
	}

	static void findWordsForPhoneNumber(HashMap<Integer,char[]> phone, String phoneNumber, int index, String word, HashSet<String> result ) {
		
		if (phoneNumber.length() == word.length()) {
			result.add(word);
			return;
		}
		
		//Converting character to Integer
		//We can use Character.getNumericValue(ch)
		//char[] lettersForNumber = phone.get(Integer.parseInt(String.valueOf((phoneNumber.charAt(index)))));
		char[] lettersForNumber = phone.get((phoneNumber.charAt(index)) - '0');
		for(char adigit : lettersForNumber) {
			findWordsForPhoneNumber(phone, phoneNumber, index + 1, word + adigit ,result);
		}
		
	}
	
}
