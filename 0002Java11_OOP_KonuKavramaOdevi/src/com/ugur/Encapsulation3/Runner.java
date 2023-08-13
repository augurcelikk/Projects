package com.ugur.Encapsulation3;

public class Runner {

	/**
	 * Getter ve setter metodları, sınıf içinde özelliklere (fields veya
	 * değişkenlere) erişimi kontrol etmek ve bu özelliklerin değerlerini okumak
	 * (get) veya değiştirmek (set) için kullanılırlar. Bu yöntem, kapsülleme
	 * prensibini uygulayarak verilere kontrollü erişim sağlar.
	 * 
	 * Getter ve setter metodlarının amacı:
	 * 
	 * Getter metodları, bir özelliğin değerini döndürerek dışarıdan okunmasını
	 * sağlar. Setter metodları, bir özelliğin değerini dışarıdan değiştirilmesine
	 * izin verirken, bu işlemi kontrollü bir şekilde gerçekleştirir. Yani, gerekli
	 * doğrulamaları yapabilir veya geçerli değer aralıklarını sağlayabilir.
	 */

	public static void main(String[] args) {

		Kisi kisi = new Kisi("Ahmet", 25);

		kisi.bilgiGoster();

		kisi.setAd("Mehmet");
		kisi.setYas(30);

		kisi.bilgiGoster();
	}

}
/**
 * Bu örnekte, Kisi sınıfının getter ve setter metodlarıyla ad ve yas
 * özelliklerine erişilip değerleri okunmuş ve değiştirilmiştir. Setter
 * metodları sayesinde yaşın negatif değer alması engellenmiştir. Bu şekilde,
 * veri bütünlüğü sağlanmış ve kontrollü bir erişim elde edilmiştir.
 * 
 */
