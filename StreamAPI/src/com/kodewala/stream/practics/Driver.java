
package com.kodewala.stream.practics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Driver {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,20,30,40,60,40);
		
		List<String> list = Arrays.asList("bangalore", "pune","mumbai","gurgaon","delhi","sikim","chennai","patna");
		
	Optional<Integer> secondHigNum =      nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	
	// sort  a list od string by length
	System.out.println("sorted part 1 :");
	list.stream().sorted(Comparator.comparingInt(w->w.length())).forEach(word-> System.out.println(word));
	//
	System.out.println("sorted part 2 :");
	
	list.stream().sorted((a,b)->b.length()-a.length()).forEach( v->System.out.println(v));
	
	
	System.out.println("secondHigNum :"+ secondHigNum.get());
	
	}

}
