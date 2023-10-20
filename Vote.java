package exception;

public class Vote {

	public static void main(String[] args) {
int age =17;
 try {
	 if(age>=18) {
		 System.out.println(age);
	 }
	 else {
		 throw new AgeException("not valid");
	 }
 }
	 catch (AgeException e) {
		 e.printStackTrace();
	 }
 
		

	}

}
