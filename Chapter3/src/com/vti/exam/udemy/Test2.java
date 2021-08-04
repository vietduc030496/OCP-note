package com.vti.exam.udemy;

/**
 * @author duc.nguyenviet
 *
 * Questions 2
 */
public class Test2 {

	public static void main(String[] args) {
		Printer1<Integer> obj = new Printer1<>(100);
		System.out.println(obj);
	}

}

class Printer1<String> {
	private String t;

	Printer1(String t) {
		this.t = t;
	}
	
}
