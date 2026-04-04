package com.kodewala.stream.practics;

public class Driver6 {
	public static void main(String[] args) {
		// find first non reapeting char
		String str = "swiss";
		
//		Character firstNonRep = str.chars().mapToObj(c->(char)c).filter(ch-> str.indexOf(ch) == str.lastIndexOf(ch)).findFirst().orElse(null);)
	
//Character firstNonRep = str.chars()
//.mapToObj(c -> (char) c)   // convert int → char
//.filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
//.findFirst()
//.orElse(null);


		Character	firstNonRep = str.chars().mapToObj(c->(char) c).filter(ch-> str.indexOf(ch) == str.lastIndexOf(ch)).findFirst().orElse(null);

System.out.println("firstNonRep: " + firstNonRep); 
	
System.out.println("firstNonRep :" + firstNonRep);

	}

}
