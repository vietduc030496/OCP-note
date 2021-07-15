package com.vti.advance.objectmethod;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println(new ArrayList<>()); // override toString()
		System.out.println(new String[0]); // don't override toString() -> use toString() of Object
	}

}
