package com.vti.streams.intermediate;

import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		// filter()
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.filter(x -> x.startsWith("m")).forEach(System.out::println); // monkey
		
		// distinct()
		Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
		s2.distinct().forEach(System.out::println); // duckgoose
		
		
	}

}
