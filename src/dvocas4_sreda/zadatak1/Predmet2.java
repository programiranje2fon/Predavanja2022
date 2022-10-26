package dvocas4_sreda.zadatak1;

public class Predmet2 {
	String naziv;
	int[] ocene;
	int brojac;
	
	Predmet2(String naziv, int brojStudenata) {
		this.naziv = naziv;
		if (brojStudenata > 0) {
			ocene = new int[brojStudenata];
		} else {
			ocene = new int[100];
		}
	}
	
	Predmet2(String naziv) {
		this.naziv = naziv;
		ocene = new int[100];
	}
	
	void ispisi() {
		System.out.println("Naziv predmeta: "+naziv);
		for(int i = 0 ; i<brojac; i++) {
			System.out.println(ocene[i]);
		}
	}
	
	void unesiOcenu(int ocena) {
		if (ocena < 5 || ocena > 10) {
			System.out.println("Greska: Ocena mora biti u intervalu od 5 do 10");
			return;
		}
		
		for(int i=0; i<ocene.length; i++) {
			if (ocene[i]==0) { // da li je i-ti element slobodan odnosno ima vrednost 0
				ocene[i] = ocena;
				brojac++;
				return;
			}
		}
		
		System.out.println("Greska: nema slobodnih mesta za unos ocene!");
	}
	
	
	double izracunajProsek() {
		double prosek = 0;
		
		for(int ocena : ocene) {
			if (ocena != 0) {
				prosek = prosek + ocena;
			}
		}
		
		prosek = prosek / brojac;
		return prosek;
	}
	
	int pronadjiNajvisuOcenu() {
		int najvisaOcena = 0;
		
		for(int i=0; i< brojac; i++) {
			if (ocene[i] > najvisaOcena) {
				najvisaOcena = ocene[i];
			}
		}
		
		return najvisaOcena;
	}
	
	double izracunajProlaznost() {
		int brojOcena = 0;
		int polozilo = 0;
		
		for(int ocena : ocene) {
			if (ocena > 0) {
				brojOcena++;
			}
			
			if (ocena>5) {
				polozilo++;
			}
		}
		
		double prolaznost = polozilo / (double)brojOcena;
		
		return prolaznost;
	}
	
	
	
	
}
