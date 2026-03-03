package javaApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class F {
	public static void main(String[]args) {
		List<List<String>> skills = Arrays.asList(

		Arrays.asList("java","springboot","spring"),
		Arrays.asList("react","angular","js"),
		Arrays.asList("mysql","sql","oracle"));
		
		// find the all element in single List
		
		  List<String> AllSkills=skills.stream().
				  flatMap(skillList -> skillList.stream())
				  .collect(Collectors.toList());
		  
		System.out.println(AllSkills);
		
		
		// find the element only SatrtWIth S
		
	List<String>  skillsStartWithS	= AllSkills.stream().filter(skill-> skill.startsWith("s")).collect(Collectors.toList());
	System.out.println(skillsStartWithS);
	}
}
