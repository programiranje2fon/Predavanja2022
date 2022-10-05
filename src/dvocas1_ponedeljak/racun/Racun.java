package dvocas1_ponedeljak.racun;

/**
 * Primer klase koju programer definise.
 * class <NazivKlase> {
 * 
 * } 
 */
public class Racun {
	static int brojRacuna = 0; 	// staticki atribut  - zajednicki za sve objekte ove klase

	String imeArtikla1; // atribut - promenljiva pridruzena klasi
	double cena1;
	int kolicina1;
	
	String imeArtikla2;
	double cena2;
	int kolicina2;
	
	String datum;
	String prodavnica;
	String qrKod;
	
	/**
	 * Konstruktor - specijalni metod koji se poziva prilikom kreiranja 
	 * objekta i vrsi pocetnu inmicijalizaciju objekta.
	 */
	Racun() {
		brojRacuna++;
	}
	
	
	/**
	 * Metoda koja izracunava i vraca ukupan iznos racuna
	 * @return ukupan iznos racuna
	 */
	double izracunajUkupniIznos() {
		double iznos = cena1*kolicina1 + cena2*kolicina2;
		return iznos;
	}
	
	/**
	 * Metoda koja ispisuje na ekranu sve podatke o ovom racunu
	 */
	void prikazi() {
		System.out.println("Racun br: "+brojRacuna);
		System.out.println(imeArtikla1 + " Cena: "+cena1 + " Kol: "+kolicina1);
		System.out.println(imeArtikla2 + " Cena: "+cena2 + " Kol: "+kolicina2);
		System.out.println("Iznos:" + izracunajUkupniIznos());
		System.out.println("PDV:" + izracunajPDV());
		System.out.println("-------------------------------------------------------");
		
	}
	
	/**
	 * Metoda koja izracunava i vraca PDV za ovaj racun.
	 * @return porez (PDV) na ukupan izos ovog racuna
	 */
	double izracunajPDV() {
		double pdv = izracunajUkupniIznos()*0.2;
		return pdv;
	}
	
	
}
