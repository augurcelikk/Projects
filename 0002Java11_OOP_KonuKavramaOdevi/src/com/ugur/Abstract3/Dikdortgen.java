package com.ugur.Abstract3;

class Dikdortgen extends Sekil {

	private double en;
	private double boy;

	public Dikdortgen(double en, double boy) {
		this.en = en;
		this.boy = boy;
	}

	@Override
	double alanHesapla() {

		return en * boy;
	}

}
