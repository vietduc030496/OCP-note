package com.vti.advance.designpattern.imutable;

import java.util.ArrayList;
import java.util.List;

public class AnimalMutable {

	private final List<String> favoriteFoods;

	public AnimalMutable(List<String> favoriteFoods) {
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}

	public List<String> getFavoriteFoods() {
		return favoriteFoods;		// MAKE CLASS MUTABLE
	}
	
	

}
