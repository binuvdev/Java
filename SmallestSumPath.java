package com.java.study;

//https://leetcode.com/problems/minimum-path-sum/

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SmallestSumPath {
	
	public static void main(String[] args) {
		
		int pathSum;
		int[][] input = {{1,3,1},
  						 {1,5,1},
						 {4,2,1} };
		Set<Integer> resultSet = new HashSet<>();
		
		
		findMinSum(0,0,input,0,resultSet);
		
		System.out.println(resultSet.toString());
		
		System.out.println(resultSet.stream().min(Comparator.comparing(Integer::valueOf)).get());
		
		System.out.println(resultSet.stream().mapToInt(x->x).min().getAsInt());
		
		
	}
	
	static void findMinSum(int x, int y, int[][] input, int sum,Set<Integer> resSet ) {
		
		if (x >= input.length || y >= input[0].length) return;
		
		sum = sum + input[x][y];
		
		if  (x == input.length - 1 && y == input[0].length - 1) {
			resSet.add(sum);
		}
		
		findMinSum(x+1, y, input,sum,resSet );
		findMinSum(x, y+1, input,sum,resSet );
		
	}
	
	
	

}
