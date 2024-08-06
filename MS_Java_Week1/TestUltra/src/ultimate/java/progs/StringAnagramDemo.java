package ultimate.java.progs;

import java.util.Arrays;
import java.util.Comparator;

public class StringAnagramDemo {

	public static void main(String[] args) {
		
		String s1 = "silent"; String s2 = "listen";//
		
		System.out.println("Is given strings are anagram :: "+isAnagram(s1,s2));
	}
	
	static boolean isAnagram(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
