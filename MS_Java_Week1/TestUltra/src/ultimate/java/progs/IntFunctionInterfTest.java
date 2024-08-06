package ultimate.java.progs;

import java.math.BigDecimal;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;

public class IntFunctionInterfTest {

	public static void main(String[] args) {

		IntFunction<String> intF1 = f->String.valueOf(f)+" Very good";
		System.out.println(intF1.apply(29));
		
		
		DoubleToIntFunction dtoint = d->BigDecimal.valueOf(d).intValue();
		System.out.println(dtoint.applyAsInt(30.33));
	}

}
