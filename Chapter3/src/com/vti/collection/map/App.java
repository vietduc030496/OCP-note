package com.vti.collection.map;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("koala", "Bambo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala");
		System.out.println(food);
		for (String key : map.keySet()) {
			System.out.print(key + ", ");
		}
		System.out.println();
		System.out.println(map.containsKey("lion"));	// true
		System.out.println(map.containsValue("lion"));	// false
		System.out.println(map.size());	// 3
	}

}
