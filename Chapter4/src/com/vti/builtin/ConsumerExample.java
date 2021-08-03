package com.vti.builtin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = s -> System.out.println(s);
		
		c1.accept("Annie"); // Annie
		c2.accept("Annie"); // Annie
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> bc1 = map::put;
		BiConsumer<String, Integer> bc2 = (k, v) -> map.put(k, v);
		
		bc1.accept("chicken", 7);
		bc2.accept("chick", 1);
		
		System.out.println(map); // {chicken=7, chick=1}
	}

}
