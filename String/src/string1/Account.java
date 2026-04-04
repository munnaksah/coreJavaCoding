package string1;

public class Account {
	private String name;

	public Account(String name) {
		this.name = name;

	}

	public static void main(String[] args) {
		Account acc1 = new Account("java");
		Account acc2 = new Account("java");
		
		System.out.println(acc1 == acc2);
		System.out.println(acc1.name);
		System.out.println(acc2.name);
		System.out.println(acc1);
		System.out.println(acc2);
		
		System.out.println(acc1.equals(acc2));
	}

}
