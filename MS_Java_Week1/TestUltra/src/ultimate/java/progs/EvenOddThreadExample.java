package ultimate.java.progs;

public class EvenOddThreadExample {

	public static void main(String[] args) {

		EvenOddThreadLogic evenOddThreadLogic = new EvenOddThreadLogic(20);
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				evenOddThreadLogic.printOddNum();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				evenOddThreadLogic.printEvenNum();
			}
		});
		
		t1.setName("Odd-Thread");
		t2.setName("Even-Thread");
		
		t1.start();
		t2.start();
	}

}
