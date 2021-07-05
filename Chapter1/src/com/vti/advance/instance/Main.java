package com.vti.advance.instance;

public class Main {

	public static void main(String[] args) {
		HeavyAnimal hippo = new Hippo();
		boolean b1 = hippo instanceof Hippo;
		boolean b2 = hippo instanceof HeavyAnimal;
		boolean b3 = hippo instanceof Elephant;
		boolean b4 = hippo instanceof Object;

		System.out.println(b1); // true
		System.out.println(b2); // true
		System.out.println(b3); // false
		System.out.println(b4); // true

		HeavyAnimal nullHippo = null;
		System.out.println(nullHippo instanceof Object); // always false

		Hippo anotherhippo = new Hippo();
//		boolean b5 = anotherhippo instanceof Elephant;		// DOES NOT COMPILE

		boolean b6 = hippo instanceof Mother; // always compiler
		System.out.println(b6);
	}

}
