package com.caps.fs.Springonescb;


import java.util.Iterator;
import java.util.List;

public class Person {
	private	int id;
	private	String name;
	private	List <String> characterstics;
	private List<Address> address;
		
		
		
	public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public List<String> getCharacterstics() {
			return characterstics;
		}



		public void setCharacterstics(List<String> characterstics) {
			this.characterstics = characterstics;
		}


		

	public List<Address> getAddress() {
			return address;
		}



		public void setAddress(List<Address> address) {
			this.address = address;
		}



	public void showDetails() {
		System.out.println(id);
		System.out.println("Below are the characterstics of " + name);
		Iterator itr = characterstics.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		getAddress().stream().forEach(i->System.out.println(i.getAddress1()));
	}
}
