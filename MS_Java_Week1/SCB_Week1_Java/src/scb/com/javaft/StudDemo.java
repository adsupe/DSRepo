package scb.com.javaft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Emps e1 = new Emps(112,"Shweta",5000);
       Emps e2 = new Emps(2,"Bharath",15000);
       Emps e4 = new Emps(33,"Meera",8000);
       List<Emps> employees = new ArrayList<Emps>();
       employees.add(e1);
       employees.add(e2);
       employees.add(e4);
       System.out.println("List before sorting = " + employees);
       Collections.sort(employees);
       System.out.println("List After sorting = " + employees);

	}
}
