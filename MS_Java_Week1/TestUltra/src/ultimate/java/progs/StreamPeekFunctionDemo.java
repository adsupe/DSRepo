package ultimate.java.progs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekFunctionDemo {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(12,20,35,43,55,60,72);
		
//		System.out.println(values.stream()
//								  .filter(i-> i%5==0)  // lazy function
//								  .map(i-> i*2)       // lazy function
//								  .findFirst() // Terminal function returns Optional
//								  .orElse(0)); // Optional - if there is none of the element adheres to the condition then it prints 0 as mentioned
		
		
//		System.out.println(values.stream()
//								 .peek(i->System.out.println(i))
//								 .filter(java8.streamapi.demo.StreamPeekFunctionDemo :: isDivisible)
//								 .peek(i->System.out.println(i))
//								 .map(java8.streamapi.demo.StreamPeekFunctionDemo::mapFunction).collect(Collectors.toList()));
//								 //.findFirst()
//								 //.orElse(0))

		
	}
	
	public static boolean isDivisible(int i) {
		System.out.println("In Divisible :: "+i);
		return i%5==0;
	}
	
	public static int mapFunction(int i) {
		System.out.println("In Map function :: "+i);
		return i*2;
	}

}
