package dvocas1_ponedeljak.racun;

public class Racun {
	static int brojRacuna = 0;
	String imeArtikla1; // atribut - promenljiva pridruzena klasi
	double cena1;
	int kolicina1;
	
	String imeArtikla2; // atribut - promenljiva pridruzena klasi
	double cena2;
	int kolicina2;
	
	String datum;
	String prodavnica;
	String qrKod;
	
	
	Racun() {
		brojRacuna++;
	}
	
	
	double izracunajUkupniIznos() {
		double iznos = cena1*kolicina1 + cena2*kolicina2;
		return iznos;
	}
	
	void prikazi() {
		System.out.println("Racun br: "+brojRacuna);
		System.out.println(imeArtikla1 + " Cena: "+cena1 + " Kol: "+kolicina1);
		System.out.println(imeArtikla2 + " Cena: "+cena2 + " Kol: "+kolicina2);
		System.out.println("Iznos:" + izracunajUkupniIznos());
		System.out.println("PDV:" + izracunajPDV());
		System.out.println("-------------------------------------------------------");
		
	}
	
	double izracunajPDV() {
		double pdv = izracunajUkupniIznos()*0.2;
		return pdv;
	}
	
	
}
