package com.ugur.Inheritance;

public class Otomobil extends Araba {

	int kapiSayisi;

	public Otomobil(String marka, String model, int kapiSayisi) {
		super(marka, model);
		this.kapiSayisi = kapiSayisi;
	}

	public void bagajAc() {
		System.out.println("Bagaj açıldı.");
	}

}
