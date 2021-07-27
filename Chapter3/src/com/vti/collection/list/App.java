package com.vti.collection.list;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("SD");	// [SD]
		list.add(0, "NY");	// [NY, SD]
		list.set(1, "FL"); // [NY, FL]
		list.remove("NY"); // [FL]]
		list.remove(0);	// []
		list.add("OH");	// [OH]
		list.add("CO");	// [OH, CO]
		list.add("NJ");	// [OH, CO, NJ]
		String state = list.get(0);
		int index = list.indexOf("NJ");
		
		System.out.println(state);
		System.out.println(index);
	}

}
