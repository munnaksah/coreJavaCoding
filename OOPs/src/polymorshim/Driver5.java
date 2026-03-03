package polymorshim;

class Employee{
	public void doTask() {
		System.out.println("employee do task");
	}
	
}


class Manager extends Employee{
	@Override
	public void doTask() {
		System.out.println("manager do task");
	}
	
	
}

public class Driver5 {
	public static void main(String[] args) {
		Employee e =(Employee) new Employee(); // auto up- casting
		e.doTask();
		
		Manager m1 = (Manager)e;
		m1.doTask();
		
		
		
		
		
		Manager mg =(Manager) new Employee();  // child clas is refering parent class
		// down casting 
		mg.doTask();
		
		
		
		
		
	}

}
