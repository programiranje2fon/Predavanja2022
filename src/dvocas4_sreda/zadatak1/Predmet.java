package dvocas4_sreda.zadatak1;

public class Predmet {
	String naziv;
	int[] ocene;
	
	Predmet(String naziv, int brojStudenata) {
		this.naziv = naziv;
		if (brojStudenata > 0) {
			ocene = new int[brojStudenata];
		} else {
			ocene = new int[100];
		}
	}
	
	Predmet(String naziv) {
		this.naziv = naziv;
		ocene = new int[100];
	}
	
	void ispisi() {
		System.out.println("Naziv predmeta: "+naziv);
		for(int i = 0 ; i<ocene.length; i++) {
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
				return;
			}
		}
		
		System.out.println("Greska: nema slobodnih mesta za unos ocene!");
	}
	
	
	double izracunajProsek() {
		double prosek = 0;
		int brojOcena = 0;
		
		for(int ocena : ocene) {
			if (ocena != 0) {
				prosek = prosek + ocena;
				brojOcena++;
			}
		}
		
		prosek = prosek / brojOcena;
		return prosek;
	}
	
	int pronadjiNajvisuOcenu() {
		int najvisaOcena = 0;
		
		for(int ocena : ocene) {
			if (ocena > najvisaOcena) {
				najvisaOcena = ocena;
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
