package javaDSAP;
//Problem: Read First 2 Elements and Last 2 Elements from a 10-Element Array
public class Q10 {
	public static void main(String[] args) {
		int []numbers =   {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		//firstTwoElement = 10,20
		//lastTwoElement =  90,100 = 
		
		int first1  =  numbers[0];
		int first2 = numbers[1];
		
		int last1 =  numbers[numbers.length-1];
		int last2 =  numbers[numbers.length-2];
		
		System.out.println("first1:  " + first1 + "  first2:"  + first2);
		System.out.println("last1: " + last1 + "    last2:" + last2);
		
	}

}
