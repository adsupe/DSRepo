package scb.com.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoHash1 {

	public static void main(String[] args) {

		 String s1 = new String("Java");
	     String s2 = new String ("Java");
	     
	     String s3 = s1;
	     
	     String s4 = "Java";
	     System.out.println(s3==s4);
	     System.out.println(s3.equals(s4));
	     System.out.println("The two strings are equal :: " + s1.equals(s2));
	     System.out.println("The two strings are s3 and s2 :: " + s3.equals(s2));
	     System.out.println("Reference equals ::"+s1==s2);
	     String sw = "FB";
	     String sw2 = "Ea";
	     int hash3 = sw.hashCode() ;
	     int hash4 = sw2.hashCode();
	     System.out.println(hash3);
	     System.out.println(hash4);
	     
	     System.out.println("------------------------------------------------------");
	     
	     Parry p1 = new Parry(1);
	     Parry p2 = new Parry(1);
	     
	     System.out.println("The two parry objects are the same :: " + p1.equals(p2));
	     int hash1 = p1.hashCode();
	     int hash2 = p2.hashCode();
	     System.out.println(hash1);
	     System.out.println(hash2);
	     
	    Map<Parry,String>map = new HashMap<Parry,String>();
		map.put(p1, "Srinivas");
		map.put(p2, "Srinivas");
		System.out.println("Map size of Perry:: "+map.size());
	}

}


class Parry
{
	int id;
 
	public Parry() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public Parry(int id) {
		super();
		this.id = id;
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	@Override
	public String toString() {
		return "Person [id=" + id + "]";
	}
 
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parry other = (Parry) obj;
		return id == other.id;
	}
}
