package com.vti.advance.exam.udemy.innerclass;

/**
 * @author duc.nguyenviet
 *
 * Question 37
 */
public class X {
	
	class Y {
		private void m() {
			System.out.println("INNER");
		}
	}
	
	public void invokeInner() {
		Y y = new Y();
		y.m();
	}

}


class Test1 {
	public static void main(String[] args) {
		new X().invokeInner();
	}
}