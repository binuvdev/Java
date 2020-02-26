package com.java.study;



import java.io.*;
import java.util.*;

public class FloodSolution {
  private static InputReader in;
  private static PrintWriter out;
  public static int N,M,X,Y,value, newValue;
  public static int[][] grid;
  public static boolean[][] vis;
  

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out, true);
    N = in.nextInt();
    M = in.nextInt();
    grid = new int[N][M];
    for (int i = 0; i < N; i++) for (int j = 0; j < M; j++)
      grid[i][j] = in.nextInt();
    
    System.out.println("Enter click pointer");
    
    X = in.nextInt();
    Y = in.nextInt();
    newValue = in.nextInt();
    
    
    int max = 0;
    boolean rowDone = false, columnDone = false;
    
    vis = new boolean[N][M];

    
    value = grid[X][Y];
    dfsFlood(X,Y);
    
    for (int[] s: grid) {
    	out.println(Arrays.toString(s));
    }
    //out.println(Arrays.deepToString(grid));
    out.close();
    System.exit(0);
  }
  
  public static void dfsFlood(int i, int j) {
    if (i < 0 || j < 0 || i >= N || j >= M || vis[i][j] == true || grid[i][j] != value) return ;
    vis[i][j] = true;
    grid[i][j] = newValue;
    dfsFlood(i+1,j);
    dfsFlood(i,j+1);
    dfsFlood(i-1,j);
    dfsFlood(i,j-1);
    dfsFlood(i+1,j+1);
    dfsFlood(i+1,j-1);
    dfsFlood(i-1,j+1);
    dfsFlood(i-1,j-1);
    return;
  }
  
  


  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }
  }


}