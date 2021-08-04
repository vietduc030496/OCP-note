package com.vti.exam.udemy;

/**
 * @author duc.nguyenviet
 *
 * Question 22
 */
public class Test22 {

	public static void main(String[] args) {
		Operator<String> operator = (s1, s2) -> s1 + s2; 
		System.out.println(operator);
		
		System.out.println((Operator<String>)(String s1, String s2) -> s1 + s2);

		System.out.println(new Operator<String>() {
			public String operation(String s1, String s2) {
				return s1 + s2;
			}
		});
	}

}

interface Operator<T> {
	public abstract T operation(T t1, T t2);
}
