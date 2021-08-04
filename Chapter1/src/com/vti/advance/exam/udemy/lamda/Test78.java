package com.vti.advance.exam.udemy.lamda;

/**
 * @author duc.nguyenviet
 * 
 * Question 78
 *
 */
public class Test78 {

	public static void main(String[] args) {
		I6 obj = () -> {
			int i = 10;
			i++;
			System.out.println(i);
		};
		obj.m6();
	}

}

interface I6 {
	void m6();
}
