package com.vti.additions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

	public static void main(String[] args) {
		
		// Method reference
		Consumer<List<Integer>> methodRef1 = Collections::sort;
		Consumer<List<Integer>> lamda1 = l -> Collections.sort(l);
		
		String str = "abc";
		Predicate<String> methodRef2 = str::startsWith;
		Predicate<String> lamda2 = s -> str.startsWith(s);
		
		Predicate<String> methodRef3 = String::isEmpty;
		Predicate<String> lamda3 = s -> s.isEmpty();
		
		Supplier<ArrayList> methodRef4 = ArrayList::new;
		Supplier<ArrayList> lamda4 = () -> new ArrayList();
		
		// Removing Conditionally
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list); // [Magician, Assistant]
		list.removeIf(s -> s.startsWith("A"));
		System.out.println(list); // [Magician]
		
		// Updating All Elements
		List<Integer> listInt = Arrays.asList(1, 2, 3);
		listInt.replaceAll(x -> x * 2);
		System.out.println(listInt);	// [2, 4, 6]
	}

}
