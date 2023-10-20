package exception;

public class Singltrymulticatchconcept {

	public static void main(String[] args) {

String name = null;


  try {
	 System.out.println(name.toUpperCase());
 } 
  catch (ArithmeticException b) {
	System.out.println("cant divide bt 0");
 } 
  catch (NullPointerException a) {
		System.out.println("the value is null");
  }		
  catch (NumberFormatException c) {
	System.out.println("not");
 } 
  catch (Exception d) {
	System.out.println("handled");
 }

		
	}

}
