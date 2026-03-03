package javaDSAP;
//Problem: Read Last 4 Elements from a 17-Element Array

public class Q8 {
	public static void main(String[] args) {
		int []numbers =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
		
		// lastElement = [14,15,16,17]
		// index[13][14][15][16]
		
		System.out.println("print last 4 Element ");
		for(int i = numbers.length-4;i<numbers.length;i++) {
			System.out.print("last4Element:" + numbers[i] + " ");
			
		}
		
	}

}
