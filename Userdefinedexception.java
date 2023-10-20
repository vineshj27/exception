package exception;

public class Userdefinedexception {

	public static void main(String[] args) throws AgeException {
		 
		String name = "prem";
		int age =17;
		if(age>=18) {
			System.out.println("Welcome" + name);
		}
		else {
			throw new AgeException("Not Valid");
		}
		String gender = "male";
	}

}
