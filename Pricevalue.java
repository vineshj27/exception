package exception;

public class Pricevalue {

	public static void main(String[] args) throws Pricethousand {
		int price = 1000;
		
		if(price>=2000) {
			System.out.println("Price not matched");
		}
		else {
			throw new Pricethousand("matched");
		}
	}

}
