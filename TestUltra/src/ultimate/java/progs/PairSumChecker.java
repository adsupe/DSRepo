package ultimate.java.progs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PairSumChecker {

	public static void main(String[] args) {
		
		int [] arr = new int[]{1,2,4,-3,-4,1,5};
		int target = -2;
		HashSet<Integer> hash = new HashSet<Integer>();
		boolean pairSumChecker = false;
		for(int i=0;i<arr.length;i++) {
			int value = target - arr[i];
			if(hash.contains(value)) {
				pairSumChecker = true;
				System.out.println("Pair is : ("+value+","+arr[i]+")");
			} 
			hash.add(arr[i]);
		}
		
	}

}
