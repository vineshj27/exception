package java8;

import java.util.Optional;

public class UseMaxmin {

	public static void main(String[] args) {

//
 	  Max m1 = new Max(); //default method for object creation.
// 		
 	  Maxmin a = m1::max;
//		
	  int[] num = {10,20,30,40,150};
//		
	  System.out.println(a.find(num));
//		
//		
	  Maxmin b = Max::min;
		System.out.println(b.find(num));
		

		
	}

}
