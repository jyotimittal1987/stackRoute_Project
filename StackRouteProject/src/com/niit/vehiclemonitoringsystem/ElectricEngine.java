package com.niit.vehiclemonitoringsystem;

public class ElectricEngine extends Engine {
	String currentType;
	int voltage;

	public String getCurrentType() {
		return currentType;
	}

	public void setCurrentType(String currentType) {
		this.currentType = currentType;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	// constructor of Electric Engine

	public ElectricEngine(String modelNo) {
		super(modelNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showSpecs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printSpecs() {
		// TODO Auto-generated method stub

	}

}
