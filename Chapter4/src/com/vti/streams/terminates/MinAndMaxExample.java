package com.vti.streams.terminates;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author duc.nguyenviet
 * 
 * Terminal Operator
 */
public class MinAndMaxExample {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("monkey", "ape", "bonobo");
		Optional<String> min = stream.min(String::compareTo);
		min.ifPresent(System.out::println);
		
		Stream<String> stream2 = Stream.of("monkey", "ape", "bonobo");
		Optional<String> max = stream2.max(String::compareTo);
		max.ifPresent(System.out::println);
		
		Stream<String> stream3 = Stream.empty();
		Optional<String> min3 = stream3.min(String::compareTo);
		System.out.println(min3.isPresent()); // false for min never call when stream is empty
		
	}

}
