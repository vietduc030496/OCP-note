package com.vti.advance.polymorphism.cast;

public class Lemur extends Primate implements HasTail {

	public int age = 10;

	@Override
	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age); // 10

		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped()); // false
//		System.out.println(hasTail.age); // DOES NOT COMPILER

		Primate primate = lemur;
		System.out.println(primate.hasHair()); // true
	}
}
