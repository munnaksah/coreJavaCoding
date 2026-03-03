package javaDSAP;
//Problem: Read First and Last Element from a 10-Element Array

public class Q9 {
	public static void main(String[] args) {
		int []numbers =  {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		// firstElement = 10 , index[0]
		//lastElement = 100, index[9]  -  length-1
		  int firstElement =  numbers[0];
		  int lastElement =  numbers[numbers.length-1];
		  
		  System.out.println("firstElement :" + firstElement);
		  System.out.println("lastElement :" + lastElement);
		
	}

}
