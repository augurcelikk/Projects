package com.ugur.Encapsulation2;

public class Runner {
	/**
	 * Erişim kontrolü için kullanılan anahtar kelimeler "private", "public" ve
	 * "protected" olarak üçe ayrılır. Bu anahtar kelimeler, sınıf üyelerine
	 * (örneğin, değişkenler ve metotlar) erişim düzeyini belirtirler.
	 * 
	 * private: Bu anahtar kelime ile belirtilen üyeler, sadece aynı sınıf içinden
	 * erişilebilirler. Diğer sınıflardan ve paketlerden erişim engellenir.
	 * 
	 * public: Bu anahtar kelime ile belirtilen üyeler, her yerden (sınıfın içi,
	 * diğer sınıflar ve paketler) erişilebilirler. En geniş erişim düzeyidir.
	 * 
	 * protected: Bu anahtar kelime ile belirtilen üyeler, aynı paketten veya alt
	 * sınıflardan erişilebilirler. Farklı paketlerden gelen sınıfların ise yalnızca
	 * alt sınıfları üzerinden erişimi mümkündür.
	 * 
	 */

	public static void main(String[] args) {

		ElektronikUrun laptop = new ElektronikUrun("Dell Laptop", 5000, "Çin", 24);

		laptop.fiyatGoster(); // Doğru: fiyatGoster public metodu
		laptop.uretimYeriGoster(); // Doğru: uretimYeriGoster protected metodu
		laptop.garantiSuresiGoster(); // Doğru: sınıfın kendi metodu
		// laptop.urunBilgisiGoster();//cagirilamiyor; cunku Urun sınıfında bu method
		// private olarak tanımlı.
	}

	/**
	 * Bu örnekte, Urun sınıfında farklı erişim düzeylerine sahip üyeler
	 * tanımlanmıştır. Ardından ElektronikUrun sınıfı, Urun sınıfını kalıtım alarak
	 * oluşturulmuştur. ElektronikUrun sınıfının main metodu, farklı erişim
	 * düzeylerine sahip üyeleri nasıl kullanabileceğimizi göstermektedir:
	 * 
	 * fiyatGoster() metodu public olduğu için her yerden erişilebilir.
	 * uretimYeriGoster() metodu protected olduğu için alt sınıf olan ElektronikUrun
	 * içinden erişilebilir. garantiSuresiGoster() metodu ElektronikUrun sınıfının
	 * kendi metodu olduğu için erişimi herhangi bir sorun teşkil etmez. Bu örnekte,
	 * farklı erişim düzeylerinin nasıl kullanılabileceği ve hangi sınıflardan
	 * erişilebileceği açıkça görülmektedir.
	 */
}
