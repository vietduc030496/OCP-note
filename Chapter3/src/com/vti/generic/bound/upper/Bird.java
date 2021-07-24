package com.vti.generic.bound.upper;

import java.util.ArrayList;
import java.util.List;

public class Bird {
	
	public static void main(String[] args) {
		List<? extends Bird> list = new ArrayList<>();
//		list.add(new Sparrow()); // DOES NOT COMPILER
//		list.add(new Bird()); // DOES NOT COMPILER
	}
}

class Sparrow extends Bird{}
