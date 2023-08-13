package com.ugur.Encapsulation3;

public class Kisi {

	/**
	 * Bu örnekte, Kisi sınıfının ad ve yas özelliklerine erişimi kontrol etmek için
	 * getter ve setter metodları tanımlanmıştır. setYas metodunda yaşın negatif
	 * değer almasını engellemek için bir doğrulama yapılmıştır.
	 */

	private String ad;
	private int yas;

	public Kisi(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
	}

	// Getter metodları
	public String getAd() {
		return ad;
	}

	public int getYas() {
		return yas;
	}

	// Setter metodları
	public void setAd(String ad) {
		this.ad = ad;
	}

	public void setYas(int yas) {
		if (yas >= 0) {
			this.yas = yas;
		} else {
			System.out.println("Yas negatif olamaz.");
		}
	}

	public void bilgiGoster() {
		System.out.println("Ad: " + ad);
		System.out.println("Yas: " + yas);
	}

}
