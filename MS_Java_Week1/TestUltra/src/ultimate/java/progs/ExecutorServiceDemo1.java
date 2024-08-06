package ultimate.java.progs;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo1 {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		for(int i=0;i<5;i++) {
			Future<String> future =  executorService.submit(new Task1());
			if(future.isDone()) {
				try {
					System.out.println("Future Result : "+future.get());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Task Completed....");
	}

}

class Task1 implements Callable<String>{
	
	@Override
	public String call() {
		String threadName = Thread.currentThread().getName();
		System.out.println("task running :"+threadName);
		return threadName;
	}
	
}
