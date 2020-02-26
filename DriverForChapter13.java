package com.java.study;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DriverForChapter13 {
	public static void main(String[] args) {
		
		List<Country> aList = new ArrayList<Country>();
		
		aList.add(new Country("USA","NA", 100));
		aList.add(new Country("Mexico","NA", 200));
		aList.add(new Country("Argentina","SA", 150));
		aList.add(new Country("Canada","NA", 250));
		aList.add(new Country("Brazil","SA", 400));
		aList.add(new Country("India","Asia", 700));
		
		List<String> countryList = new ArrayList<String>();
		
		countryList.add("USA");
		countryList.add("Maxico");
		countryList.add("India");
		
		System.out.println(calculatePop(aList, "NA"));
		
	}
	
	static int calculatePop(List<Country> aList, String continent) {
		
		Stream<Integer> populations = aList.stream().map(c -> c.getContinent().equalsIgnoreCase(continent) ? c.getPopulation() : 0 );
				
		return populations.reduce(0, (a,b) -> a+b);
		
		
	}
}
