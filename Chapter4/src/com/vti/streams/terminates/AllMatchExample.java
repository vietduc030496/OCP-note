package com.vti.streams.terminates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author duc.nguyenviet
 *
 *         Terminal Operator
 */
public class AllMatchExample {

	public static void main(String[] args) {
		//This example checks whether animal names begin with letters
		List<String> list = Arrays.asList("Monket", "2", "Chimp");
		Stream<String> infinite = Stream.generate(() -> "Chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(pred)); // true
		System.out.println(list.stream().allMatch(pred)); // false
		System.out.println(list.stream().noneMatch(pred)); // false
		System.out.println(infinite.anyMatch(pred)); // true
	}

}
