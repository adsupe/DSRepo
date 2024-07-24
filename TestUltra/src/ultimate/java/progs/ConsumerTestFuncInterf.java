package ultimate.java.progs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerTestFuncInterf {

	public static void main(String[] args) {
		
		//Consumer first example
		Consumer<String> con2 = c2->System.out.println(c2);
		con2.accept("ADARSH-SUPE");
		
		
		List<Television> telLi = new ArrayList<Television>();
		telLi.add(new Television("AAA", 11000));
		telLi.add(new Television("GGG", 5000));
		telLi.add(new Television("EEE", 2000));
		telLi.add(new Television("WWW", 55000));
		
		//Function to get quality of the television

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
		
		// Predicate to verify if the price is > 10000
		// Use predicate to display only good and excellent
		Predicate<Television> p1 = d->d.price > 10000;
		
		// Consumer is for accept the object as it is and perform action, here we can print the Television details.
		Consumer<Television> con1 = c1->{
			System.out.println("Name :"+c1.name);
			System.out.println("Price :"+c1.price);
			System.out.println("Quality :"+f3.apply(c1));
			System.out.println();
		};
		
		for(Television tl : telLi) {
			if(p1.test(tl)) {
				con1.accept(tl);
			}
			
		}
	}

}
