package com.java.study;

//Question : Given a matrix, find the path from top left to bottom right with the greatest
//product by moving only down and right.
//Dynamic Programming

public class MaxMatrixProduct {
	
	public static void main(String[] args) {
		
		int[][] input = { {-1,2,3},
				  		  {4,5,-6},
				  		  {7,8,9}
				};
		System.out.println(findMatrixProduct(input));
		
	}

	static int findMatrixProduct(int[][] matrix) {
		
		if (matrix.length == 0 || matrix[0].length == 0) return 0;

		int[][] maxValues = new int[matrix.length][matrix[0].length];
		int[][] minValues = new int[matrix.length][matrix[0].length];
		
		for(int i = 0; i< matrix.length; i++) {
			for(int j = 0; j< matrix[0].length; j++) {
				if (i == 0 && j == 0) {
					maxValues[i][j] = matrix[i][j];
					minValues[i][j] = matrix[i][j];
					continue;
				}
				
				if (i > 0 && j == 0 ) {
					maxValues[i][j] = Math.max(matrix[i][j] * maxValues[i - 1][j], 
								   matrix[i][j] * minValues[i - 1][j]);

					minValues[i][j] = Math.min(matrix[i][j] * maxValues[i - 1][j], 
								   matrix[i][j] * minValues[i - 1][j]);
				
				}
				
				if (i == 0 && j > 0 ) {
					maxValues[i][j] = Math.max(matrix[i][j] * maxValues[i][j - 1],
								   matrix[i][j] * minValues[i][j - 1]);

					minValues[i][j] = Math.min(matrix[i][j] * maxValues[i][j - 1],
								   matrix[i][j] * minValues[i][j - 1]);
				
				}

				if (i > 0 && j > 0 ) {
					maxValues[i][j] =  Math.max(Math.max(matrix[i][j] * maxValues[i - 1][j], 
														  matrix[i][j] * maxValues[i][j - 1]),
												Math.max(matrix[i][j] * minValues[i - 1][j],
														   matrix[i][j] * minValues[i][j - 1])
								   	   );

					minValues[i][j] = Math.min(Math.min(matrix[i][j] * maxValues[i - 1][j], 
														matrix[i][j] * maxValues[i][j - 1]),
											   Math.min(matrix[i][j] * minValues[i - 1][j],
													   	matrix[i][j] * minValues[i][j - 1]));
								   
				
				}
			
			}
		
		
		}
		
		return maxValues[matrix.length - 1][matrix[0].length - 1]; 

	}

}
