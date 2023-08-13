package com.ugur.Abstract2;

public class Runner {

	/**
	 * Bir sınıfın içinde soyut bir metod (abstract method) bulunduğunda, o sınıfın
	 * soyut (abstract) olarak tanımlanması gerekmektedir. Bunun temel sebepleri
	 * nesne yönelimli programlamanın prensipleri ve mantığıyla ilgilidir:
	 * 
	 * Tamamlanmamış Metotlar: Soyut metotlar, sadece metot imzasını (ad,
	 * parametreler, dönüş tipi) belirtirken içerisinde herhangi bir kod veya
	 * uygulama içeriği bulunmaz. Dolayısıyla, soyut bir sınıfın somut (gerçek) bir
	 * örneği oluşturulamaz. Eğer bir sınıf içinde soyut metot bulunuyorsa, bu
	 * sınıfın da soyut olarak tanımlanması mantıklıdır çünkü bu sınıfın tam
	 * anlamıyla uygulanabilir bir durumu yoktur.
	 * 
	 * Zorunlu Uygulama: Soyut bir sınıf içindeki soyut metotlar, alt sınıflar
	 * tarafından uygulanmak zorundadır. Alt sınıflar, soyut metotları override
	 * (ezme) yoluyla kendi ihtiyaçlarına uygun şekilde gerçekleştirmek zorundadır.
	 * Eğer üst sınıf soyut olarak tanımlanmazsa, alt sınıfların bu metotları
	 * override etme zorunluluğu ortadan kalkar ve istenilen davranışın sağlanması
	 * mümkün olmaz.
	 * 
	 * Davranışı Tanımlama: Soyut sınıflar, alt sınıflar arasında belirli bir arayüz
	 * ve davranışı paylaşmayı sağlar. Soyut metotlar, alt sınıfların bu davranışı
	 * belirli bir şekilde gerçekleştirmesini sağlar. Dolayısıyla, soyut sınıfın da
	 * soyut olarak tanımlanması, bu ortak davranışın daha genel bir kavramsal
	 * yapıya sahip olduğunu belirtir.
	 * 
	 * Sonuç olarak, bir sınıf içinde soyut bir metot bulunduğunda, bu sınıfın da
	 * soyut olarak tanımlanması gereklidir çünkü soyut metotlar, sınıfın
	 * uygulanabilir bir durumu olmadığını ve alt sınıflar tarafından uygulama
	 * gerektiğini ifade eder. Bu sayede, kodun daha modüler, esnek ve anlamlı bir
	 * şekilde tasarlanması sağlanır.
	 * 
	 */

	public static void main(String[] args) {

	}

}
