package scb.com.javaft;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunIntDemo1 {

	public static void main(String[] args) {

		MyInt1 sq1 = (int x)->{return x*x;};
		System.out.println(sq1.square(36));
		sq1.sqMyInt1();
		MyInt1.statMyInt1();
		
		MyInt1 sq2 = (x)->{return x*x;};
		System.out.println(sq2.square(25));
		
		MyInt2 js1 = ()->System.out.println("Whatever just...");
		js1.just();
		
		MyInt3 int3 = new MyInt3Impl();
		System.out.println(int3.m1());
		MyInt3.statMyInt3();
		
		MyInt4 int4 = new MyInt3Impl();
		int4.myInt4Funcional((String a)->a.length()>3, "Hello");
		System.out.println(int4.m1());
		System.out.println(MyInt4.m2());
		
		
	}

}

interface MyInt1 {
	
	public int square(int x);
	
	default void sqMyInt1() {
		System.out.println("sqMyInt1");
	}
	
	static void statMyInt1() {
		System.out.println("Static method in interface");
	}
}

interface MyInt2 {
	
	public void just();
}

interface MyInt3 {
	
	default String m1(){
		return "m1 from Int3 default";
	}
	
	static int m2() {
		return 0;
		
	}
	
	static void statMyInt3() {
		System.out.println("Static method in interface");
	} 
}

interface MyInt4 {
	
	default String m1(){
		return "m1 from Int4 default";
	}
	
	static int m2() {
		return 1;
		
	}
	
	default void myInt4Funcional(Predicate<String> action,String a) {
		System.out.println("Test functional interface using default method :: "+action.test(a));
	}
}

class MyInt3Impl implements MyInt3,MyInt4{

	@Override
	public String m1() {
		// TODO Auto-generated method stub
		return "Concerete class "+MyInt3.super.m1() + MyInt4.super.m1();
	}
	
}