package javaDSAP;
//Problem: Read Last Two Elements from a 10-Element Array


public class Q6 {
	public static void main(String[] args) {
		int []numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		// lasttwoElement - 90,100
		
		// index[8], index[9]
		
		int lastElement =  numbers[numbers.length-1];
		int lastSecondElement =  numbers[numbers.length-2];
		
		System.out.println("lastElement :"+ lastElement);
		System.out.println("lastSecondElement :"+ lastSecondElement);
		
	}
	

}
