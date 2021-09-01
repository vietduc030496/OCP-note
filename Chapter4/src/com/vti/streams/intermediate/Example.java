package com.vti.streams.intermediate;

import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		// filter()
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.filter(x -> x.startsWith("m")).forEach(System.out::println); // monkey
		
		// distinct()
		Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
		s2.distinct().forEach(System.out::print); // duckgoose
		
		// limit() and skip()
		Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
		s3.skip(5).limit(2).forEach(System.out::print); // 67
		
		// map
		Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
		s4.map(String::length).forEach(System.out::print); // 676
		
	}

}
