package ultimate.java.progs;

public class TwoSortedArrays {

	public static void main(String[] args) {

		int[] a1 = new int[] {2,3,7,9};
		int[] a2 = new int[] {1,4,5,6,8,12};
		
//		int[] a1 = new int[] {10,12,16,18};
//		int[] a2 = new int[] {9,12,15,18,21};
		
		int i=0,j=0,index=0;
		
		int res[] = new int[a1.length+a2.length];
		while(i<a1.length && j<a2.length) {
			if(a1[i] < a2[j]) {
				res[index++] = a1[i++];
			} else if(a1[i] > a2[j]) {
				res[index++] = a2[j++];
			} 
//			else {
//				res[index] = a1[i];// if duplicates want to be removed only add this. Else need to add   
//				index++;
//				res[index] = a2[j];
//				index++;
//				i++;j++;
//			}
		}
		
		while(i < a1.length) {
			res[index++] = a1[i++];
		}
		
		while(j < a2.length) {
			res[index++] = a2[j++];
		}
		
		for (int mer : res) {
			System.out.print(mer + " ");
		}
		
	}

}
