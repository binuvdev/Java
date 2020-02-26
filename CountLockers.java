package com.java.study;
//6.9
public class CountLockers {
	
	public static void main(String[] args) {
		int size = 121;
		int[] arr = new int[size + 1];
		arr[0] = size; //All are open after 1st pass
		for (int i = 2; i<= size; i++) {
			for (int j = 1; j< (size + 1); j++) {
				if (j%i == 0) {
					if (arr[j] == 0 ) {
						arr[j] = 1;
						arr[0] = arr[0] - 1; //Locker closed
					} else {
						arr[j] = 0;
						arr[0] = arr[0] + 1; //Locker opened
					}
				}
			}
		}
		
		System.out.println("No. of open lockers - " + arr[0]);
		
	}
	
}
