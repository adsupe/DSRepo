package ultimate.java.progs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthLargestElement {

	public static void main(String[] args) {

		Integer[] arr = {1, 23, 12, 9, 30, 2, 50};
		List<Integer> elements = Arrays.asList(arr);
		Collections.sort(elements, Collections.reverseOrder());
		int k = 3;
		System.out.println(elements.get(k-1));
		
		
		
		int arr1[] = { 12, 35, 1, 10, 34, 1 };
		Arrays.sort(arr1);
		for(int e=0;e<arr1.length;e++) {
			System.out.println(arr1[e]);
		}
		
		System.out.println(arr1[arr1.length-1] +" "+arr1[arr1.length-2]);
	}

}
