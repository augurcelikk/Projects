package com.ugur.Inheritance2;

public class Araba {

	String marka;
	String model;

	public Araba(String marka, String model) {
		this.marka = marka;
		this.model = model;
	}

	public void calistir() {
		System.out.println("Araba çalıştı.");
	}

}
