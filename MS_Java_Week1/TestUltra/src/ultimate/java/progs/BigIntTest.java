package ultimate.java.progs;

import java.math.BigInteger;

public class BigIntTest {

	public static void main(String[] args) {

		BigInteger bigint1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111111111111111");
		BigInteger bigint2 = new BigInteger("22222222222222222222222222222222222222222222222222222222222222222222222222");
		
		System.out.println(bigint1.bitLength());
		System.out.println(bigint1.bitCount());
		System.out.println(bigint1.doubleValue());
		System.out.println(bigint1.intValue());
		System.out.println(bigint1.max(bigint2));
		System.out.println(bigint1.nextProbablePrime());
		System.out.println(bigint1.sqrt());
		
		System.out.println(new BigInteger("3333333333333333333333333333333333333").multiply(new BigInteger("3333333333333333333333333333333333333")));
		
		
		
		System.out.println("Add : "+bigint1.add(bigint2));
		
		System.out.println("Substract : "+bigint2.subtract(bigint1));
		
		System.out.println(17/10);
		
	}

}
