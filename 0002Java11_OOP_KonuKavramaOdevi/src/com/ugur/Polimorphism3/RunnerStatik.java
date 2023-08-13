package com.ugur.Polimorphism3;

public class RunnerStatik {

	/**
	 * Dinamik çok biçimlilik (dynamic polymorphism) ve statik çok biçimlilik
	 * (static polymorphism), nesne yönelimli programlamada kullanılan iki farklı
	 * çok biçimlilik türüdür. Her ikisi de aynı isimli metotların farklı şekillerde
	 * çalıştırılmasını sağlar, ancak farklı şekillerde uygulanırlar.
	 * 
	 * 
	 */

	/**
	 * Statik Çok Biçimlilik (Compile-time Polymorphism): Statik çok biçimlilik,
	 * metot aşırı yüklemesi (method overloading) yoluyla sağlanır. Aynı sınıf
	 * içinde veya farklı parametre listeleriyle aynı isimli metotlar tanımlanır.
	 * Hangi metotun çağrılacağı, metot çağrısının derleme anında (compile-time)
	 * çözümlenmesiyle belirlenir.
	 * 
	 */

	public static void main(String[] args) {
		Hesaplayici hesaplayici = new Hesaplayici();
		int sonuc1 = hesaplayici.topla(5, 10); // int topla metodu çağrılır
		double sonuc2 = hesaplayici.topla(3.5, 2.0); // double topla metodu çağrılır

		System.out.println("sonuc 1 : " + sonuc1);
		System.out.println("sonuc 2 : " + sonuc2);
	}

}
