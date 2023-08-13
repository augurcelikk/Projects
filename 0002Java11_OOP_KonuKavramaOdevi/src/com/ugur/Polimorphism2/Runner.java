package com.ugur.Polimorphism2;

public class Runner {

	/**
	 * Interface'ler, belirli metotları implemente eden sınıfların oluşturulmasını
	 * sağlar. Bu, farklı sınıfların aynı metot ismini kullanarak farklı
	 * işlevselliği gerçekleştirmesini sağlar.
	 * 
	 * Bir interface tanımlamak için interface anahtar kelimesi kullanılır.
	 * Interface'ler içinde metot bildirimi bulunur, ancak bu metotlar için somut
	 * (gerçek) bir uygulama içeriği içermezler. Interface'leri uygulayan sınıflar
	 * bu metotları implemente etmek zorundadır.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		ISesCikarabilir inek = new Inek();// doğrusu bu yine. Daha genel kapsamlı ve açıklayıcı.
		Keci keci = new Keci();// bu daha kısır bir gösterim sanırım.

		keci.sesCikar();
		inek.sesCikar();

	}
}
