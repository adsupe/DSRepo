package ultimate.java.progs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


class Television {
	
	String name;
	double price;
	
	public Television(String name,double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+":"+String.valueOf(price);
	}
}

public class PredicateTestFunInterf {

	public static void main(String[] args) {
		
		// Predicate has more code re-usability. 
		//If there are several conditions that can be checked & save it in predicate for any further check.
		//This is the reason the conditions avoid using directly at if statements.
		// java.util.function.*
		System.out.println("Predicate even or odd number :");
		System.out.println("--------------------------------");
		Predicate<Integer> p1 = i->i%2==0; // just to check condition. abstract method here is test(T t)
		System.out.println(p1.test(10));
		System.out.println(p1.test(11));
		System.out.println("______________END_______________");
		
		System.out.println("Predicate String length check :");
		System.out.println("--------------------------------");
		Predicate<String> p2 = s->s.length() >5;
		System.out.println(p2.test("Adarsh"));
		System.out.println(p2.test("Sneha"));
		System.out.println("______________END_______________");
		
		System.out.println("Predicate Television price check > 10000 :");
		System.out.println("-----------------------------------------");
		List<Television> telLi = new ArrayList<Television>();
		telLi.add(new Television("AAA", 3000));
		telLi.add(new Television("GGG", 11000));
		telLi.add(new Television("EEE", 2000));
		telLi.add(new Television("WWW", 55000));
		
		Predicate<Television> p3 = t->t.price>10000;
		
		for(Television tl : telLi) {
			if(p3.test(tl)) {
				System.out.println(tl);
			}
		}
		
		System.out.println("______________END_______________");
		
		
		int[] intX = {0,5,10,15,20,25,30,35};
		
		Predicate<Integer> p4 = i->i%2==0;// Number should be even
		Predicate<Integer> p5 = i->i>10;// Number should > 10
		
		for(Integer xx : intX) {
			//.and both condition should be applied or true.
			if(p4.and(p5).test(xx)) {
				System.out.println("Numbers are even and greater than 10 ::"+xx);
			}
		}
		System.out.println("--------------END AND predicate------------");
		for(Integer xx : intX) {
			//.or any one condition should be applied or true.
			if(p4.or(p5).test(xx)) {
				System.out.println("Numbers are even and greater than 10 ::"+xx);
			}
		}
		
		System.out.println("--------------END OR predicate------------");
		for(Integer xx : intX) {
			//.negate condition.Print odd numbers
			if(p4.negate().test(xx)) {
				System.out.println("Numbers are odd ::"+xx);
			}
		}
		
	}
	

}
