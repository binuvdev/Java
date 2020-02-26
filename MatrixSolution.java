package com.java.study;

public class MatrixSolution {

	
	public static void main(String[] args) {
	int[][] aMatrix = {{3,  0,   1, 30 },
					   {1,  20,  3, 5  },
					   {1,  20,  3, 4  },
					   {1,  20,  3, 0  },
					   {1,  20,  3, 0  },					   
					  };
	
	
	
	int M = aMatrix.length;
	int N = aMatrix[0].length;
	
	
	
	boolean[] rows = new boolean[M];
	boolean[] cols = new boolean[N];
	
	for (int i=0; i<M; i++) {
		for (int j = 0; j<N; j++) {
			if (aMatrix[i][j] == 0) {
				
				if (!rows[i]) {				
					for (int k = 0; k<j; k++) {
						aMatrix[i][k] = 0;
					}
					rows[i] = true;
				}
				
				if (!cols[j]) {
					for (int k = 0; k<i; k++) {
						aMatrix[k][j] = 0;
					}
					cols[j] = true;
				}	
				
			} else if (rows[i] || cols[j]) {
				aMatrix[i][j] = 0;
			}
		}
		
	}
	
	for (int i=0; i<M; i++) {
		for (int j = 0; j<N; j++) {
				System.out.print(aMatrix[i][j] + " ") ;
		}
		System.out.println();
	}	
	//System.out.println(N);
	
	}
}
