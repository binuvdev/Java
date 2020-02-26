package com.java.study;

public class SortLessons {
	
	public static void main(String[] args) {
		
		SortLessons mySorter = new SortLessons();
		
		String str = "HelloAdvaith";
		
		int[] intArray = {1,3,2,6,3,88,33,99,2};
		
		mySorter.sortInt(intArray,0,intArray.length - 1);
		
		for(int j=0; j<intArray.length; j++) {
			System.out.print(intArray[j] + " ");
		}
		
	}
	
	void sortString(String str, int left, int right) {
		
		if (left>=right) {
			return;
			
		}
		
		
		
		
		
		return;
	}
	
	
	
	
	
	
	
	
	void sortInt(int[] intArray, int left, int right) {
		
		if (left >= right) {
			return;
		}
		
		int pivot = ( left + right ) / 2;
		
		int p = partition(intArray, left, right, pivot);
		sortInt(intArray, left,p-1);
		sortInt(intArray, p, right);
			
		return;
	}
	
	int partition (int[] intArray, int left, int right, int pivot) {
		
		while (left<=right) {
			while (intArray[left] < intArray[pivot]) {
				left++;
			}
			
			while(intArray[right] > intArray[pivot]) {
				right--;
			}
			
			if (left<=right) {
				int temp = intArray[left];
				intArray[left] = intArray[right];
				intArray[right] = temp;
				left++;
				right--;
			}	
		}
		
		
		return  left;
	}
			

}
