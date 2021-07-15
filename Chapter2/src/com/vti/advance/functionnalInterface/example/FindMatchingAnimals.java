package com.vti.advance.functionnalInterface.example;

import java.util.function.Predicate;

public class FindMatchingAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());

		printWithPredicate(new Animal("fish", false, true), a -> a.canHop());
		printWithPredicate(new Animal("kangaroo", true, false), a -> a.canHop());
	}

	private static void print(Animal animal, CheckTrait checkTrait) {
		if (checkTrait.test(animal)) {
			System.out.println(animal);
		}
	}

	private static void printWithPredicate(Animal animal, Predicate<Animal> predicate) {
		if (predicate.test(animal)) {
			System.out.println(animal);
		}
	}
}
