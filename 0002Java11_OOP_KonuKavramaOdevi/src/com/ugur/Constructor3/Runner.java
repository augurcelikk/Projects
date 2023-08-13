package com.ugur.Constructor3;

public class Runner {
	/**
	 * Copy constructor, bir sınıfın varolan bir nesnesini, aynı sınıfın başka bir
	 * nesnesine kopyalamak için kullanılan bir constructor türüdür. Copy
	 * constructor, genellikle bir nesnenin kopyasını oluştururken aynı sınıfın
	 * constructorlarından yararlanır. Bu sayede nesnenin özellikleri ve durumu
	 * korunur.
	 * 
	 */

	public static void main(String[] args) {

		Ogrenci ogrenci1 = new Ogrenci("Ahmet", 20);
		ogrenci1.tanit();

		// Copy constructor kullanarak yeni nesne oluşturma
		Ogrenci ogrenci2 = new Ogrenci(ogrenci1);

		System.out.println("Ogrenci 1 den kopyalanan: ");
		ogrenci2.tanit();
	}

}
