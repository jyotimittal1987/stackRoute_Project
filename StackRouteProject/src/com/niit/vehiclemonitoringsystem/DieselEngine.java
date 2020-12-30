package com.niit.vehiclemonitoringsystem;

public class DieselEngine extends Engine {
	// constructor of DieselEngine
	public DieselEngine(String modelNo) {
		super(modelNo);
		// TODO Auto-generated constructor stub
	}

	int no_cylinder;
	int diplacement;
	String CompressRatio;

	@Override
	public void showSpecs() {
		// TODO Auto-generated method stub

	}

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

	@Override
	public void printSpecs() {
		// TODO Auto-generated method stub

	}
}
