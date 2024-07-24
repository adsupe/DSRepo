package ultimate.java.progs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveNegativeNum {

	public static void main(String[] args) {

		List<Integer> objArray = new ArrayList<Integer>();
	      objArray.clear();
	      objArray.add(2);
	      objArray.add(-3);
	      objArray.add(4);
	      objArray.add(-5);
	      objArray.add(-4);
	      System.out.println("Array before removing an element "+objArray);
	      Iterator<Integer> iterator = objArray.iterator();
	     
	         while(iterator.hasNext()) {
	         Integer next = iterator.next();
	         if(next < 0) {
	            iterator.remove();
	         }
	      }
	      System.out.println("Array after removing an element"+objArray);;
		
	}

	
}
