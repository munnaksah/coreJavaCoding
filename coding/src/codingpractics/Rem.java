package codingpractics;

import java.util.LinkedHashSet;
import java.util.Set;

public class Rem {
	public static void main(String[] args) {
		int[] arr = {2,4,6,7,5,9,3,5,9,8,7,6,5,4,3,2,1,3,4,5};
		
		Set<Integer> seen = new LinkedHashSet<Integer>();
		
		Set<Integer> duplicates = new LinkedHashSet<Integer>();

		
		for(int num : arr) {
			if(!seen.add(num)) {
				duplicates.add(num);
				
				
			}
			
//			seen.add(num);
			
			
		}
//		System.out.println(" only unique element: " + seen);
		System.out.println(" only unique element: " + duplicates);

			
		}
	}


