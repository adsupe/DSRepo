package ultimate.java.progs;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteDemo {
	
	//ReadLock and WriteLock though are 2 separate instances only 1 will be allowed at a time.
	//Either ReadLock is being used by n number of threads  OR WriteLock is being used by 1 thread.
	//But never both at same time.

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
	private ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
	
	//Multiple threads allowed to access this
	private void readResource() {
		readLock.lock();
		System.out.println("Read resource :: "+Thread.currentThread().getName());
		readLock.unlock();
	}
	
	//Only one thread is allowed to access.
	private void writeResource() {
		writeLock.lock();
		//write and process resource
		System.out.println("Write resource :: "+Thread.currentThread().getName());
		writeLock.unlock();
	}
	public static void main(String[] args) {
		ReentrantReadWriteDemo obj = new ReentrantReadWriteDemo();
		Thread t1 = new Thread(()->obj.readResource()); t1.setName("t1-thread"); t1.start();
		Thread t2 = new Thread(()->obj.readResource()); t2.setName("t2-thread"); t2.start();
		Thread t3 = new Thread(()->obj.writeResource());t3.setName("t3-thread"); t3.start();
		Thread t4 = new Thread(()->obj.writeResource());t4.setName("t4-thread"); t4.start();
		Thread t5 = new Thread(()->obj.readResource()); t5.setName("t5-thread"); t5.start();
	}

}
