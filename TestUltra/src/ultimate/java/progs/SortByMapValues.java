package ultimate.java.progs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortByMapValues {

	public static void main(String[] args) {

		// create a map and store elements to it
		LinkedHashMap<String,String> capitals = new LinkedHashMap<>();
		capitals.put("Nepal", "FFF");
		capitals.put("India", "BBB");
		capitals.put("United States", "YYY");
		capitals.put("England", "DDD");
		capitals.put("Australia", "AAA");

		// Create a list from elements of HashMap 
        List<Map.Entry<String, String> > list = 
               new LinkedList<Map.Entry<String, String> >(capitals.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, String> >() { 
            public int compare(Map.Entry<String, String> o1,  
                               Map.Entry<String, String> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, String> temp = new LinkedHashMap<String, String>(); 
        for (Map.Entry<String, String> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        
        System.out.println("Linked Hash Map used : "+temp);
        
	}

}


