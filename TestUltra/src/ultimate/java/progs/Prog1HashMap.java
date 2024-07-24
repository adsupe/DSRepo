package ultimate.java.progs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Prog1HashMap {

	public static void main(String[] args) {

		HashMap<Employee, String> hm=new HashMap<Employee, String>();
		Employee em1 = new Employee(233, "TL", "ABC");
		Employee em2 = new Employee(234, "SE", "CDF");
		Employee em3 = new Employee(145, "AP", "RFD");
		Employee em4 = new Employee(176, "AC", "WER");
//		Employee em5 = new Employee(184, "DC", "TYU");
		
		hm.put(em1, "emp1");
		hm.put(em2, "emp2");
		hm.put(em3, "emp3");
		hm.put(em4, "emp4");
        
        System.out.println(hm.get("Same KEY and Value -- "+hm.get(new Employee(176, "AC", "WER"))));
        System.out.println(hm.get(em4));
		
        hm.keySet().iterator();
//		List<Employee> listEmployee = new ArrayList<Employee>();
//		
//		Employee em1 = new Employee(233, "TL", "ABC");
//		Employee em2 = new Employee(234, "SE", "CDF");
//		Employee em3 = new Employee(145, "AP", "RFD");
//		Employee em4 = new Employee(176, "AC", "WER");
//		Employee em5 = new Employee(184, "DC", "TYU");
//		
//		listEmployee.add(0,new Employee(342,"CEO", "CEO"));
//		listEmployee.add(em1);
//		listEmployee.add(em2);
//		listEmployee.add(em3);
//		listEmployee.add(em4);
//		listEmployee.add(em5);
//		
//		
//		
//		Collections.sort(listEmployee,new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				if(o1.getDesignation().equals("CEO") || o2.getDesignation().equals("CEO")) {
//					return 0;
//				}
//				if(o1.getId().compareTo(o2.getId()) > 0) {
//					return 1;
//				} else if(o1.getId().compareTo(o2.getId()) < 0) {
//					return -1;
//				} else if(o1.getId().compareTo(o2.getId()) == 0) {
//					return 0;
//				}
//				return 0;
//			}
//			
//		});
//		for(Employee em : listEmployee) {
//			System.out.println(em.getId()+" -- "+em.getDesignation());
//		}
		
		ConcurrentHashMap<Integer,Integer> chm = new ConcurrentHashMap<Integer,Integer>();
		chm.put(1, 10);
		chm.put(2, 20);
		chm.put(3, 30);
		
		Set<Map.Entry<Integer,Integer>> entry = chm.entrySet();
		
		for(Map.Entry<Integer,Integer> en : entry) {
			System.out.println(en.getValue());
			chm.put(4, 40);
		}
		System.out.println(3.01 == 3*0.01);
	}

}
