package java8;
//lambdaexpression
public class UseCalculation {

	public static void main(String[] args) {

   Calculation add = (x,y)->x+(y+10/100);
   
   System.out.println(add.find(10, 20));
		

	}

}
