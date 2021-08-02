package com.vti.advance.exam.udemy.innerclass;

/**
 * @author duc.nguyenviet
 *
 * Question 38
 */
public class P {
	private int var = 100;
	
	class Q {
		String var = "Java";
		void print() {
			System.out.println(P.this.var); // 100
			System.out.println(this.var); // Java
			System.out.println(var); // Java
		}
	}

}

class Test2 {
	public static void main(String[] args) {
		new P().new Q().print();
	}
}
