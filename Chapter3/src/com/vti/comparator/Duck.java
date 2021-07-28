package com.vti.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck> {

	private String name;
	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Duck o) {
		return name.compareTo(o.name);
	}

	public static void main(String[] args) {
		Comparator<Duck> byWeight = new Comparator<Duck>() {

			@Override
			public int compare(Duck o1, Duck o2) {
				// TODO Auto-generated method stub
				return o1.weight - o2.weight;
			}
		};

		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack", 7));
		ducks.add(new Duck("Puddles", 10));

		Collections.sort(ducks);
		System.out.println(ducks);

		Collections.sort(ducks, byWeight);
		System.out.println(ducks);
	}
}
