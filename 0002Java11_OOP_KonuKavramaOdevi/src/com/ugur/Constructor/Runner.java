package com.ugur.Constructor;

public class Runner {

	public static void main(String[] args) {

		// Parametre almayan constructor çağrısı
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.tanit();

		// Parametre almayan constructor çağrısı
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.ad = "Ahmet";
		ogrenci2.yas = 20;
		ogrenci2.tanit();
	}

}
