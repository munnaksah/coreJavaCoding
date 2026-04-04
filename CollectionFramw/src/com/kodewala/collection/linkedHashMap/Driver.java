package com.kodewala.collection.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Driver {
	public static void main(String[] args) {
		Map<String ,String> map = new LinkedHashMap<>();
		
		map.put("biahr", "makahana");
		map.put("bengal", "rice");
		map.put("panjab", "wheate");
		map.put("Asam", "tea");
		map.put("Asam", "teaorCoffe");
		map.put(null, null);
		
		System.out.println(map);
		
	}

}
