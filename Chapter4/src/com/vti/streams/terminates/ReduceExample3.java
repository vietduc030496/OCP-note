package com.vti.streams.terminates;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExample3 {

	public static void main(String[] args) {
		BinaryOperator<Integer> op = (a, b) -> a * b;
		Stream<Integer> stream = Stream.of(3, 5, 6);
		System.out.println(stream.reduce(1, op, op)); // 90
	}

}
