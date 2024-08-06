package com.caps.fs.Springonescb;

public class Car {

	private String vehicleNo;
	
	private String name;
	
	private double litre;
	
	private Engine engine;
	
//	public Car(String vehicleNo, String name, double litre, Engine engine) {
//		this.vehicleNo = vehicleNo;
//		this.name = name;
//		this.litre = litre;
//		this.engine = engine;
//	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLitre() {
		return litre;
	}

	public void setLitre(double litre) {
		this.litre = litre;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
