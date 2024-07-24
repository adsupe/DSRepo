package ultimate.java.progs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample { 
	    public static void main(String[] args) 
	    { 
	  
	        // create object of ArrayList 
	        List<Integer> ArrLis 
	            = new ArrayList<Integer>(); 
	  
	        // Add elements 
	        ArrLis.add(32); 
	        ArrLis.add(67); 
	        ArrLis.add(98); 
	        ArrLis.add(100); 
	  
	        // print ArrayList 
	        System.out.println("ArrayList: "
	                           + ArrLis); 
	  
	        // Get the array of the elements 
	        // of the ArrayList 
	        // using toArray(T[]) method 
	        Integer arr[] = new Integer[ArrLis.size()]; 
	        arr = ArrLis.toArray(arr); // to convert arrays
	  
	        System.out.println("Elements of ArrayList"
	                           + " as Array: "
	                           + Arrays.toString(arr)); 
	        
	        ArrLis = new ArrayList<Integer>();
	        ArrLis = Arrays.asList(arr); // to convert list
	        System.out.println("Convert array to list :"+ArrLis);
	    } 
	} 

