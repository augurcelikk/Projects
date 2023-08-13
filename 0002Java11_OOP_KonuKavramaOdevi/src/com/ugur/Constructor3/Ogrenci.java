package com.ugur.Constructor3;

public class Ogrenci {

	String ad;
	int yas;

	// Parametre almayan constructor
	public Ogrenci() {
		ad = "Bilinmiyor";
		yas = 0;
	}

	// String ve int tipinde parametreler alan constructor
	public Ogrenci(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
	}

	// Copy constructor
	public Ogrenci(Ogrenci digerOgrenci) {
		this.ad = digerOgrenci.ad;
		this.yas = digerOgrenci.yas;
	}

	public void tanit() {
		System.out.println("Ad: " + ad);
		System.out.println("Yaş: " + yas);
	}

}
