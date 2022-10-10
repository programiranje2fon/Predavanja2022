package dvocas2_ponedeljak;

/**
 * Primer klase koju programer definise.
 * class <NazivKlase> {
 * 
 * } 
 */
public class Racun {
	static int brojRacuna = 0; 	// staticki atribut  - zajednicki za sve objekte ove klase

	Artikal artikal1, artikal2, artikal3;
	
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
		double iznos = artikal1.cena*artikal1.kolicina +
					artikal2.cena*artikal2.kolicina +
					artikal3.cena*artikal3.kolicina;
		return iznos;
	}
	
	/**
	 * Metoda koja ispisuje na ekranu sve podatke o ovom racunu
	 */
	void prikazi() {
		System.out.println("Racun br: "+brojRacuna);
		
		for(int i=1; i<=3; i++) {
			if (i==1)
				System.out.println("Ime artikla1: " +artikal1.ime + " Cena: "+ artikal1.cena + " Kol: "+ artikal1.kolicina + " Vrsta: "+artikal1.vrsta );
			
			if (i==2)			
				System.out.println("Ime artikla2: " +artikal2.ime + " Cena: "+ artikal2.cena + " Kol: "+ artikal2.kolicina + " Vrsta: "+artikal2.vrsta);

			if (i==3)			
				System.out.println("Ime artikla3: " +artikal3.ime + " Cena: "+ artikal3.cena + " Kol: "+ artikal3.kolicina + " Vrsta: "+artikal3.vrsta);
		}
		
		System.out.println("Iznos:" + izracunajUkupniIznos());
		System.out.println("PDV:" + izracunajPDV());
		System.out.println("-------------------------------------------------------");
		
	}
	
	/**
	 * Metoda koja izracunava i vraca PDV za ovaj racun.
	 * @return porez (PDV) na ukupan izos ovog racuna
	 */
	double izracunajPDV() {
		double pdv = artikal1.izracunajPorez() + artikal2.izracunajPorez() + artikal3.izracunajPorez();
		return pdv;
	}
	
	
}
