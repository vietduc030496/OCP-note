package com.vti.streams.terminates;

import java.util.stream.Stream;

/**
 * @author duc.nguyenviet
 *
 *         Terminal Operator
 */
public class ReduceExample {

	public static void main(String[] args) {
		// without functional programming
		String[] array = new String[] { "w", "o", "l", "f" };
		String result = "";
		for (String s : array) {
			result += s;
		}
		System.out.println(result);

		// with functional programming
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", (s, c) -> s + c);
		System.out.println(word); // wolf
		
		// with method reference
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");
		String word2 = stream2.reduce("", String::concat);
		System.out.println(word); // wolf
		
		Stream<Integer> stream3 =  Stream.of(3, 5, 6);
		Integer reduce = stream3.reduce(1, (a, b) -> a * b);
		System.out.println(reduce);
	}

}
