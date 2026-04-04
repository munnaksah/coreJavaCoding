package string1;

public class Driver2 {

	public static void main(String[] args) {
		String str = " i   am java devloper now fullstack";
		System.out.println("before split");
		System.out.println(str.length());
	
		System.out.println("after split");
		String arr[]  = str.split("");
		System.out.println(arr.length);
		
		 int length  = 0;
		 for(String word : arr) {
			 System.out.println(word);
			 
//			 length  =  length+ word.length();
			 
		 }
	}
}
