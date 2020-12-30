package com.niit.vehiclemonitoringsystem;

//abstract class Engine
public abstract class Engine {
	// properties of engine class
	String modelNo;

	public String getModelNo() {
		return modelNo;
	}

	public abstract void printSpecs();

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	int powerRating;
	int max_torque;
	int rpm;
	int weight;

	// getter and setter

	public int getPowerRating() {
		return powerRating;
	}

	public Engine(String modelNo) {
		super();
		this.modelNo = modelNo;
	}

	public void setPowerRating(int powerRating) {
		this.powerRating = powerRating;
	}

	public int getMax_torque() {
		return max_torque;
	}

	public void setMax_torque(int max_torque) {
		this.max_torque = max_torque;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public abstract void showSpecs();

}
