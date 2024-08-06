package ultimate.java.progs;

import java.math.BigDecimal;
import java.util.List;

public class NoteUtil {

	Integer id;
	String name;
	String model;
	BigDecimal price;
	double salary;
	List<Fuss> listOfFuss;
	
	public NoteUtil(Integer id, String name, String model,BigDecimal price,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.salary = salary;
	}
	
	public NoteUtil(Integer id, String name, String model,BigDecimal price,double salary,List<Fuss> listOfFuss) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.salary = salary;
		this.listOfFuss = listOfFuss;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(String model) {
		this.model = model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public List<Fuss> getListOfFuss() {
		return listOfFuss;
	}
	public void setListOfFuss(List<Fuss> listOfFuss) {
		this.listOfFuss = listOfFuss;
	}
	
	
}
