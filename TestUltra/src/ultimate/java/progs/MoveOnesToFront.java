package ultimate.java.progs;

import java.util.Arrays;

public class MoveOnesToFront {
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,1,3,2,1,2,1};
		int[] result = moveOnesToFront(arr);

		System.out.println(Arrays.toString(result));
	}

	public static int[] moveOnesToFront(int[] arr) {
		int countOnes = 0;
		int length = arr.length;

		// Count the number of 1's
		for (int num : arr) {
			if (num == 1) {
				countOnes++;
			}
		}

		// Create a new array to store the result
		int[] result = new int[length];
		int index = countOnes;

		// Fill the beginning of the result array with 1's
		Arrays.fill(result, 0, countOnes, 1);

		// Fill the remainder of the result array with non-1 elements
		for (int num : arr) {
			if (num != 1) {
				result[index++] = num;
			}
		}

		return result;
	}
}


