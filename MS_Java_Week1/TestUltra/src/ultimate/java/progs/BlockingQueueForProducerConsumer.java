package ultimate.java.progs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueueForProducerConsumer {

	private Queue<Integer> queue;
	private int max;
	private ReentrantLock lock = new ReentrantLock(true);
	private Condition empty = lock.newCondition();
	private Condition full = lock.newCondition();
	
	public BlockingQueueForProducerConsumer(int size) {
		this.queue = new LinkedList<Integer>();
		this.max = size;
	}

	public void put(Integer value) {
		lock.lock();
		try {
			while(queue.size() == this.max) {
				empty.wait(1000);
				
			}
			System.out.println("Producer : "+value);
			queue.add(value);
			full.signalAll();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}
	
	public Integer take() {
		lock.lock();
		Integer value = 0;
		try {
			while(queue.size() == 0) {
				full.wait();
			}
			value = queue.remove();
			System.out.println("Consumer : "+value);
			empty.signalAll();
			
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		finally {
			lock.unlock();
		}
		return value;
		
	}
	
	
}
