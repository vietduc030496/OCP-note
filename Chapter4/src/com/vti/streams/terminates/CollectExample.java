package com.vti.streams.terminates;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(word.toString()); // wolf

		Stream<String> stream2 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set); // [f, l, o, w]
		
		Stream<String> stream3 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set2 = stream3.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2); // [f, l, o, w]
		
		Stream<String> stream4 = Stream.of("w", "o", "l", "f");
		Set<String> set3 = stream4.collect(Collectors.toSet());
		System.out.println(set3); // [f, w, l, o]
	}

}
