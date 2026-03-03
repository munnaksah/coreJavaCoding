package multithreading;


class PrintNumbers{
	public synchronized void print() {
		for(int i= 0; i<10;i++) {
			System.out.println("number is " + "printed "+ Thread.currentThread().getName());
			
		}
		
	}
	
}

class  Worker extends Thread{
	PrintNumbers printNumbers;
	Worker(PrintNumbers _printNumbers){
		this.printNumbers = _printNumbers;
	}
	@Override
	public void run() {
		printNumbers.print();
		
	}

}

public class Driver1 {
	public static void main(String[] args) {
		
		PrintNumbers printNumbers  = new PrintNumbers();
		Worker t1 = new Worker(printNumbers);
		t1.setName("t1");
		t1.start();
		
		Worker t2 = new Worker(printNumbers);
		t1.setName("t2");
		t1.start();
		
		
		

	}

}
