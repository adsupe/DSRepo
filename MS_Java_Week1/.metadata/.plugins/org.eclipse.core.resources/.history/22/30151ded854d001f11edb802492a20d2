package ultimate.java.progs;

import java.util.HashSet;

public class HashSetObjectDemo {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
		WorldString ws1 = new WorldString("abc");
		WorldString ws2 = new WorldString("abc");
		hs.add(ws1);
		hs.add(ws2);
		
		hs.add("abc");
		hs.add("abc");
		
		System.out.println(hs);
		
	}

}

class WorldString {
	
	String name;
	
	public WorldString(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this.getClass()!=obj.getClass()) {
			return false;
		} 
		WorldString ws = (WorldString)obj;
		if(ws.name != this.name) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int res = prime * name.hashCode();
		return res;
	}
}
