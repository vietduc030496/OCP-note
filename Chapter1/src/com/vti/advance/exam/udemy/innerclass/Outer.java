package com.vti.advance.exam.udemy.innerclass;

/**
 * @author duc.nguyenviet
 * 
 * Question 30
 */
public class Outer {
	private String name = "James Gosling";

	class Inner {
		public void printName() {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new Outer().new Inner().printName();
	}

}
