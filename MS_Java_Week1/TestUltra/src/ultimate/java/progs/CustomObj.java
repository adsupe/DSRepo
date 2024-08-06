package ultimate.java.progs;

public class CustomObj {

	synchronized void m1() {
		System.out.println(Thread.currentThread().getName()+" in M1 method");
	}
	
	synchronized void m2() {
		System.out.println(Thread.currentThread().getName()+" in M2 method");
	}
	
	synchronized static void m3() {
		System.out.println(Thread.currentThread().getName()+" in M3 method");
	}
}
