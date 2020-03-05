package com.java.study;

import java.util.HashMap;
import java.util.Map;

//Question : Given a matrix, find the path from top left to bottom right with the greatest
//product by moving only down and right. This prints the paths and products as well as Maximum product
//Brute force algorithm

public class FindAllPaths {
	
	public static void main(String[] args) {
		
		int[][] input = { {1,2,3},
						  {4,5,6},
						  {7,8,9}
						};
		
		
		//Map<Integer,String> resMap = new HashMap<>();
		String path = "";
		int product = 1;
		
		findPathsAndProducts(input, 0, 0, path, product);
		
		System.out.println(findMaxProduct(input,0,0, product));
		
		
	}
	
	static void findPathsAndProducts(int[][] input, int x, int y,  String path, int product) {
		
		if (x >= input.length || y >= input[0].length) return;
		
		
		path = path + input[x][y] + " ";
		product = product * input[x][y];

		if (x == input.length - 1 && y == input[0].length - 1) { 
			System.out.println(path + " --> " + product);
		}		
		
		findPathsAndProducts(input, x + 1, y, path, product);
		
		findPathsAndProducts(input, x, y + 1, path, product);
		
		

	}


	static int findMaxProduct(int[][] input, int x, int y,int product) {
		
		if (x >= input.length || y >= input[0].length) return product;
		product = product * input[x][y];

		return Math.max(findMaxProduct(input, x + 1, y,product), findMaxProduct(input, x, y + 1, product));		

	}	


}
