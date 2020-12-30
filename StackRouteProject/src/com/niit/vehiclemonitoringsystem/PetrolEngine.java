package com.niit.vehiclemonitoringsystem;

public class PetrolEngine extends Engine {

	// member varaibles
	int no_cylinder;
	int displacement;
	String CompressRatio;

	// constructor of PetrolEngine
	public PetrolEngine(String modelNo) {
		super(modelNo);
		// TODO Auto-generated constructor stub
	}
	// overriden method to show the engine specification

	@Override
	public void showSpecs() {
		if (modelNo == "P1000") {
			setMax_torque(90);
			setPowerRating(50);
			setWeight(75);
			setRpm(6000);
			setCompressRatio("11.0:1");
			setNo_cylinder(3);
			setDisplacement(996);

			printSpecs();

		}
		// rest of the models
	}

	public int getNo_cylinder() {
		return no_cylinder;
	}

	public void setNo_cylinder(int no_cylinder) {
		this.no_cylinder = no_cylinder;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public String getCompressRatio() {
		return CompressRatio;
	}

	public void setCompressRatio(String compressRatio) {
		CompressRatio = compressRatio;
	}
	// print all the specification

	@Override
	public void printSpecs() {
		// // TODO Auto-generated method stub
		System.out.println("1. Model No >> " + getModelNo());
		System.out.println("2. Torque >> " + getMax_torque());
		System.out.println("3. Compression Ratio >> " + getCompressRatio());
		System.out.println("4. Power rating >> " + getPowerRating());
		System.out.println("5. Cylinders >> " + getNo_cylinder());
		System.out.println("6. RPM >> " + getRpm());
		System.out.println("7. Weight >> " + getWeight());
	}

}
