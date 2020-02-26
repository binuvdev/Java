package com.java.study;

import java.awt.Point;
import java.util.ArrayList;

//8.2
public class MazePath {
	
	public static void main(String[] args) {
		
		//boolean[][] maze = new boolean[4][4];
		boolean[][] maze = { {true,true,true,true,true},
							 {true,true,true,true,true},
							 {true,true,true,true,true},
							 {true,true,true,true,true},
							 {true,true,true,true,true}
							};
		
		ArrayList<Point> path = new ArrayList<Point> ();
		
		path = getPath(maze);
		
		if (path != null) {
			for(Point p : path) {
				System.out.println(p.toString());
			}
		}	
		
	}
	
	static ArrayList<Point> getPath(boolean[][] maze) {
		
		if (maze==null || maze.length == 0) return null;
		
		ArrayList<Point> path = new ArrayList<Point> ();
		
		if (getPath(maze, maze.length - 1, maze[0].length - 1, path)) {
			return path;
		}
		
		return null;
	}
	
	
	static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path) {
		
		if (col<0 || row < 0 || !maze[row][col]) return false;
		
		boolean reachedOrigin = false;
		
		if (row==0 && col == 0) reachedOrigin = true;
		
		if (reachedOrigin || getPath(maze,row-1,col,path) || getPath(maze, row,col-1,path)) {
			Point p = new Point(row,col);
			path.add(p);
			return true;
		}
		
		return false;

	}
	
}
