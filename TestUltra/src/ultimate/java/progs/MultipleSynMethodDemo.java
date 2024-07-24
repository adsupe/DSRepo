package ultimate.java.progs;

public class MultipleSynMethodDemo {

	public static void main(String[] args) {

		CustomObj ob1  = new CustomObj();
		CustomObj ob2 = new CustomObj();
		Thread t1 = new Thread(new CustomObjThread1(ob1,ob2));
		Thread t2 = new Thread(new CustomObjThread2(ob1, ob2));
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
	}
	
}

class CustomObjThread1 implements Runnable {

	CustomObj ob1;
	CustomObj ob2;
	public CustomObjThread1(CustomObj ob1,CustomObj ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	@Override
	public void run() {
		System.out.println("Thread from CustomObjThread1 ");
//		ob1.m1();
		ob1.m2();
//		ob1.m3();
	}
}

class CustomObjThread2 implements Runnable {

	CustomObj ob1;
	CustomObj ob2;
	public CustomObjThread2(CustomObj ob1,CustomObj ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	@Override
	public void run() {
		System.out.println("Thread from CustomObjThread2 ");
//		ob2.m1();
//		ob2.m2();
		ob2.m3();
	}
}
