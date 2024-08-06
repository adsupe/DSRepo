package scb.com.hash;

import java.util.HashMap;
import java.util.Map;

public class DemoHash {
	public static void main(String[]args)
	{
		EmpClassHash e1 = new EmpClassHash(1);
		EmpClassHash e2 = new EmpClassHash(1);
		Map<EmpClassHash,String>map = new HashMap<EmpClassHash,String>();
		map.put(e1, "Srinivas");
		map.put(e2, "Srinivas");
		System.out.println("Map size of empclasshash:: "+map.size());
		//_size =2 because the hashCode() not overridden____________________________________
		//Wrapper classses override the hashCode() of the Object
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Map<Integer,String>map2 = new HashMap<Integer,String>();
		map2.put(i1, "one");
		map2.put(i2, "one");
		System.out.println("The size of the Integer map is " + map2.size());
	}
 
}

class EmpClassHash {

	private int id;

	public EmpClassHash(int id) {
		super();
		this.id = id;
	}

	public EmpClassHash() {
		super();
	}

	@Override
	public String toString() {
		return "EmpClassHash [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
