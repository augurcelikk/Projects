package com.ugur.Polimorphism3;

public class RunnerDinamik {

	public static void main(String[] args) {

		Hayvan kurbaga = new Kurbaga();
		Hayvan yilan = new Yilan();

		kurbaga.sesCikar();
		yilan.sesCikar();

		/**
		 * Bu örnekte, Hayvan sınıfının sesCikar metodu dinamik olarak çağrılır. Çünkü
		 * bu metot Yilan ve Kurbaga sınıfları tarafından override edilmiştir ve hangi
		 * sınıfın örneğinin çağrıldığına bağlı olarak metotun davranışı belirlenir.
		 */
	}

}
