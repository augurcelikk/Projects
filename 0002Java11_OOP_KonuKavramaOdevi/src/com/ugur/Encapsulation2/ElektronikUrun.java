package com.ugur.Encapsulation2;

public class ElektronikUrun extends Urun {

	private int garantiSuresi;

	public ElektronikUrun(String urunAdi, double fiyat, String uretimYeri, int garantiSuresi) {
		super(urunAdi, fiyat, uretimYeri);
		this.garantiSuresi = garantiSuresi;
	}

	public void garantiSuresiGoster() {
		System.out.println("Garanti Süresi: " + garantiSuresi + " ay");
	}

}
