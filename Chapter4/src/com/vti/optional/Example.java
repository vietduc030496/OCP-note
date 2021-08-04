package com.vti.optional;

import java.util.Optional;

public class Example {

	public static void main(String[] args) throws IllegalAccessException {
		System.out.println(average(90, 100)); // Optional[95.0]
		System.out.println(average()); // Optional.empty

		Optional<Double> opt = average(90, 100);
		if (opt.isPresent()) {
			System.out.println(opt.get());
		}
		
		opt.ifPresent(System.out::println);
		
		// empty Optional
		Optional<Double> opt2 = average();
		System.out.println(opt2.orElse(Double.NaN)); // NaN
		System.out.println(opt2.orElseGet(Math::random)); // Number random
		System.out.println(opt2.orElseThrow(IllegalAccessException::new)); // Throw IllegalAccessException
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0) {
			return Optional.empty();
		}
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return Optional.of((double) sum / scores.length);
	}

}
