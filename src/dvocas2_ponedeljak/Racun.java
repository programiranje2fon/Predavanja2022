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
		double iznos = 0;
		if (artikal1 !=null) iznos += artikal1.izracunajIznos();
		if (artikal2 !=null) iznos += artikal2.izracunajIznos();
		if (artikal3 !=null) iznos += artikal3.izracunajIznos();		

		return iznos;
	}
	
	/**
	 * Metoda koja ispisuje na ekranu sve podatke o ovom racunu
	 */
	void prikazi() {
		System.out.println("Racun br: "+brojRacuna);
		
		for(int i=1; i<=3; i++) {
			if ((i==1) && (artikal1!=null))
				System.out.println("Ime artikla1: " +artikal1.ime + " Cena: "+ artikal1.cena + " Kol: "+ artikal1.kolicina + " Vrsta: "+artikal1.vrsta );
			
			if ((i==2) && (artikal2!=null)) 			
				System.out.println("Ime artikla2: " +artikal2.ime + " Cena: "+ artikal2.cena + " Kol: "+ artikal2.kolicina + " Vrsta: "+artikal2.vrsta);

			if ((i==3) && (artikal3!=null))
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
		double pdv = 0;
		if (artikal1 != null) pdv +=artikal1.izracunajPorez();
		if (artikal2 != null) pdv += artikal2.izracunajPorez();
		if (artikal3 != null) pdv += artikal3.izracunajPorez();
		return pdv;
	}
	
	
}
