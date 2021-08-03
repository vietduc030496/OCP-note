package com.vti.builtin;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = s -> s.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		BiPredicate<String, String> bp1 = String::startsWith;
		BiPredicate<String, String> bp2 = (s1, s2) -> s1.startsWith(s2);
		
		System.out.println(bp1.test("chicken", "chick"));
		System.out.println(bp2.test("chicken", "chick"));
	}

}
