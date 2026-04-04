package string;

public class Driver1 {
	public static void main(String[] args) {
		String s1  = "kodewala";
		String s2 =  "kodewala";
		System.out.println(s1==s2); // t
		System.out.println(s1.equals(s2)); //t
		
		String  s3 =   new String("kodewala");
		String  s4  =   new String("kodewala");	
		System.out.println(s3.equals(s4));   // t
		System.out.println(s1 ==s3);  //f
		System.out.println(s2 ==s4);  //f
		
		
		String s5 = "kodewala";
		String s6 =  new String ("kodewala");
		System.out.println(s5==s6);  // f
		System.out.println(s5.equals(s6));   // t
		
		
		String s7 =  "kodewala";
		 s1.concat("Academy");
		System.out.println(s7);
		System.out.println(s7.concat(" accaemy"));
		

	
		
	}
	
	

}
       