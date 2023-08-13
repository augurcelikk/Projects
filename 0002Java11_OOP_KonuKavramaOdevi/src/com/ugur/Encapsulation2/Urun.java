package com.ugur.Encapsulation2;

public class Urun {

	private String urunAdi;
	public double fiyat;

	protected String uretimYeri;

	public Urun(String urunAdi, double fiyat, String uretimYeri) {
		this.urunAdi = urunAdi;
		this.fiyat = fiyat;
		this.uretimYeri = uretimYeri;
	}

	private void urunBilgisiGoster() {
		System.out.println("Ürün Adı: " + urunAdi);
		System.out.println("Fiyat: " + fiyat);
		System.out.println("Üretim Yeri: " + uretimYeri);
	}

	public void fiyatGoster() {
		System.out.println("Ürün Fiyatı: " + fiyat);
	}

	protected void uretimYeriGoster() {
		System.out.println("Üretim Yeri: " + uretimYeri);
	}

}
