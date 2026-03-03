package codingpractics;
// how to create sigleton program in java 

public class Singleton {

	private static Singleton Instance;

	private Singleton() {
		System.out.println("hello fronmm  singleton");
	}

	public static Singleton getInstance() {
		if (Instance == null) {

			Instance = new Singleton();

		}
		return Instance;

	}

}
