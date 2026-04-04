package com.kodewala.collection.set1;

import java.util.HashSet;
import java.util.Iterator;

public class Employee1 {
	int  value;
	

	public Employee1(int value) {
	
		this.value = value;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee1 e1 = (Employee1) obj;
		return this.value == e1.value; 
	}
	
	
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>(8);
		
		hashSet.add(new Integer(1));
		hashSet.add(new Integer(2));
		hashSet.add(new Integer(3));
		hashSet.add(new Integer(4));
		hashSet.add(new Integer(5));
		hashSet.add(new Integer(6));
		hashSet.add(new Integer(7));
		hashSet.add(new Integer(8));
		hashSet.add(new Integer(8));
		
		
//		System.out.println(hashSet);
		
		for(Integer num : hashSet) {
			System.out.println(num);
			
		}
		
		Iterator<Integer> itr = hashSet.iterator();
		while(itr.hasNext()) {
			
			Integer num = (Integer)itr.next();
			
			System.out.println(num);
			
		}
		
		
		
		System.out.println(hashSet.size());
		
	}

}
