package com.vti.advance.designpattern.builder;

import java.util.List;

public class Animal {
	
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;
	
	public Animal(String species, int age, List<String> favoriteFoods) {
		super();
		this.species = species;
		this.age = age;
		this.favoriteFoods = favoriteFoods;
	}
	
	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}

	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}

}
