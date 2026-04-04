package com.kodewala.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver1 {
	public static void main(String[] args) {
		
		Map<String , Integer> map  = new HashMap<>();
		
		map.put("BLR", 20);
		map.put("Patna", 30);
		map.put("kol", 45);
		map.put("pune", 50);
		map.put("pune", 100);
		
//		System.out.println(map);
		
		Set<Entry<String ,Integer>> entrySet = map.entrySet();
		
		Iterator<Entry<String,Integer>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			
			Entry<String, Integer> entry = itr.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("get key :" + key+ "get value:" + value);
			
		}
	}

}
