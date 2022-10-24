package dvocas2_sreda.zadatak1;

public class TestAutomobil {

	public static void main(String[] args) {
	/*	Automobil a = new Automobil("Peugeot",
				"308", "RA-123-EE", "Pera Peric",
				1599, 70.5, VrstaGoriva.DIZEL);	*/	
		
	//	a.ispisi();
		
		//Automobil a2 = new Automobil();
		//a2.ispisi();
		
		Automobil a3 = new Automobil("Nissan",
				"Micra", 1199, 50.5, TipGoriva.BENZIN);

		//Kasnije, nakon prodaje i registracije
		a3.vlasnik = new Osoba();
		a3.vlasnik.ime = "Zika";
		a3.vlasnik.prezime = "Zikic";
		a3.vlasnik.adresa = "Jove ilica 154";
		
		a3.registarskaOznaka = "NS-567-HH";
		//KonvertorSnage.KW_KS = -5.5;
		
		a3.ispisi();
		
		
	}

}
