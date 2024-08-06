package ultimate.java.progs;

public class EvenOddThreadLogic {

	
	private int n;
	private int counter = 1;
	
	public EvenOddThreadLogic(int n) {
		this.n = n;
	}
	
	public void printOddNum() {
		synchronized (this) {
			while(counter < n) {
				while(counter%2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+ " - "+ counter);
				counter++;
				notify();
			}
		}
	}
	
	public void printEvenNum() {
		synchronized (this) {
			while(counter < n) {
				while(counter%2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+ " - "+ counter);
				counter++;
				notify();
			}
		}
	}
}
