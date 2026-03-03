package multithreading;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside run ");
		try {
			Thread.sleep(10000);
			System.out.println("sleep over tie");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
