package string1;


	class Test {
	    Test() {
	        this(10);
	        System.out.println("A");
	    }

	    Test(int x) {
	        System.out.println("B");
	    }
	    public static void main(String[] args) {
	        new Test(10);
	    }
	}


