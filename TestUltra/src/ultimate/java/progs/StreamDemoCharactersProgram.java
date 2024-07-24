package ultimate.java.progs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoCharactersProgram {

	public static void main(String[] args) {

		System.out.println("Non repeated characters :: ");
		String input = "Java articles are Awesome";
		
		Character result = input.chars() // Stream of String       
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1L)
				.map(entry -> entry.getKey())
				.findFirst()
				.get();
		System.out.println(result); 

		System.out.println("Repeated characters :: ");
		Character repeatedChar = input.chars()
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) 
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting())) 
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1L)
				.map(entry -> entry.getKey())
				.findFirst()
				.get();
		System.out.println(repeatedChar);

		System.out.println("Concatenate two streams::");
		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");

		Stream conStream = Stream.concat(list1.stream(), list2.stream());
		conStream.forEach(str-> System.out.print(" "+str));
		System.out.println();

		System.out.println(" use map to convert object into Uppercase::");
		list2.stream().map(i->i.toUpperCase()).forEach(str-> System.out.print(" "+str));
		System.out.println();

		List<String> cases = Arrays.asList("hi","Why","Hi","hoW","me","How","Me","HI");

		Map<String,Long> mapCase1 = cases.stream().map(i->i.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
		System.out.println("Count of each word :: "+mapCase1);

		List<String> firstMakeLowerCase = cases.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
		Map<String,Long> mapCase2    = firstMakeLowerCase.stream().filter(i->Collections.frequency(firstMakeLowerCase, i)>1)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
		System.out.println("Show count of only duplicate element :: "+mapCase2);

		Map.Entry<String, Long> mapEntryCase2 = mapCase2.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (o,n)->o,TreeMap::new)).firstEntry();

		System.out.println("Max count of the word from SORT BY VALUE {"+mapEntryCase2.getKey()+" :: "+mapEntryCase2.getValue()+" }");

		System.out.println("A program to print the count of each CHARACTER in a String");
		String s = "string data to count each character";

		Map<String,Long> mapChars = Arrays.stream(s.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println("Count the character :: "+mapChars);
		List<String> nonrepated = mapChars.entrySet().stream().filter(entry->entry.getValue()==1L).map(entry->entry.getKey()).collect(Collectors.toList());
		System.out.println("Non repeated again :: "+nonrepated);



		System.out.println("Given a list of integers, find out all the numbers starting with 1 using Stream functions :: ");
		
		
		
		Map<Integer, String> hashmap = new HashMap<Integer,String>();
		 // Adding Key and Value pairs to HashMap
		 hashmap.put(22,"A");
		 hashmap.put(55,"B");
		 hashmap.put(33,"Z");
		 hashmap.put(44,"M");
		 hashmap.put(99,"I");
		 hashmap.put(88,"X");
		 
		Map<Integer,String> resSortByValue =  hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
		 	collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,n)->o,LinkedHashMap::new));
		resSortByValue.forEach((k,v)->System.out.println(k+","+v));
		 
	}
}