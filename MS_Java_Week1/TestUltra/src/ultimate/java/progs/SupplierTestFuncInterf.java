package ultimate.java.progs;

import java.util.function.Supplier;

public class SupplierTestFuncInterf {

	public static void main(String[] args) {

		// Supplier function is to get the desired type. Here String is the type, that will return.
		Supplier<String> s1 = ()->{
			String otp = "";
			
			for(int i=0;i<6;i++) {
				int r = (int)( Math.random()*10);
				otp = otp+r;
			}
			return otp;
		};
		
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
	}

}
