package ultimate.java.progs;

public class FibonacciSeries {

	public static void main(String[] args) {

		int i = 0;
		int k = 1;
		int n = 10;
		int temp =0;
		System.out.print(i+" ");
		System.out.print(k+" ");
		while((n-2)!=0) {
			temp = i+k;
			System.out.print(temp+" ");
			i = k;
			k = temp;
			n--;
		}
	}

}
