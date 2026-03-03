package javaApplication;

//public class C {
//	
//	 static int yourAge  ;
//	 int   myAge;
//	 
//	public static void main(String []args) {
//		int age  =  10;
//		int yourAge = 20;
//		int myAge  =  30;
//	
//		
//		C c1 = new C();
//		c1.test(220);
//		
//		System.out.println(C.yourAge);
//		
//		System.out.println(myAge);
//		
//	}
//	
//	public void test(int i) {
//		System.out.println(i);
//		
//	}
//
//}


// 2  program 


//   public class C {
//	   public static void main (String[]args) {
//		   C c1 = new C();
//		   
//		   c1.test("munna",'c',30,10.5,true);
//	   }
//	   
//	   private void test(String string,char c ,int i ,double d,boolean b) {
//		   
//		   System.out.print(string);
//		   System.out.println(c);
//		   System.out.println(i)
//		   ;
//		   System.out.println(d);
//		   System.out.println(b);
//	   }
//	 
//}


//3 if method is void , its not return  anything
public class C {
	
	public static void main (String[] args) {
		
		C c1   =  new C ();
	String val = 	c1.test();
	System.out.print(val);
		
	}
	
	public String test() {
		return "munna";
	}
	
}


 