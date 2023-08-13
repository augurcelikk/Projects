package com.ugur.Constructor2;

public class Runner {

	/**
	 * 
	 * Bu örnekte, Ogrenci sınıfında üç farklı constructor tanımlanmıştır. İlk
	 * constructor parametre almayan bir constructor olarak varsayılan değerlerle
	 * öğrenci oluştururken, diğer constructorlar farklı parametre tipleriyle
	 * çalışır. Bu sayede, farklı parametre kombinasyonlarıyla öğrenci nesneleri
	 * oluşturulabilir.Main sınıfında farklı constructorları kullanarak öğrenci
	 * nesneleri oluşturulmuş ve tanit metoduyla bilgiler ekrana yazdırılmıştır. Bu
	 * şekilde, aşırı yüklenmiş constructorlar sayesinde farklı öğrenci bilgilerini
	 * kolayca kullanabilirsiniz.
	 */

	public static void main(String[] args) {

		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.tanit();

		Ogrenci ogrenci2 = new Ogrenci("Ahmet");
		ogrenci2.tanit();

		Ogrenci ogrenci3 = new Ogrenci("Mehmet", 20);
		ogrenci3.tanit();
	}

}
