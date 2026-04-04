package string1;

public class Test1 {
	
	
	    Test1() {
	        System.out.println("A");
	    }

	    Test1(int x) {
	        this();
	        System.out.println("B");
	    }

	    public static void main(String[] args) {
	        new Test(10);
	    }
	}


