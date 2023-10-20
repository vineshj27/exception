package exception;

public class Arithmeticexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		System.out.println("hi");
//		int a =10;
//		int b =0;
//		System.out.println(a/b);
//		System.out.println("h");
		
		
		System.out.println("hi");
		int a =10;
		int b =0;
		try {
			System.out.println(a/b);
		}
		catch  (Exception ab) {
			//System.out.println("dont divide number by 0");
			// System.out.println(ab);
			ab.printStackTrace();
		}
		System.out.println("h");
		
	}

}
