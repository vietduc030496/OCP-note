package com.vti.builtin;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExample {

	public static void main(String[] args) {
		UnaryOperator<String> uo1 = String::toUpperCase;
		UnaryOperator<String> uo2 = s -> s.toUpperCase();
		
		System.out.println(uo1.apply("Chirp"));
		System.out.println(uo2.apply("Chirp"));
		
		BinaryOperator<String> bo1 = String::concat;
		BinaryOperator<String> bo2 = (s1, s2) -> s1.concat(s2);
		
		System.out.println(bo1.apply("baby", "chick"));
		System.out.println(bo2.apply("baby", "chick"));
	}

}
