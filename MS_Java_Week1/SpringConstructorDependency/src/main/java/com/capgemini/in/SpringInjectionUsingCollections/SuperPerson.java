package com.capgemini.in.SpringInjectionUsingCollections;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SuperPerson {
	private	int id;
	private	String name;
	private	List <String> characterstics;
	private List<Address> address;
	private Map<String,Integer> styleRating;  	
		

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


		

	public Map<String, Integer> getStyleRating() {
			return styleRating;
		}



		public void setStyleRating(Map<String, Integer> styleRating) {
			this.styleRating = styleRating;
		}



	public void showDetails() {
		System.out.println(id);
		System.out.println("Below are the characterstics of " + name);
		Iterator itr = characterstics.iterator();
		System.out.println("With normal list");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("With List objects");
		getAddress().stream().forEach(i->System.out.println(i.getAddress1()+" with the number : "+i.getId()));
		
		System.out.println("With Map ");
		getStyleRating().entrySet().forEach(i->System.out.println(i.getKey()+" :: "+i.getValue()));
	}
}
