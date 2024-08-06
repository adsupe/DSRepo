package ultimate.java.progs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ReferenceTestDemo {

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("abc");
		doSomething1(p);
		System.out.println(p.getName());// abc
		
		
		doSomething2(p);
		System.out.println(p.getName());//pqr
		
		doSomething3(p);
		System.out.println(p.getName());//pqr
		
		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.getTime());
//		
//		Date date = cal.getTime();
//		System.out.println(date);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//		
//		String formatString = sdf.format(date);
//		
//		System.out.println(formatString);
//		
		
	}

	static void  doSomething1(Person p ) {
		p = null;
	}
	
	static void  doSomething2(Person p ) {
		p.setName("pqr");
	}
	
	static void  doSomething3(Person p ) {
		p = new Person();
		p.setName("xyz");
	}
}

class Person {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
