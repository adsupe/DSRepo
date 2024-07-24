package ultimate.java.progs;

import java.util.Arrays;

public class MaxProductOfThreeNum {

	public static void main(String[] args) {

		Integer arr[] = {4,2,-3,-11,-6,5,3,1,8,-9,-12,-7,6};
		int n = arr.length;
		
        // Sort the array in ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.asList(arr));
        // Return the maximum of product of last three
        // elements and product of first two elements
        // and last element
        int resValue = Math.max(arr[0] * arr[1] * arr[n - 1],
                arr[n - 1] * arr[n - 2] * arr[n - 3]);
        
        int resValueFour = Math.max(arr[0] * arr[1] * arr[2] * arr[3],
                arr[n - 1] * arr[n - 2] * arr[n - 3] * arr[n-4]);
        
        int resValueFive = Math.max(arr[0] * arr[1] * arr[2] * arr[3] * arr[n-1],
                arr[n - 1] * arr[n - 2] * arr[n - 3] * arr[n-4] * arr[n-5]);
        
        System.out.println(resValue);
        System.out.println(resValueFour);
        System.out.println(resValueFive);
	}


}
