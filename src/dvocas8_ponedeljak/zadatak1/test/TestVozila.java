package dvocas8_ponedeljak.zadatak1.test;

import dvocas8_ponedeljak.zadatak1.Automobil;
import dvocas8_ponedeljak.zadatak1.Motocikl;
import dvocas8_ponedeljak.zadatak1.MotornoVozilo;

public class TestVozila {

	public static void main(String[] args) {
		MotornoVozilo vozilo = new Automobil();
		
		vozilo.setMarkaModel("Ford Focus");
		vozilo.setRegistarskaOznaka("BG123JK");
		vozilo.setKubikaza(1799);
		vozilo.setSnaga(70);
		
		System.out.println(vozilo);
		System.out.println("Cena registracije:" + vozilo.izracunajRegistraciju());

		MotornoVozilo vozilo2 = new Motocikl();
		vozilo2.setMarkaModel("Suzuki GS 750");
		vozilo2.setRegistarskaOznaka("NS987TT");
		vozilo2.setSnaga(100);
		vozilo2.setKubikaza(749);
		
		System.out.println(vozilo2);
		System.out.println("Cena registracije: "+vozilo2.izracunajRegistraciju());
		
		MotornoVozilo[] vozila = {vozilo, vozilo2};
		System.out.println("Ukupni iznos za registraciju: "+izracunajUkupnuRegistraciju(vozila));
		
	}
	
	static double izracunajUkupnuRegistraciju(MotornoVozilo[] vozila) {
		double ukupniIznos = 0;
		for(MotornoVozilo v : vozila) {
			if (v != null) {
				ukupniIznos += v.izracunajRegistraciju();
			}
		}
		return ukupniIznos;
	}

}
