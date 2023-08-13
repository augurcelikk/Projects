package com.ugur.Inheritance;

public class Araba {

	String marka;
	String model;

	public Araba(String marka, String model) {
		this.marka = marka;
		this.model = model;
	}

	public void calistir() {
		System.out.println("Araba çalıştı.");
		// Üst sınıftan türetilen alt sınıf nesnesi,
		// hem üst sınıfın hem de alt sınıfın özelliklerini taşır ve kullanabilir.
	}

}
