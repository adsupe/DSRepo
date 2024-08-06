package ultimate.java.progs;

import java.util.function.BiFunction;

public class BiFunctionTestFuncInterf {

	public static void main(String[] args) {

		// BiFunction<T as first I/P type, U as Second i/p type, R as return type>
		BiFunction<String, Integer, Television> biF1 = (name,price) -> new Television(name, price);
		Television t1 = biF1.apply("TTT",11188 );
		System.out.println(t1);
		
		//Below is the way to use consumer.
//		Consumer con = t->
//		{
//			System.out.println(t);
//		};
//		
//		con.accept(biF1.apply("TTT",11188 ));
//		con.accept(biF1.apply("EEE",77777 ));
//		con.accept(biF1.apply("SAMMM",6666 ));
	}

}
