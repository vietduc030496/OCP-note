package com.vti.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		boolean b1 = hashSet.add(66);	// true
		boolean b2 = hashSet.add(10);	// true
		boolean b3 = hashSet.add(66);	// false
		boolean b4 = hashSet.add(8);	// true
		
		System.out.println(hashSet); // 66 8 10
		
		Set<Integer> treeSet = new TreeSet<>();
		boolean b5 = treeSet.add(66);	// true
		boolean b6 = treeSet.add(10);	// true
		boolean b7 = treeSet.add(66);	// false
		boolean b8 = treeSet.add(8);	// true
		
		System.out.println(treeSet); //8 10 66
		
		
	}

}
