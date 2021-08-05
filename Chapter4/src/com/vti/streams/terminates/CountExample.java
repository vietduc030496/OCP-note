package com.vti.streams.terminates;

import java.util.stream.Stream;

/**
 * @author duc.nguyenviet
 *
 *         Terminal Operator
 */
public class CountExample {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(s.count());
	}

}
