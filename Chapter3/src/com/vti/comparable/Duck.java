package com.vti.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck> {

	private String name;

	public Duck(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + "]";
	}

	@Override
	public int compareTo(Duck d) {
		return name.compareTo(d.name);
	}

	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<Duck>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("Puddles"));
		
		Collections.sort(ducks);

		
		Collections.sort(ducks);
		System.out.println(ducks);
	}
}
