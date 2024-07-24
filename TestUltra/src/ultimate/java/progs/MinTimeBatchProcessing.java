package ultimate.java.progs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinTimeBatchProcessing {

	public static void main(String[] args) {

		List<Integer> batchSize = new ArrayList<Integer>();
		List<Integer> processingTime = new ArrayList<Integer>();
		List<Integer> numTasks = new ArrayList<Integer>();
		
		batchSize.add(3);batchSize.add(2);batchSize.add(5);batchSize.add(7);
		
		processingTime.add(5);processingTime.add(4);processingTime.add(10);processingTime.add(12);
		
		numTasks.add(10);numTasks.add(6);numTasks.add(10);numTasks.add(5);
		
		int minTime = minTime(batchSize, processingTime, numTasks);
		
		System.out.println("Minimum Time for processing the tasks : "+minTime);
		
	}

	
	static int minTime(List<Integer> batchSize,List<Integer> processingTime,List<Integer> numTasks) {
		int minTime = 0;
		List<Integer> list = new ArrayList<Integer>();
		//Considering all the input list size is same.
		for(int i=0;i<batchSize.size();i++) {
			int batch = batchSize.get(i);
			int procTime = processingTime.get(i);
			int task = numTasks.get(i);
			int time = 0;
			if(task > batch) {
				time  = (task/batch) + (task%batch);
				time = time * procTime;
			} else {
				time = procTime;
			}
			
			list.add(time);
		}
		
		Collections.sort(list,Collections.reverseOrder());
		
		minTime = list.get(0);
		
		return minTime;
		
	}
}
