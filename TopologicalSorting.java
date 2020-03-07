package com.java.study;
//Given a list of packages that need to be built and the dependencies for each
//package, determine a valid order in which to build the packages.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopologicalSorting {

	public static void main(String[] args) {
		
		TopoNode node40 =new TopoNode(40);
		TopoNode node10 =new TopoNode(10);
		TopoNode node20 =new TopoNode(20);
		TopoNode node30 =new TopoNode(30);
		TopoNode node60 =new TopoNode(60);
		TopoNode node50 =new TopoNode(50);
		TopoNode node70 =new TopoNode(70);
 
		node40.addNeighbors(node10);
		node40.addNeighbors(node20);
		node10.addNeighbors(node30);
		node20.addNeighbors(node10);
		node20.addNeighbors(node30);
		node20.addNeighbors(node60);
		node20.addNeighbors(node50);
		node30.addNeighbors(node60);
		node60.addNeighbors(node70);
		node50.addNeighbors(node70);
		
		
		List<TopoNode> inputList = new ArrayList<>();
		inputList.add(node40);
		inputList.add(node70);
		inputList.add(node60);
		inputList.add(node50);
		inputList.add(node10);
		inputList.add(node20);
		inputList.add(node30);
		List<Integer> resList = sortInTopo (inputList);
		
		System.out.println(resList);
		
	}

static List<Integer> sortInTopo(List<TopoNode> aList) {
	
	List<Integer> resultList = new ArrayList<>();
	Set<Integer> tempVisit = new HashSet<>();

	for (TopoNode aNode : aList) {
		if (!resultList.contains(aNode.data)) {
			sortTopological(aNode, tempVisit, resultList);
		}	
	}
	
	return resultList;

}

static void sortTopological(TopoNode aNode, Set tempVisit, List resultList) {
	
	if (!aNode.visited) { 
		tempVisit.add(aNode.data);
		
		
		for (TopoNode currNode : aNode.getNeighbors()) {
			sortTopological(currNode, tempVisit, resultList);
		}
		
		tempVisit.remove(aNode.data);
		aNode.setVisted();
		resultList.add(aNode.data);
	}	


}

}
