package com.ugur.Inheritance2;

public class Runner {

	/**
	 * CEVAP 2: Java, çoklu kalıtımı sınıf düzeyinde desteklememektedir. Bu karar,
	 * programlama dilinin karmaşıklığını azaltmak ve çelişkileri önlemek amacıyla
	 * alınmıştır. Çoklu kalıtım, bir sınıfın birden fazla üst sınıftan özellikler
	 * ve davranışlar miras almasını içerir ve bu durumda farklı üst sınıflar
	 * arasında potansiyel çakışmalar ve belirsizlikler ortaya çıkabilir.
	 */

	public static void main(String[] args) {

		ElektrikliAraba elektrikliAraba = new ElektrikliAraba("Tesla", "Model S", 100);

		System.out.println("Marka: " + elektrikliAraba.marka);
		System.out.println("Model: " + elektrikliAraba.model);
		System.out.println("Batarya Kapasitesi: " + elektrikliAraba.bataryaKapasitesi);

		elektrikliAraba.calistir(); // Araba sınıfından miras alınan metot
		elektrikliAraba.sarjEt(); // Elektrikli araba arayüzünden gelen metot

		/**
		 * Bu örnekte, ElektrikliAraba sınıfı hem Araba sınıfından gelen özellikleri ve
		 * metotları hem de Elektrikli arayüzünden gelen özellikleri taşıyor. Böylece,
		 * çoklu kalıtımın getirdiği belirsizlikleri engellemiş oluyoruz ve arayüzler
		 * aracılığıyla bu tür senaryoları çözebiliyoruz.
		 * 
		 */
	}

}
