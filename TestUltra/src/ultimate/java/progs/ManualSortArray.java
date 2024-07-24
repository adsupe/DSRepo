package ultimate.java.progs;

import java.util.Arrays;
import java.util.stream.Stream;

public class ManualSortArray {

	public static void main(String[] args) {

		int arr[] = new int[]{1,0,0,1,1,0,1,0};
		System.out.println("---------- Integer array sorting manually -----------");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[i] > arr[j]) {
					temp = arr[i]; // save the greater element in temp
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]);
		}
		
		System.out.println("\n---------- Character array sorting manually -----------");
		
		String input="ababb";
		char[] charArray = input.toCharArray();
		int length = charArray.length;

		for(int i=0;i<length;i++){
		   for(int j=i+1;j<length;j++){
		      if (charArray[i] > charArray[j]) {
		          char temp = charArray[i];
		          charArray[i]=charArray[j];
		          charArray[j]=temp;
		      }
		   }
		   System.out.print(charArray[i]);
		}
		
		
		System.out.println("\n---------- Character array sorting Arrays.sort -----------");
		
		input = "nmab";
		char[] crArraySort = input.toCharArray();
		Arrays.sort(crArraySort);
		System.out.println(crArraySort);
		
		System.out.println("\n---------- Character array sorting Arrays Stream  -----------");
		
		input = "zyuv";
		String[] crStream = input.split("");
		Arrays.stream(crStream).sorted().forEach(i->System.out.print(i));
		
		System.out.println("\n---------- Character array sorting Stream API -----------");
		input = "nmkj";
		Stream.of(input.split("")).sorted().forEach(i->System.out.print(i));
	}

}
