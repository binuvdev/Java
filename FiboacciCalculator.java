package com.java.study;

public class FiboacciCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findFinanci(103));

	}
	
	static long findFinanci(int n) {
		long[] cache = new long[n+1];
		for (int i=0;i<cache.length;i++) {
			cache[i] = -1;
		}
		findFinanciFor(n, cache);
		return cache[n];
	}	
	
	static void findFinanciFor(int n, long[] cache) {
		if (n == 0 ) { cache[0] = 0; return;}
		if (n == 1 ) { cache[1] = 1; return;}
		if (cache[n] != -1) {
			return;
		} else {
			findFinanciFor(n-1, cache);
			findFinanciFor(n-2,cache);
			cache[n] = cache[n-1] + cache[n-2];
		}
		return;
	}	

}
