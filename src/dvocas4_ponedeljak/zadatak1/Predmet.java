package dvocas4_ponedeljak.zadatak1;

public class Predmet {

	String naziv;

	int[] ocene;

	Predmet(String naziv, int brojOcena) {
		this.naziv = naziv;

		if (brojOcena > 0)
			ocene = new int[brojOcena];
		else
			ocene = new int[100];
	}

	Predmet(String naziv) {
		this.naziv = naziv;
		ocene = new int[100];
	}

	void ispisi() {
		System.out.println("Naziv: " + naziv);

		/*
		 * for(int i=0; i<ocene.length; i++) System.out.println( ocene[i] );
		 */

		for (int broj : ocene)
			System.out.println(broj);

	}

	void unesiOcenu(int novaOcena) {
		if (novaOcena < 5 || novaOcena > 10) {
			System.out.println("Greska, ocena mora da bude u rasponu 1 do 5");
		} else {
			boolean unet = false;
			for (int i = 0; i < ocene.length; i++) {
				if (ocene[i] == 0) {
					ocene[i] = novaOcena;
					unet = true;
					break;
				}
			}

			if (unet == false)
				System.out.println("Greska, niz je pun");
		}
	}

	double izracunajProsek() {
		int suma = 0;
		int brojPolozili = 0;
		
		for(int ocena: ocene)
			if (ocena > 5) {
				suma = suma + ocena;
				brojPolozili++;
			}
		
		return (double)(suma)/brojPolozili;
	}
	
	void pronadjiNajvisuOcenu() {
		int max = ocene[0];
		
		for(int i = 1; i<ocene.length;i++)
			if (ocene[i]>0 && ocene[i]>max)
				max = ocene[i];
		
		System.out.println(max);
	}
	
	void izracunajProlaznost() {
		int brojPolozili = 0;
		int brojPolagali = 0;
		
		for(int ocena: ocene) {
			if (ocena > 5)
				brojPolozili++;
			
			if (ocena > 0)
				brojPolagali++;
		}
		
		System.out.println( (100.0*brojPolozili)/brojPolagali );
	}
	
}
