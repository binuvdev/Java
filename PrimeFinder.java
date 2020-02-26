package com.java.study;

import java.util.*;

public class PrimeFinder {
	
	static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	
	
	static boolean checkPrime(int num) {
		
		int sqrt = (int) Math.sqrt(num);
		
		for (Integer  prime : primes) {
			if (prime <= sqrt && num % prime == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main (String[] args) {
		int number = 27;
		
		for (int i =2; i<=number;i++) {
			if (checkPrime(i)) {
				primes.add(i);
			}
		}
		
		System.out.println("Prime numbers till " + number);
		for (Integer i : primes) {
			//System.out.print(i + " ,");
			System.out.println(i);
		}	
		
	}
	
}
