package com.vti.advance.exam.udemy.innerclass;

/**
 * @author duc.nguyenviet
 * 
 * Question 31
 *
 */
public class Test {
	
	class A {
		void m() {
			System.out.println("INNER");
		}
	}

	public static void main(String[] args) {
		// first
		Test.A a1 = new Test().new A();
		a1.m();
		
		//secord
		A a2 = new Test().new A();
		a2.m();

	}

}
