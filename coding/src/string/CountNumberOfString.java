package string;

public class CountNumberOfString {
	public static void main(String[] args) {
		String s1 = "i am from bangalore india";
		
	
	String []arr=  s1.split("");
	System.out.println(arr.length);
	
	int lenght  = 0;
	for(String word: arr) {
		System.out.println(word);
//		System.out.println();
		lenght = lenght+word.length();
		
		
		
	}
	// 
//	for(String[]arr) {
//		
//	}
	System.out.print("lenght is"+ lenght);
		
		
	}

}
