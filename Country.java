package com.java.study;
//13.7
public class Country {
	private String continent;
	private int population;
	private String name;
	
	public Country(String name, String con, int pop) {
		super();
		this.name = name;
		this.continent = con;
		this.population = pop;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public String getContinent() {
		return this.continent;
	}

	public String getName() {
		return this.name;
	}
	
	
}
