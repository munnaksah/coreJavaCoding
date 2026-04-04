package com.kodewala.collection.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Driver {
	public static void main(String[] args) {
		Map<String, String> map  = new TreeMap<String, String>();
		map.put("name", "munna");
		map.put("name", "sandesh");
		map.put("name", "mukeshkumar");
		map.put("name", "shrikesh");
		
//		map.put(null, null); // null pointer exception 
		
		System.out.println(map);
		
	}

}
