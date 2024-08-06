package ultimate.java.progs;

public class FITest implements Phone{

	public static void main(String[] args) {

		FITest fiTest = new FITest();
		fiTest.customMethod();
		
		
		StringFunction exclaim = (s) -> s + "!";
	    StringFunction ask = (s) -> s + "?";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);
	    
	    
	   Fun1 fun1 = ()->System.out.println("Print Fun1");
	   fun1.print();
	   
	   Fun2 fun2 = (a)->System.out.println(a);
	   fun2.print(18);
	   
	   Fun3 fun3 = (a,b)->System.out.println(a*b);
	   testFun3(fun3, 10, 20);
	   
//	   Fun4 fun4 = (a,b)->a%b == 0;
//	   if(fun4.print(10, 2)) System.out.println("Valid factor");
//	   if(!fun4.print(10, 3)) System.out.println("In Valid factor");
//	   
//	   Fun5 fun5 = (a,b) -> Integer.toString(a)+"-"+b;
	   
	  Fun4 fun4 = new Fun45Impl();
	  
	   
	   Fun6.print(); // directly called by interface name and used for utility methods
	   
	}

	@Override
	public void customMethod() {
		System.out.println("Test custom method!!");
	}

	public static void printFormatted(String str, StringFunction format) {
	    String result = format.run(str);
	    System.out.println(result);
	  }
	
	static void testFun3(Fun3 fun3,Integer a,Integer b) {
		fun3.print(a, b);
	}
	
}

interface StringFunction {
	  String run(String str);
	}

interface Fun1{
	void print();
}

interface Fun2{
	void print(Integer a);
}

interface Fun3{
	void print(Integer a,Integer b);
}

interface Fun4{
//	boolean print(Integer a,Integer b);
	
	default void tell() {
		System.out.println("Fun4 tell default method");
	}
}

interface Fun5{
//	String print(Integer a,String b);
	
	default void tell1() {
		System.out.println("Fun5 tell default method");
	}
}

//static method in interface
interface Fun6 {
	public static void print() {
		System.out.println("Interface static methods always called by interface name itself and its not available to any implementation class.");
	}
}

class Fun45Impl implements Fun4,Fun5{
	
}
