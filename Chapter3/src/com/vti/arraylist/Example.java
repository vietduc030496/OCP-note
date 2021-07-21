package com.vti.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // empty list
		list.add("Fluffy"); // Fluffy
		list.add("Webby"); // Webby
		System.out.println(list); // [Fluffy, Webby]

		String[] array = new String[list.size()];
		array[0] = list.get(1); // Webby
		array[1] = list.get(0); // Fluffy
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "-");
	}
}
