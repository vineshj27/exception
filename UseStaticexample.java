package java8;

public class UseStaticexample {

	public static void main(String[] args) {
		//with static keyword, using constructor only one memory executed, for "StaticExample".
		//without static keyword, same memory alocated

  StaticExample s1 = new StaticExample();
//
   StaticExample s2 = new StaticExample();
////
   StaticExample s3 = new StaticExample();
// 


	}

}
