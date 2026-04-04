package string;

public class Driver6 {

	public static void main(String[] args) {
		
		System.out.println("START of main()");
		try {
			System.out.println("START OF try block");
		String name = null; // Obj is not yet created
		System.out.println(name.length()); // NULLPOINTEREXCEPTION
		System.out.println("END of try block");
		
		}catch(NullPointerException e){
			System.err.println("Exception caugh ..");
			
		}
		
		System.out.println("END of main()");
	}
}
