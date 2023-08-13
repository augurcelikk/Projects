package com.ugur.Encapsulation;

public class Kullanici {

	private String kullaniciAdi;
	private String sifre;

	public Kullanici(String kullaniciAdi, String sifre) {
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	/**
	 * Bu örnekte, kullaniciAdi ve sifre özellikleri private olarak tanımlanmıştır.
	 * Bunlara erişimi kontrol eden get ve set metotları oluşturulmuştur. Bu sayede,
	 * özelliklere sadece bu metotlar aracılığıyla erişilebilir ve özelliklerin
	 * dışarıdan doğrudan değiştirilmesi engellenir. Bu da kapsüllemenin bir
	 * örneğidir.
	 */

}
