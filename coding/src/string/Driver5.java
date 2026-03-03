package string;

public class Driver5 {
	 public static void main(String[] args) {
		String s1 = "Hello" + "bangalore"; // one object created
		System.out.println(s1);
		
		
		String s10 = "Hello"; // scp
		String s11 =  "bangalore"; // scp
		String s12 = s10+s11; // heap
		
		String s13 =  s12.intern(); //s13 is referring from scp object
		
		
		System.out.println();
	}

}
