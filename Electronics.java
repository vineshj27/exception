package java8;

public interface Electronics {
	
	public String status(boolean a);
	
	public static String name() {
     return "VINESH";
	}
	
	public default void price(int price) {
		System.out.println(price);
	}
}
