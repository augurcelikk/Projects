package com.ugur.Abstract;

public class Runner {

	/**
	 * 
	 * Soyut Sınıflar (Abstract Classes): Soyut sınıflar, içlerinde soyut
	 * (implementasyonu olmayan) metotlar bulunduran ve doğrudan örneklenemeyen
	 * sınıflardır. Soyut sınıflar, ortak özellikleri paylaşan alt sınıfların
	 * kalıtım almasını sağlayarak benzer bir arayüz ve davranış sergilemelerini
	 * sağlar. Bir sınıf soyut olarak tanımlandığında, abstract anahtar kelimesi
	 * kullanılır.
	 * 
	 * Soyut Metotlar (Abstract Methods): Soyut metotlar, soyut sınıflar içinde
	 * tanımlanan, ancak gerçek uygulamaları soyut sınıfın alt sınıfları tarafından
	 * sağlanan metotlardır. Soyut metotlar sadece metot imzasını (ad, parametreler
	 * ve dönüş tipi) belirtir, içerisinde kod bulunmaz. Soyut metotlar, alt
	 * sınıfların bu metotları ezerek (override) kendi ihtiyaçlarına uygun şekilde
	 * uygulamalarını sağlar.
	 * 
	 */

	public static void main(String[] args) {

		Sekil dikdortgen = new Dikdortgen(5, 3);
		System.out.println("Dikdörtgen Alanı: " + dikdortgen.alanHesapla()); // Alan hesaplanır
		dikdortgen.bilgiGoster(); // "Bu bir şekildir." çıktısı

	}

}
