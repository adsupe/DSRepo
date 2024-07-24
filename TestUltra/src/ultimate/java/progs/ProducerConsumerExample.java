package ultimate.java.progs;

public class ProducerConsumerExample {

	private static int numValue = 20;
	public static void main(String[] args) throws InterruptedException {
		final BlockingQueueForProducerConsumer blockingQueue = new BlockingQueueForProducerConsumer(numValue);
		
		//Producer
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i=0;i<numValue;i++) {
					blockingQueue.put(i);
				}
			}
		});
		
		//Consumer
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i=0;i<numValue;i++) {
					blockingQueue.take();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		 // t1 finishes before t2 
		t1.join();
		t2.join();
	}
}
