package exception;

public class Numberformatexception {

	public static void main(String[] args) {
		 
		
		//System.out.println("hi");
		
		String num = "TN63";
		
//		try {
//			int n1 = Integer.parseInt(num);
//		   System.out.println(n1);
//		}
//		finally {
//			System.out.println("this is important message");
//		}
//		System.out.println("bye");
		
		
		try {
			int n1 = Integer.parseInt(num);
		   System.out.println(n1);
		}
		catch (Exception n) {
			//System.out.println(n1);
			n.printStackTrace();
		}
		finally {
			System.out.println("this is important message");
		}
		System.out.println("bye");
		
	}

}
