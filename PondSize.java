package com.java.study;
//16.19
public class PondSize {
	
	static int[][] pond = { {  0,  2,  1,  0  },
						  	{  0,  1,  0,  1  },
						  	{  1,  1,  0,  1  },
						  	{  0,  1,  0,  1  } };

	//static int[][] pond = { {  0,  2  }};
	//					  	{  0,  1 }};
	//					  	{  1,  1,  0,  1  },
	//					  	{  0,  1,  0,  1  } };
	
	
	static boolean[][] status = new boolean[pond.length][pond[0].length];
	
	public static void main(String[] args) {
		
		int size;
		
		for (int i=0;i<pond.length;i++) {
			for (int j = 0; j<pond[0].length; j++) {
				size = 0;
				size =  findPondStatus(i,j);
				if (size > 0) {
					System.out.println(size);
				}
			}
		}
		
	}
	
	static int findPondStatus(int x, int y) {
		int size = 0;
		//System.out.println("x: " + x + " - " + "y: " + y);
		
		if (x<0 || x>=pond.length || y<0 || y>=pond[0].length) {
			return 0;
		}
		
		if (status[x][y]) return 0;
		
		
		if (pond[x][y] > 0) return 0;

		if (pond[x][y] == 0 && !status[x][y]) {
			status[x][y] = true;
			size = 1;
		}
		status[x][y] = true;
		
		size = size + findPondStatus(x-1,y+1) + findPondStatus(x,y+1) + 
					  findPondStatus(x+1,y+1) + findPondStatus(x-1,y) +
					  findPondStatus(x+1,y) + findPondStatus(x-1,y-1) +
					  findPondStatus(x,y-1) + findPondStatus(x+1,y-1);
		
		
		return size;
	}
}
