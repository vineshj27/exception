package exception;

public class Nullpointerexception {

	public static void main(String[] args) {

		System.out.println("hi");
		String name = null;
		System.out.println(name);
		try { 
			System.out.println(name.toUpperCase());
		}
		catch (Exception name1) {
			System.out.println(name1);
			 name1.printStackTrace();
		}
		
	}

}
