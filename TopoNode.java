package com.java.study;

import java.util.ArrayList;
import java.util.List;

public class TopoNode {
	int data;
	List<TopoNode> neighbors;
	boolean visited;
	
	
	TopoNode(int data) {
		this.data = data;
		this.neighbors = new ArrayList<TopoNode>();
		this.visited = false;
	}
	
	void addNeighbors(TopoNode aNeightbor) {
		this.neighbors.add(aNeightbor);
	}
	
	List<TopoNode> getNeighbors() {
		return this.neighbors;
	}
	
	boolean isVisited () {
		return visited;
	}
	
	void setVisted() {
		this.visited = true;
	}
}
