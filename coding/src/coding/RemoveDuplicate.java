package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
//		 int arr []  = {1,2,4,4,6,6,2,9,0,6,8};
//		Set <Integer> set =  new LinkedHashSet<>();
//		
//		for(int num : arr) {
//			set.add(num);
//			System.out.println(set);
//		}
//		int[] arr = {1, 2, 3, 2, 4, 1};
//
//		Set<Integer> set = new LinkedHashSet<>();
//		for (int num : arr) {
//		    set.add(num);
//		    System.out.println(set);
//		}
		
		// 1 way
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1);

		List<Integer> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));

//		System.out.println(uniqueList);
		// useing stream api 
		List<Integer>  list1 = Arrays.asList(1,2,4,5,6,7,86,4,2,3,5);
		
//		List<Integer> uniqueList1 = list1.stream().distinct().collect(Collectors.toList());
//		System.out.println(uniqueList1);
		
		//3 way 
		
		List <Integer> list3 = Arrays.asList(1,3,5,7,8,8,5,9,2,4,3);
		
		Set<Integer> seen = new HashSet<>();
		
		list3.stream().filter(e -> !seen.add(e) ).forEach(System.out::print);
		
		
		// !seen - then give duplicate element
		// seen  - only give unique value

		
	}

}
