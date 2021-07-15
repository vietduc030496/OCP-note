package com.vti.advance.enumexample;

public enum Season {
	WINTER(), SPRING, SUMMER, FALL;

	public static void main(String[] args) {
		Season s = Season.SUMMER;
		System.out.println(s); // SUMMER
		System.out.println(Season.SUMMER == s); // true

		System.out.println("-----------------");

		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}

		if (Season.SPRING.ordinal() == 2) {
		}

		Season s1 = Season.valueOf("SUMMER"); // SUMMER
		Season s2 = Season.valueOf("summer"); // throw Exception
	}
}
