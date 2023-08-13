package com.ugur.Inheritance2;

public class ElektrikliAraba extends Araba implements IElektrikli {

	int bataryaKapasitesi;

	public ElektrikliAraba(String marka, String model, int bataryaKapasitesi) {
		super(marka, model);
		this.bataryaKapasitesi = bataryaKapasitesi;
	}

	public void sarjEt() {
		System.out.println("Araba şarj ediliyor.");
	}

	/**
	 * CEVAP 3 :
	 * 
	 * Yukarıdaki örnekte, ElektrikliAraba sınıfının constructor'ında super(marka,
	 * model) ifadesi kullanılarak, alt sınıfın üst sınıfın constructor'ını
	 * çağırıyoruz. Bu şekilde, Araba sınıfının constructor'ı çalışarak marka ve
	 * model özelliklerini ayarlamış oluruz. Bu işlem alt sınıfın üst sınıfın
	 * özelliklerini başlangıçta inşa etmesine yardımcı olur.
	 */

}
