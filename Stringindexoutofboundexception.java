package exception;

public class Stringindexoutofboundexception {

	public static void main(String[] args) {

  //String chars = "String";
 // System.out.println(chars.charAt(4));
  //System.out.println(chars.charAt(6));
//  
//  try { 
//	  System.out.println(chars.charAt(6));
//  }
// finally {
//	  System.out.println("exception handling req");
// }
//  System.out.println(chars.charAt(2));
//		
//   
//   try { 
// 	  System.out.println(chars.charAt(6));
//   }
//   catch (StringIndexOutOfBoundsException a) {
// 	 System.out.println(a);
// 	  a.printStackTrace();
//   }
//  finally {
// 	  System.out.println("exception handled");
//  }
//   System.out.println(chars.charAt(2));
		
		String[] a = {"vine", "Vin", "viens"};
		//System.out.println(a[1].charAt(3));
		
		try {
			System.out.println(a[1].charAt(3));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		


	}

}
