package com.vti.advance.exam.udemy.innerclass;

/**
 * @author duc.nguyenviet
 *
 * Question 12
 */
public class Player {

	String name;
	int age;

	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ", " + age;
	}

	public boolean equals(Player player) {
		if (player != null && this.name.equals(player.name) && this.age == player.age) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Object p1 = new Player("Sachin", 44);
		Object p2 = new Player("Sachin", 44);
		System.out.println(p1.equals(p2));
	}

}
