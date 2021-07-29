package com.vti.generic.bound.lower;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		List<Object> objects = new ArrayList<Object>(strings);
		addSound(strings);
		addSound(objects);
		
		System.out.println(strings); // [tweet, quack]
		System.out.println(objects); // [tweet, quack]
	}

	public static void addSound(List<? super String> list) {
		list.add("quack");
	}

}
