package com.java.study;

import java.util.HashMap;

//16.12

public class XMLEncode {

	public static void main (String[] args) {
		
		String xmlStr = "<family lastName='McDowell' State='CA'> <Person firstName='Gayle'> </Person> </family>";
		
		HashMap<String, Integer> attrMap = new HashMap<String, Integer>();
		
		attrMap.put("family", 1);
		attrMap.put("Person", 2);
		attrMap.put("firstName", 3);
		attrMap.put("lastName", 4);
		attrMap.put("State", 5);
		
		System.out.println(encodeXML(xmlStr,attrMap));
	}
	
	
	static String encodeXML(String xml, HashMap<String, Integer> attrMap) {
		
		String encodedStr = "";
		
		String[] elements = xml.split(" ");
		
		for (String element : elements) {
			if (element.startsWith("</")) {
				encodedStr = encodedStr + " " + "0";
			} else if(element.startsWith("<")) {
				encodedStr = encodedStr +  " " +  attrMap.get(element.substring(1));
			} else {
				encodedStr = encodedStr +  " " +  attrMap.get(element.split("=")[0]) + " " + element.split("=")[1].substring(1,element.split("=")[1].length() - 1) ;
			}	
		
		}

		return encodedStr;



	}	
	
}

