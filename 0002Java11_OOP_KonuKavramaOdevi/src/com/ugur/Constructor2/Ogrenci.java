package com.ugur.Constructor2;

public class Ogrenci {

	String ad;
	int yas;

	// Parametre almayan constructor
	public Ogrenci() {
		ad = "Bilinmiyor";
		yas = 0;
	}

	// String tipinde ad parametresi alan constructor
	public Ogrenci(String ad) {
		this.ad = ad;
		yas = 0;
	}

	// String ve int tipinde parametreler alan constructor
	public Ogrenci(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
	}

	public void tanit() {
		System.out.println("Ad: " + ad);
		System.out.println("Yaş: " + yas);
	}
}
