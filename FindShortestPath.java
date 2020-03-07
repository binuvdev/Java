package com.java.study;
//Given a directed graph, find the shortest path between two nodes if one
//exists.  
//findShortestPath - Not efficient because it is finding all paths 
//findShortestPathBFS - Better solution using BFS. 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindShortestPath {

	public static void main (String[] args) {
		
		String path = "";
		
		TopoNode node1 =new TopoNode(1);
		TopoNode node2 =new TopoNode(2);
		TopoNode node3 =new TopoNode(3);
		TopoNode node4 =new TopoNode(4);
		TopoNode node5 =new TopoNode(5);
		
		node1.addNeighbors(node2);
		node1.addNeighbors(node3);
		node2.addNeighbors(node5);
		node5.addNeighbors(node4);
		node4.addNeighbors(node1);
		node4.addNeighbors(node3);
		
		List<String> resultSet = new ArrayList<String>();
		findShortestPath(node2,node3,"",resultSet);
		
		if (resultSet.isEmpty()) {
			System.out.println("No Path Found");
		} else {
			
			path = resultSet.get(0);
			for(int i = 1; i < resultSet.size(); i++) {
				if (resultSet.get(i).length() < path.length()) {
					path = resultSet.get(i);
				}
			}
			
			System.out.println(path);
			
		}
		
		System.out.println(findShortestPathBFS(node2,node3));
		
	}
	
	
	static List<String> findShortestPath(TopoNode start, TopoNode end, String path, List<String> resultList) {
		
		if (start.data == end.data) {
			resultList.add(path + "," + end.data);
		}
		if (!start.visited) {	
			if (path == "") {
				path = "" + start.data; 
			} else {
				path = path + "," + start.data; 
			}
			start.visited = true;
			for(TopoNode aNode : start.getNeighbors()) {
				findShortestPath(aNode,end, path,resultList);
			}
		}	
		
		return resultList;
	}

	static List<Integer> findShortestPathBFS(TopoNode start, TopoNode end) {
		
		List<Integer> resPath = new LinkedList<Integer>();
		
		if (start == null || end == null) return resPath;
		
		HashMap<Integer,Integer> parentMap = new HashMap<Integer,Integer>();
		
		Queue<TopoNode> tempQ = new LinkedList<TopoNode>();
		
		parentMap.put(start.data, null);
		
		tempQ.add(start);
		
		TopoNode currNode = start;
		
		while (!tempQ.isEmpty()) {
			currNode = tempQ.remove();
			if (currNode.data == end.data) break; 
			for(TopoNode aChildNode : currNode.getNeighbors()) {
				if (!parentMap.containsKey(aChildNode.data)) {
					tempQ.add(aChildNode);
					parentMap.put(aChildNode.data, currNode.data);
				}	
			}
			
		
		}
		
		if (!parentMap.containsKey(end.data)) return resPath;
		
		int aValue = end.data;
		resPath.add(0,aValue);
		while (parentMap.get(aValue) != null) {
			resPath.add(0,parentMap.get(aValue));
			aValue = parentMap.get(aValue); 
		}
		return resPath;
	}	
	
}
