package ultimate.java.progs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemoIntegerListProgram4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,25,8);
		
		System.out.println("Even numbers ::");
//		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList())); // 1st option
		 
//		list.stream().filter(i->i%2==0).forEach(a->System.out.println(a)); // 2nd option
		
		list.stream().filter(i->i%2==0).forEach(System.out :: println); // 3rd option
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Numbers start with 1 ::");
		list.stream()
		.map(a-> a + "") // convert integer to string
		.filter(i->i.startsWith("1"))
		.forEach(System.out::println);
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Find duplicate functions ::");
		Set<Integer> set1 = new HashSet();
		list.stream().filter(i-> !set1.add(i)).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Find first element::");
//		Optional<Integer> op1 = list.stream().findFirst(); // 1st option
//		System.out.println(op1);
		list.stream().findFirst().ifPresent(System.out::println);// 2nd option
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Total number of elements present in the list ::");
		System.out.println(list.stream().count());
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Sum of elements present in the list ::");
//		int total = list.stream().mapToInt(i->sumTheGivenNumber(i)).sum();// 1st way
//		System.out.println(total);
		int total2 = list.stream().mapToInt(Integer :: intValue).sum();
		System.out.println("Sum :: "+total2);
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Find max value present in the list :: ");
		int maxValue = list.stream().max((t1,t2)->{return t1>t2? 1: t1<t2? -1: 0;}).get();// One way
		System.out.println("Max value :: "+maxValue);
		int maxValue2 = list.stream().max(Integer :: compare).get();
		System.out.println("Max value second way ::" +maxValue2); // 2nd way
		System.out.println("---------------------------------------------------------------");
		
		
		System.out.println("Sort the given numbers ::");
		list.stream().sorted().forEach(System.out :: println);
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Sort the given numbers in descending order ::");
//		list.stream().sorted((t1,t2)->{return t1>t2? -1: t1<t2? 1: 0;}).forEach(System.out::println);// one way
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);// 2nd way
		System.out.println("---------------------------------------------------------------");
		
		
		System.out.println("Given array return true if number appears twice else false ::");
		int[] arr = {10,15,8,49,25,98,32,25,8};
		boolean check = Arrays.stream(arr).boxed().collect(Collectors.toSet()).size() != arr.length;  
		System.out.println(check);
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Perform cube on the list and filters numbers greater than 50");
		List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		integerList.stream().map(i->i*i*i).filter(a->a>50).forEach(System.out :: println);
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Sort an array and then convert it to stream");
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------");
		
		Set<Integer> duplicateList = new HashSet<Integer>();
		System.out.println("1st way to find the duplicate and count the result in map :: "+list.stream().filter(i->Collections.frequency(list, i)>1)
				.collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting())));
		System.out.println("Find duplicate and count the result SECOND WAY:: "+list.stream().filter(i-> !duplicateList.add(i)).count());
		System.out.println("---------------------------------------------------------------");
	}

	public static int sumTheGivenNumber(Integer value) {
		return value;
	}
}
