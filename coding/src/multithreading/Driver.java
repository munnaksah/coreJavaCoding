package multithreading;




public class Driver {
	

	public static void main(String[] args) {
		System.out.println("start main()");
		
		MyThread  myThread  = new  MyThread(); // creating New thread . state 
	Thread t1 = new Thread(myThread);
	
	t1.start();
	
	
	System.out.println("end main()");
		
		
	}
}
