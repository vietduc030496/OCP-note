package com.vti.advance.exam.udemy.lamda;

/**
 * @author duc.nguyenviet
 *
 * Question 79
 */
public class Test79 {

	public static void main(String[] args) {
		method(new I10() {
			@Override
			public void m(String s) {
				System.out.println(s.toUpperCase());
			}

		}, "good morning!");
		
		method(s -> {System.out.println(s.toLowerCase());}, "good morning!");
	}

	private static void method(I10 obj, String text) {
		obj.m(text);
	}

}

interface I10 {
	void m(String s);
}
