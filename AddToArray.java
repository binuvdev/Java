package my.practices.examples;



public class AddToArray {
	
	public static void main(String arg[]) {
		AddToArray myObj = new AddToArray();
		
		int[] inputArray = {9,9,9,9};
		int num = 9;
		
		int[] result = myObj.AddNumtoArray(inputArray, num);
		
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}

//This function will take two parameters: An integer array and a number. 
//The function will add the number to the last digit in the array and return the new array
	
	int[] AddNumtoArray (int[] anArray, int num) {
		
		int aDigit = 0;
		int carry = 0; 
		
		int[] result = new int[anArray.length];
		
		for (int i=anArray.length - 1; i>=0; i--) {
			
			if (i==anArray.length - 1) {
				aDigit = anArray[i] + num;
			} else {
				aDigit = anArray[i] + carry;
			}
			carry = aDigit/10;
			aDigit = aDigit%10;
			result[i] = aDigit;
		}
		
		if (carry > 0) {
			int[] newResult = new int[result.length + 1];
			newResult[0] = carry;
			for (int i=0; i<result.length;i++) {
				newResult[i+1] = result[i];
			}
			result = newResult;
		}
		
		return result;
	}

}
