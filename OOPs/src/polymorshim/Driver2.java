package polymorshim;

class Parrent{
	public void doSomething() {
		System.out.println("parrent.dosomething");
	}
}


class Child extends Parrent{
	public void doSomething() {
		System.out.println("child .dosomething");
	}
	
}

public class Driver2 {
	
	public static void main(String[] args) {
		
		Parrent p =  new Child();  // 
		p.doSomething();
		
	}

}
