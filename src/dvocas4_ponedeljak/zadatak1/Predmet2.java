package dvocas4_ponedeljak.zadatak1;

public class Predmet2 {

	String naziv;

	int[] ocene;
	int brojac = 0;

	Predmet2(String naziv, int brojOcena) {
		this.naziv = naziv;

		if (brojOcena > 0)
			ocene = new int[brojOcena];
		else
			ocene = new int[100];
	}

	Predmet2(String naziv) {
		this.naziv = naziv;
		ocene = new int[100];
	}

	void ispisi() {
		System.out.println("Naziv: " + naziv);

		for(int i=0; i<brojac; i++)
			System.out.println( ocene[i] );
		 

		/*for (int broj : ocene)
			System.out.println(broj);*/

	}

	void unesiOcenu(int novaOcena) {
		if (novaOcena < 5 || novaOcena > 10) {
			System.out.println("Greska, ocena mora da bude u rasponu 1 do 5");
		} else 
			if (brojac < ocene.length) {
				ocene[brojac]= novaOcena;
				brojac++;
			}
			else
				System.out.println("Greska, niz je pun");
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
		
		for(int i = 1; i<brojac;i++)
			if (ocene[i]>max)
				max = ocene[i];
		
		System.out.println(max);
	}
	
	void izracunajProlaznost() {
		int brojPolozili = 0;
		
		for(int ocena: ocene) {
			if (ocena > 5)
				brojPolozili++;
		}
		
		System.out.println( (100.0*brojPolozili)/brojac );
	}
	
}
