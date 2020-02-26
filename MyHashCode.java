package com.java.study;
import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;

public class MyHashCode {
	
	private String firstName = null;
	
	private String lastName = null;
	
	public MyHashCode(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	
	}
	
	
	public boolean equals(Object o) {
		if (!(o instanceof MyHashCode)) {
			return false;
		}
		MyHashCode myObj = (MyHashCode) o;
		
		
		if ((this.firstName.equals(myObj.firstName) && this.lastName.equals(myObj.lastName))) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public int hashCode() {
		//System.out.println(firstName.hashCode());
		//System.out.println(lastName.hashCode());
		//return 10;
		
		return firstName.hashCode() + lastName.hashCode();
	}
	
	
	public static void main(String[] args) {
		Set<MyHashCode> aHashCode = new HashSet();
		aHashCode.add(new MyHashCode("Binu","Vasudev"));
		System.out.println(aHashCode.contains(new MyHashCode("Binu","Vasudev")));
		
		Set<String> aHashSet = new HashSet();
		aHashSet.add("Binu");
		aHashSet.add("Priya");
		System.out.println(aHashSet.contains("Binu1"));
		
		Hashtable <String, String>aTable = new Hashtable<String, String>();
		aTable.put("abc", "aValue");
		
	}

}
