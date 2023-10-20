package exception;

public class Arrayindexoutofboundexception {

	public static void main(String[] args) {
		 
		int[] nums = {12,13,45,56,13};
		
		try {
			System.out.println(nums[6]);
		} 
		finally {
			System.out.println("exception handling required");
		}
		
		
		
//		try {
//			System.out.println(nums[4]);
//		}
//		catch (Exception num) {
//			System.out.println(num);
//			num.printStackTrace();
//		}
//		finally {
//			System.out.println("exception handled");
//		}

	}

}
