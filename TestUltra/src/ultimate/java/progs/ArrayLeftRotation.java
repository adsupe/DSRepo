package ultimate.java.progs;

import java.io.IOException;

public class ArrayLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	
        for(int i=0;i<d;i++) {
        	int j =0;
        	int first = a[0];
        	while(j < (a.length-1)) {
        		a[j] = a[j+1];
        		j++;
        	}
        	a[j] = first; 
        }
		return a;
    }


    public static void main(String[] args) throws IOException {
    	
    	int[] a = {1,2,3,4,5};
    	int d = 4;
    	
    	int res[] = rotLeft(a, d);
    	for(Integer as : res) {
    		System.out.println(as);
    	}
    }
}

