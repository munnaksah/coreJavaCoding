package com.kodewala.collection.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		
		Map<String , String> map  = new HashMap<>();
		
		map.put("karnataka", "Bangalore");
		map.put("bihar", "Patna");
		map.put("Hariyana", "CG");
		map.put("karnataka", "Bangaluru");
//		System.out.println(map);
		
		
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		Iterator<Entry<String,String>> itrl =  entrySet.iterator();
		
		while(itrl.hasNext()) {
			
			Entry<String,String> entry =  itrl.next();
			
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("key: "+ key + " value :" + value);
			
		}
		
		
		
	}

}
