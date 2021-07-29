package com.vti.additions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> favorites = new HashMap<String, String>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		
		System.out.println(favorites);	// // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
		
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);

		System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
		System.out.println(jenny); // Bus Tour
		System.out.println(tom); // Skyride
		
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("1", null);
		BiFunction<Integer, Integer, Integer> mapper2 = (i1, i2) -> {System.out.println(i1); return i1 * i2;};
		map2.merge("1", 2, mapper2);
		
		System.out.println(map2.get("1"));
	}

}
