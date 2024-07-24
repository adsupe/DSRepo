package ultimate.java.progs;

import java.util.Arrays;

import java.util.List;

public class StreamSortedDemo {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(12,20,35,43,55,60,72);
		
		values.stream().sorted();

		//Sorted list assigned to new list
		List<Integer> sortedList = values;
		
		sortedList.forEach(i -> System.out.println(i));
	
		
	}

}
