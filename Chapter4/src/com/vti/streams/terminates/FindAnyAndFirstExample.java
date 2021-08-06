package com.vti.streams.terminates;

import java.util.stream.Stream;

/**
 * @author duc.nguyenviet
 *
 * Terminal Operator
 */
public class FindAnyAndFirstExample {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		
		s.findAny().ifPresent(System.out::println); // monkey
		infinite.findAny().ifPresent(System.out::println); // chimp
		
		 Stream<String> s2 = Stream.of("monkey", "gorilla", "bonobo");
		s2.findFirst().ifPresent(System.out::println); // monkey
	}

}
