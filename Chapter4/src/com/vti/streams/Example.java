package com.vti.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		Stream<String> empty = Stream.empty(); // count = 0
		Stream<Integer> singleElement = Stream.of(1); // count = 1
		Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3

		// List streams
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListparallel = list.parallelStream();

		Stream<Double> randoms = Stream.generate(Math::random); // infinity streams
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2); // infinity streams
	}

}
