package com.ugur.Inheritance;

public class Runner {

	/**
	 * -Java Inheritance (Kalıtım)-
	 * 
	 * CEVAP 1: Java'da bir sınıfın başka bir sınıftan kalıtım almasını sağlayan
	 * anahtar kelime "extends"dir. Kalıtım almak, bir sınıfın başka bir sınıftaki
	 * özellikleri ve davranışları miras almasını sağlar. Kalıtım yoluyla, bir
	 * sınıfın tüm özellikleri ve davranışları, temel aldığı sınıfın özellikleri ve
	 * davranışlarıyla genişletilmiş olur.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// Alt sınıftan nesne oluşturma
		Otomobil otomobil = new Otomobil("Toyota", "Corolla", 4);

		// Kalıtım aldığı üst sınıfın özelliklerine ve metotlarına erişim

		System.out.println("Marka: " + otomobil.marka);
		System.out.println("Model: " + otomobil.model);

		otomobil.calistir(); // Üst sınıfın metodu

		// Alt sınıfın kendi özelliklerine ve metotlarına erişim
		System.out.println("Kapı Sayısı: " + otomobil.kapiSayisi);
		otomobil.bagajAc();

		// Üst sınıftan türetilen alt sınıf nesnesi,
		// hem üst sınıfın hem de alt sınıfın özelliklerini taşır ve kullanabilir.

	}
}
