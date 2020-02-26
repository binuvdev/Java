package com.java.study;

import java.util.Scanner;

public class ArrayReverse {

	public static void main (String[] args) {
		
		//int[] arr = {1,2,3,4,5,6,7};
		int n;
		
		
		

		Scanner myScan = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = myScan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter input array");
		for(int i = 0; i< n; i++) {
			arr[i] = myScan.nextInt();
		}
		
		System.out.println("Enter number of elements to reverse");
		
		int d = myScan.nextInt();
		
		
		
		ArrayReverse myAR = new ArrayReverse();
		myAR.printArray(arr);
		myAR.leftRotate(arr,d);
		myAR.printArray(arr);
		myScan.close();
		
	}
	
	private void printArray(int[] arr) {
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	private void leftRotate(int[] arr, int d) {
		if (d==0) {
			return;
		}
		int n = arr.length;
		if (d>n) {
			d = d % n;
		}
		reverseArray(arr,0,d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
		
	}
	
	private void reverseArray(int[] arr, int start, int end) {
		int temp = 0;
		
		while (start<end) {
			temp = arr[end];
			arr[end]= arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
		
	}
	
}
