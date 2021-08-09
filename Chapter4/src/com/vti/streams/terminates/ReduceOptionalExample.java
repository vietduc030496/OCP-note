package com.vti.streams.terminates;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceOptionalExample {

	public static void main(String[] args) {
		BinaryOperator<Integer> op = (a, b) -> a * b;
		Stream<Integer> emptyStream = Stream.empty();
		Stream<Integer> oneElement = Stream.of(1);
		Stream<Integer> multiElement = Stream.of(3, 5, 6);
		
		Optional<Integer> reduce = emptyStream.reduce(op);
		Optional<Integer> reduce2 = oneElement.reduce(op);
		Optional<Integer> reduce3 = multiElement.reduce(op);
		
		reduce.ifPresent(System.out::println); // nothing
		reduce2.ifPresent(System.out::println);	// 1
		reduce3.ifPresent(System.out::println); // 90
	}

}
