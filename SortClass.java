package com.java.study;

//Merge Sort & 10.1

public class SortClass {
	
	
	public static void main (String[] args) {
		int[] arr = {1,6,2,5,9,4,43,22,11,77,99};
		
		int[] A = {13,25,35,47,66};
		int[] B = {1,34,55,78,99};
		int[] C = new int[A.length + B.length];
		
		

		
		for (int i=0;i<A.length;i++) {
			C[i] = A[i];
		}

		for (int i=0;i<B.length;i++) {
			C[A.length + i] = B[i];
		}
				
		mergeMe(C, 0, C.length-1, A.length-1);

		for(int i=0;i<C.length;i++) {
			System.out.print(C[i] + " ");
		}	
		System.out.println(" ");
//==================  End of 10.1		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}	
		
		System.out.println(" ");
		sortMe(arr,0,arr.length - 1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	static void sortMe(int[] arr,int start,int end) {
		
		if (arr == null || arr.length == 0) return;
		
		if (start>=end) return;
		
		int mid = (start + end) / 2;
		

		sortMe(arr,start,mid);
		sortMe(arr,mid+1,end);
		
		mergeMe(arr,start,end,mid);
		
	}
	
	static void mergeMe(int[] arr,int start,int end,int mid) {
		if (start == 0 && end == 0) return;
		
		int[] array1 = new int[mid - start + 1];
		
		int[] array2 = new int[end - mid];
		
		//Copy data to temporary arrays
		
		for(int i = 0; i<array1.length;i++) {
			array1[i] = arr[start + i];
		}


		for(int i = 0; i<array2.length;i++) {
			array2[i] = arr[mid+1+i];
		}
		
		int i = 0,  j = 0, k=start;
		
		while (i<array1.length && j<array2.length) {
			
			if (array1[i] < array2[j]) {
				arr[k] = array1[i];
				k++;
				i++;
			} else {
				arr[k] = array2[j];
				k++;
				j++;			
			}
			
			
		}
		
		while(i<array1.length) {
			arr[k] = array1[i];
			k++;
			i++;
		}

		while(j<array2.length) {
			arr[k] = array2[j];
			k++;
			j++;
		}		
		
		return;
		
	}
}
