package com.java.study;

public class Urlfi {

	public static void main (String[] args) {
		
		String aStr = "This is my Test Case                ";
		
		Urlfi aUrl = new Urlfi();
		
		System.out.println(aUrl.replaceSpaces(aStr, 20));
		
		System.out.println(aUrl.replaceSpacesInCharArray(aStr.toCharArray(), 20));
		
		
		
	}
	
	String replaceSpaces(String aStr, int length) {
		
		char space = " ".charAt(0);
		String resultStr = "";
		
		for (int i =0; i < length; i++) {
			
			char currChar = aStr.charAt(i);
			
			if (currChar == space) {
				resultStr = resultStr + "%20";
			} else {	
				resultStr = resultStr + currChar;
			}	
				
		}
		return resultStr;
	}
	
	
	char[] replaceSpacesInCharArray(char[] aStr, int length) {
		
		char space = ' ';
		char a = '%';
		char b = '2';
		char c = '0';
		
		
		for (int i =0; i < length; i++) {
			

			if (aStr[i] == space) {
				for (int j = length; j > i; j--) {
					aStr[j+2] = aStr[j];
				}
				
				aStr[i] = a;
				aStr[++i] = b;
				aStr[++i] = c;
				i++;
				length = length + 2;
			}	
				
		}
		return aStr;
	}	
	
}
