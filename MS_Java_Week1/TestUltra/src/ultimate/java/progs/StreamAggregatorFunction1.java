package ultimate.java.progs;

import java.util.Arrays;
import java.util.List;

public class StreamAggregatorFunction1 {
	

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(6,3,3,2,4,2,5,6,8,9,12);
		
		Integer sum1 = numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println("Sum of numbers REDUCE : "+sum1);
		
		Integer sum2 = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of numbers 2nd way :: "+sum2);
		
		Integer avg2 = numbers.stream().reduce(0,(a,b)->a+b).intValue()/numbers.size();
		System.out.println("Average of numbers REDUCE :: "+avg2);
		
		Double avg1 = numbers.stream().mapToDouble(i->i).average().getAsDouble();
		System.out.println("Average of numbers 2nd way:: "+avg1);
		
		
		Integer maxValue1 = numbers.stream().reduce(0,(a,b)->a>b?a:b).intValue();
		System.out.println("Max value of the numbers  REDUCE :: "+maxValue1);
		
		Integer maxValue = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println("Max value of the numbers 2nd way ::"+maxValue);
		
		Integer minValue = numbers.stream().reduce(numbers.get(0),(a,b)->Math.min(a, b)).intValue();
		System.out.println("Min value of the numbers REDUCE :: "+minValue);
		
		Integer minValue1 = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
		System.out.println("Min value of the numbers 2nd way :: "+minValue1);
		
		List<Integer> num = Arrays.asList(-12,-3,-4,-2,-6);
		
		System.out.println(num.stream().reduce(num.get(0),(a,b)->a>b?a:b).intValue());//Max 
		System.out.println(num.stream().reduce(num.get(0),(a,b)->a>b?b:a).intValue());//Min
		
	}
}
