package ultimate.java.progs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListReductionDemo {

	public static void main(String[] args) {

		List<Integer> ipList = new ArrayList<Integer>();
		ipList.add(4);
		ipList.add(6);
		ipList.add(8);
		
//		ipList.add(1);
//		ipList.add(3);
//		ipList.add(4);
//		ipList.add(5);
//		ipList.add(8);
		int a = reductionArray(ipList);
		System.out.println(a);
	}

	static int reductionArray(List<Integer> ipList) {
		Integer[] arr = new Integer[ipList.size()];
		arr = ipList.toArray(arr);
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(arr);
		int count = 0;
		
		while(list.size() > 1) {
			int a = list.get(0);
			int b = list.get(1);
			int sum = a + b;
			count = count + sum;
			
			list.remove(0); 
			list.remove(0);
			
			list.add(sum);
		}
		
		
		return count;
	}
}
