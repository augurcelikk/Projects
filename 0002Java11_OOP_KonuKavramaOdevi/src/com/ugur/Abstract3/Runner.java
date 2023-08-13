package com.ugur.Abstract3;

public class Runner {

	/**
	 * Soyut sınıflar ve arayüzler (interfaces), nesne yönelimli programlamada
	 * farklı amaçlar ve kullanımlar için kullanılan iki farklı yapıdır. Her ikisi
	 * de çok biçimlilik ve kod paylaşımını sağlama amacını taşırken, farklı
	 * senaryolarda kullanılırlar.
	 * 
	 * 
	 * Soyut Sınıflar:
	 * 
	 * Soyut sınıflar, hem soyut metotlar hem de somut (gerçek) metotlar içerebilir.
	 * Yani, içlerinde implementasyonlu metotlar da bulunabilir. Soyut sınıflar, alt
	 * sınıfların kalıtım alabileceği bir temel sınıf oluşturmak amacıyla
	 * kullanılır. Ortak davranışları paylaşan sınıfları gruplamak için idealdir.
	 * Bir sınıf sadece bir soyut sınıftan kalıtım alabilir. Abstract anahtar
	 * kelimesi kullanılarak tanımlanırlar.
	 */

	public static void main(String[] args) {

		Sekil dikdortgen = new Dikdortgen(5, 3);
		System.out.println("Dikdörtgen Alanı: " + dikdortgen.alanHesapla()); // Alan hesaplanır
		dikdortgen.bilgiGoster(); // "Bu bir şekildir." çıktısı

	}

	/**
	 * Bu örnekte, Sekil sınıfı soyut bir sınıftır ve içinde alanHesapla adında
	 * soyut bir metot tanımlanmıştır. Dikdortgen sınıfı Sekil sınıfını kalıtım
	 * alarak soyut metodu implemente eder. Main sınıfında, bir Dikdortgen örneği
	 * oluşturulur ve alanHesapla metodu çağrılarak alan hesaplaması yapılır.
	 */

}
