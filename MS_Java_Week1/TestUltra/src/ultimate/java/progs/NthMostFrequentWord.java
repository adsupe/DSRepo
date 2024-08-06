package ultimate.java.progs;

import java.util.HashMap;

public class NthMostFrequentWord {
	
	private static HashMap<String, Integer> map;

	 private static final String[] NESTED_PATHS_TO_INITIALIZE_VENDOR = new String[] {
				"offsetCode", "referenceDomain",
				"payTo",
				"paymentTerm",
				"paymentTerm",
				"nls",
				"contacts",
				"addresses",
				"paymentLocation",
				"paymentTerm",
				"paymentTerm",
				"paymentTerm",
				"paymentTerm",
				"contacts",
				"contacts"
			};
	 
	public static void main(String[] args) {
		
		String nthMost = getNthMostFrequent(NESTED_PATHS_TO_INITIALIZE_VENDOR);
		System.out.println(nthMost + " = "+map.get(nthMost));
	}
	
	public static String getNthMostFrequent(String[] a) {
		map = new HashMap<String, Integer>();
		int maxCount=0 ;
		String freqValue = "";
		for(int i=0; i < a.length; i++) {
			if(map.get(a[i]) == null) { //Insert new.
				map.put(a[i], 1);
			}else { //Already exists. Just increment the count.
				int count = map.get(a[i])+1;
				map.put(a[i], count);
				if(count > maxCount) {
					maxCount = count;
					freqValue = a[i];
				}

			}
		}
		//incase all numbers are unique.
		if(freqValue.equals("") && a.length > 0) {
			return a[0];
		}
		return freqValue;
	}
}
