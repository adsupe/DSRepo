package scb.com.javaft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ComparatorDemo {
 
	
	public static void main(String[] args) {
		
		
		
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] sr = str.split(" ");
	Map<String, Long> hm = Arrays.asList(sr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	hm.forEach((k,v)->System.out.println(k+":"+v));
	Map<String,Integer> map = new HashMap<String,Integer>();
	
	for(String w : sr) {
		if(map.get(w) != null) {
			map.put(w, map.get(w)+1);
		} else {
			map.put(w,1);
		}
	}
	
	System.out.println("Count the number of String given in the args ::"+map);
	
	Students	s1 = new Students(111,"Sumit",90.0);
	Students	s2 = new Students(34,"Rohit",45.0);
	Students	s3 = new Students(456,"Pavan",56.5);
	Students	s4 = new Students(12,"Shreya",23.0);
	ArrayList<Students>as = new ArrayList<Students>();
	as.add(s1);
	as.add(s2);
	as.add(s3);
	as.add(s4);
	System.out.println("printing student details using for loop");
	for(Students s:as) {
		System.out.println(s.rollNo);
		System.out.println(s.nmae);
		System.out.println(s.marks);
	}
	System.out.println("The student list is " +as);
	Collections.sort(as,new MarkComparator());
	System.out.println("After sorting the student list with MARK " + as);
	Collections.sort(as,new NameComparator());
	System.out.println("After sorting the student list NAME " + as);
	}
 
}
