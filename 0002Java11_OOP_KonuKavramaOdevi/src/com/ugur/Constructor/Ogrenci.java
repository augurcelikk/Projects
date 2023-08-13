package com.ugur.Constructor;

public class Ogrenci {

	String ad;
	int yas;

	// Parametre almayan constructor
	public Ogrenci() {
		ad = "Bilinmiyor";
		yas = 1;
	}

	public void tanit() {
		System.out.println("Ad: " + ad);
		System.out.println("Yaş: " + yas);
	}
}
