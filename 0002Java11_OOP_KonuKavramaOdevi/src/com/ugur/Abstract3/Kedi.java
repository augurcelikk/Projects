package com.ugur.Abstract3;

public class Kedi implements ISesCikarabilir {

	@Override
	public void sesCikar() {

		System.out.println("Miyav!");

	}
	/**
	 * Özetle, soyut sınıflar ve arayüzler farklı senaryolarda kullanılırlar. Soyut
	 * sınıflar, somut ve soyut metotları içerebilirken, arayüzler sadece soyut
	 * metotları içerir. Soyut sınıflar alt sınıfların kalıtım alabileceği bir temel
	 * sınıf oluşturmak için kullanılırken, arayüzler farklı sınıflar arasında
	 * davranış paylaşımı sağlamak için kullanılır.
	 */

}
