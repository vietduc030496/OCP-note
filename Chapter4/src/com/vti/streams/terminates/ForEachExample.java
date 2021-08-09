package com.vti.streams.terminates;

import java.util.stream.Stream;

/**
 * @author duc.nguyenviet
 *
 *         Terminal Operator
 */
public class ForEachExample {

	public static void main(String[] args) {
		// one way to print the elements in the stream
		Stream<String> stream = Stream.of("Monkey", "Gorilla", "Bonobo");
		stream.forEach(System.out::println);
	}

}
