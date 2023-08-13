package com.ugur.Polimorphism;

public class Runner {
	/**
	 * Çok biçimlilik (polimorphism), nesne yönelimli programlamada önemli bir
	 * kavramdır ve farklı sınıfların aynı arayüzü veya üst sınıfı paylaşarak aynı
	 * isimli metotları farklı şekillerde uygulamasını ifade eder. Bu sayede farklı
	 * sınıflar aynı isimli metodu farklı amaçlar için kullanabilir ve
	 * çağrıldıklarında kendi özgün davranışlarını sergileyebilirler.
	 * 
	 * Java'da çok biçimlilik, kalıtım (inheritance) ve arayüzler (interfaces) ile
	 * gerçekleştirilir.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Inek inek = new Inek();
		Keci keci = new Keci();// bu da olur ama kendi içinde nesne türetmiş olduk.

		Hayvan inek1 = new Inek();// doğrusu bu. Polimorfizm oldugunu gösteriyor, daha genel.

		inek.sesCikar();
		keci.sesCikar();
		inek1.sesCikar();
	}

	/**
	 * Bu örnekte, Hayvan sınıfının sesCikar metodu farklı alt sınıflar olan Inek ve
	 * Keci sınıflarında ezilerek (override) farklı davranışlar kazandırıldı. Main
	 * sınıfında, inek ve keci referansları farklı alt sınıfları temsil ediyor.
	 * Ancak, aynı metodun çağrılması her iki sınıfta da farklı davranışları ortaya
	 * çıkarıyor. Bu, çok biçimliliğin basit bir örneğidir: aynı metodun farklı
	 * sınıflar tarafından farklı şekillerde uygulandığı durum.
	 */

}
