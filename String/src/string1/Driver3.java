package string1;

public class Driver3 {
	public static void main(String[] args) {
		
		String str  = null;
		System.out.println(str);
		try
		{	
			System.out.println(str.length());
		}catch (NullPointerException e) {
			
			System.out.println(e);
		}
	}

}
