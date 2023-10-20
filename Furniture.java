package java8;

public interface Furniture {
	
	public String type(String a);
	
	public static int price() {
		return 1000;
	}
	public default void isQuality(boolean q) {
		System.out.println(true);
	}

}
