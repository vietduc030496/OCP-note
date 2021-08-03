package com.vti.exam.udemy;

/**
 * @author duc.nguyenviet
 *
 * Question 7
 */
public class Test3 {

	public static void main(String[] args) {
		Printer2<String> printer = new Printer2<>();
		System.out.println(printer);
	}

}

class Printer2<T extends String> {

}
