package ultimate.java.progs;

public class CompilationTestDemo {

	public static void main(String[] args) {

		A objB = new B();
		objB.m1();
	}

}


class A {
	protected void m1() {
		System.out.println("print from class A");
	}
}

class B extends A {
	@Override
	public void m1() {
		System.out.println("Print from class B");
		super.m1();
	}
}

// Super class having public method and child class having protected would result in compilation error as
//visibility problem that, cannot reduce the visibility of super class methods which override in child class methods.
//class A -->public() & class B -->protected it is compilation error
