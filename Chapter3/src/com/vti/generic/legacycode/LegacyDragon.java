package com.vti.generic.legacycode;

import java.util.ArrayList;
import java.util.List;

public class LegacyDragon {
	public static void main(String[] args) {
		List unicorns = new ArrayList();
		unicorns.add(new Unicorn());
		printDragons(unicorns);
		
		List<Unicorn> secordUnicorn = new ArrayList<>();
		addUnicorn(secordUnicorn);
		Unicorn unicorn = secordUnicorn.get(0); // ClassCastException
		
		List numbers = new ArrayList();
		numbers.add(5);
//		int result = numbers.get(0); // DOES NOT COMPILE
	}

	private static void printDragons(List<Dragon> dragons) {
		for (Dragon dragon : dragons) { // ClassCastException
			System.out.println(dragon);
		}
	}
	
	private static void addUnicorn(List unicorns) {
		unicorns.add(new Dragon());
	}
}
