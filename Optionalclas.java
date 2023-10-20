package java8;

import java.util.Optional;

public class Optionalclas {

	public static void main(String[] args) {
		 
		
		String name =  null;
		String name1 = "null";
		
		 Optional<String> check = Optional.ofNullable(name);
		// Optional<String> check = Optional.of(name);
		System.out.println(check);
		
//		
		// Optional<String> check1 = Optional.ofNullable(name1);
//	 
//		if(check.isPresent()) {
//		//if(check1.isEmpty()) {
// 			System.out.println(name.toUpperCase());
// 		}
// 		else {
// 			System.out.println("value empty");
//		}
//		
		
//		Optional<String> check2 = Optional.ofNullable(name);
//		if(check2.isEmpty()) {
//			System.out.println(name);
//		}
//		else  {
//		System.out.println("empty");
//		
//	}
		//String ab = null;
//		Optional<String> name = Optional.ofNullable(null);
//		System.out.println(name.get());	
		
 	//	System.out.println(name.orElse("this is nothing"));	
		
//		System.out.println(name.orElseThrow(()->new NullPointerException()));	
		 
		 
		  
		 
//		 String message = null;
//	        
//	        //ofNullable() : if given object is null
//	        Optional<String> StringOptional = Optional.ofNullable(message);
//	        System.out.println(message);
//	        //isPresent() : if Optional is Non-empty
//	        if(StringOptional.isPresent()){
//	            System.out.println(message);
//	        }else{
//	            System.out.println("Message is empty");
//	        }
//	        
//	        // if Optional is non-empty print GoodMorning
//	        Optional<String> GoodMorning= Optional.of("Good Morning");
//	        GoodMorning.ifPresent(System.out::println);
//	        
//	        //orElse : assigning a value if the given Optional is Empty
//	        System.out.println(StringOptional.orElse("Default"));
//		 
//		 
//		 
		 
		 
		 
		 
	}

}
