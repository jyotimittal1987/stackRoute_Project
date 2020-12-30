package com.niit.vehiclemonitoringsystem;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// Taking variable argument
		String modelNo = args[0];
		System.out.println(modelNo);
		if (modelNo.startsWith("P")) {
			// upcasting
			Engine myengine = new PetrolEngine(modelNo);
			myengine.showSpecs();
			// if (myengine instanceof PetrolEngine) {
			// PetrolEngine pengine;
			// pengine = (PetrolEngine) myengine;
			// pengine.showSpecs();
		} else if (modelNo.startsWith("D")) {
			// CNGEngine cengine;
			// cengine = (CNGEngine) myengine;
			// cengine.showSpecs();
			Engine myengine = new DieselEngine(modelNo);
			myengine.showSpecs();
		} else if (modelNo.startsWith("C")) {
			// DieselEngine dengine;
			// dengine = (DieselEngine) myengine;
			// dengine.showSpecs();
			Engine myengine = new CNGEngine(modelNo);
			myengine.showSpecs();
		} else {
			// ElectricEngine eengine;
			// eengine = (ElectricEngine) myengine;
			// eengine.showSpecs();
			Engine myengine = new ElectricEngine(modelNo);
			myengine.showSpecs();
		}

	}

}
