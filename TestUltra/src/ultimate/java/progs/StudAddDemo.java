package ultimate.java.progs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudAddDemo {

	public static void main(String[] args) {
		
		Addr a1 = new Addr("Bng");
		Addr a2 = new Addr("Pune");
		Addr a3 = new Addr("Hyd");
		
		Studd s1 = new Studd(2, "UU", a3,"A");
		Studd s2 = new Studd(1, "TT", a2,"A");
		Studd s3 = new Studd(6, "KK", a2,"C");
		Studd s4 = new Studd(3, "EE", a1,"B");
		Studd s5 = new Studd(7, "WW", a1,"A");
		Studd s6 = new Studd(8, "LL", a1,"B");
		
		List<Studd> listOfStudd = new ArrayList<Studd>();
		listOfStudd.add(s1);
		listOfStudd.add(s2);
		listOfStudd.add(s3);
		listOfStudd.add(s4);
		listOfStudd.add(s5);
		listOfStudd.add(s6);
		
		
		Map<Addr,Long> mapOfCityName = listOfStudd.stream().
				collect(Collectors.groupingBy(Studd::getAddr,Collectors.counting()));
		mapOfCityName.forEach((k,v)->System.out.println(k.getCity()+" :: "+v));
		
		System.out.println("===========");
		Map<String,Long> groupByGrade = listOfStudd.stream().
				collect(Collectors.groupingBy(Studd::getGrade,Collectors.counting()));
		groupByGrade.forEach((k,v)->System.out.println(k+"-"+v));
	}

}

class Studd{
	private int no;
	
	private String name;
	
	private Addr addr;
	
	private String grade;
	
	public Studd(int no, String name, Addr addr,String grade) {
		super();
		this.no = no;
		this.name = name;
		this.addr = addr;
		this.grade = grade;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Addr getAddr() {
		return addr;
	}

	public void setAddr(Addr addr) {
		this.addr = addr;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}

class Addr {
	private String city;

	public Addr(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}