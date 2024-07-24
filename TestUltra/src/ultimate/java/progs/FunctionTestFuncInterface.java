package ultimate.java.progs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTestFuncInterface {

	public static void main(String[] args) {
		
		// Function<InputType,OutType> T,R 
		Function<Integer,Integer> f1 = a->a*a; // 
		System.out.println(f1.apply(6));
		System.out.println("______________END_______________");
		Function<String,Integer> f2 = b->b.length();  
		System.out.println(f2.apply("ADARSH-SUPE"));
		
		System.out.println("______________END_______________");
		
		Function<Television,String> f3 = c->{
			double price = c.price;
			String quality="";
			if(price>30000) {
				quality = "Excellent";
			} else if(price >10000 && price < 30000) {
				quality = "Good";
			} else {
				quality = "Bad";
			}
			return quality;
		};
		
		List<Television> telLi = new ArrayList<Television>();
		telLi.add(new Television("AAA", 11000));
		telLi.add(new Television("GGG", 5000));
		telLi.add(new Television("EEE", 2000));
		telLi.add(new Television("WWW", 55000));
		
		for(Television tl : telLi) {
			System.out.println("Name :"+tl.name);
			System.out.println("Price :"+tl.price);
			System.out.println("Quality :"+f3.apply(tl));
			System.out.println();
		}
		System.out.println("Use predicate to display only good and excellent");
		System.out.println("-------------------------------------------------");
		// Use predicate to display only good and excellent
		Predicate<Television> p1 = d->d.price > 10000;
		for(Television tl : telLi) {
			if(p1.test(tl)) {
				System.out.println("Name :"+tl.name);
				System.out.println("Price :"+tl.price);
				System.out.println("Quality :"+f3.apply(tl));
				System.out.println();
			}
			
		}
		
		
		//Function chaining using andThen(), compose()
		// we can perform f1.andThen(f2)
		Function<Integer,Integer> f4 = g->2*g;
		Function<Integer,Integer> f5 = h->h*h*h;
		System.out.println(f4.andThen(f5).apply(2));// Here first f4 will be applied for that result f5 will be applied.
		System.out.println(f4.compose(f5).apply(2));// Here first f5 will be applied for that result f4 will be applied.
	}

}
