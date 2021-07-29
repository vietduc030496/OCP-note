package com.vti.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Fluffy", "Hoppy");
		Comparator<String> c = (s1, s2) -> s1.compareTo(s2);
		int index = Collections.binarySearch(names, "Hoppy", c);
		System.out.println(index);
		
		Set<Duck> set = new TreeSet<>(new Comparator<Duck>() {
			@Override
			public int compare(Duck o1, Duck o2) {
				return o1.getName().compareTo(o1.getName());
			}
			
		});
	}

}
