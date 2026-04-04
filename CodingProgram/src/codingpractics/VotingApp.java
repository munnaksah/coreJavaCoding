package codingpractics;

public class VotingApp {
	public static void checkAge(int age) throws AgeInvalidException{
		
		if(age<18) {
			throw  new  AgeInvalidException(" age must be 18 ");
			
		}else {
			System.out.println(" you r eligible for voting ");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			checkAge(19);
		}catch(AgeInvalidException e) {
			System.out.println(" Exception cough: "  + e.getMessage());
		}
		
	}

}
