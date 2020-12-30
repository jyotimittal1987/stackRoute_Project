package com.niit.vehiclemonitoringsystem;

public class CNGEngine extends Engine {
	// constructor of CNGEngine
	public CNGEngine(String modelNo) {
		super(modelNo);
		// TODO Auto-generated constructor stub
	}

	int no_cylinder;

	// getter and setter
	public int getNo_cylinder() {
		return no_cylinder;
	}

	public void setNo_cylinder(int no_cylinder) {
		this.no_cylinder = no_cylinder;
	}

	public int getDiplacement() {
		return diplacement;
	}

	public void setDiplacement(int diplacement) {
		this.diplacement = diplacement;
	}

	public String getCompressRatio() {
		return CompressRatio;
	}

	public void setCompressRatio(String compressRatio) {
		CompressRatio = compressRatio;
	}

	int diplacement;
	String CompressRatio;

	@Override
	public void showSpecs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printSpecs() {

	}
}
