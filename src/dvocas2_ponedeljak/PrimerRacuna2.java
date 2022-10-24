package dvocas2_ponedeljak;

public class PrimerRacuna2 {

	public static void main(String[] args) {
		Racun mojRacun = new Racun(); // kreiranje objekta klase Racun sa new
		
		String unos="";
		int brojArtikla = 0;
		while(!unos.equals("kraj")) {
			brojArtikla++;
			unos = Konzola.ucitajString("Unesite ime " + brojArtikla + ". artikla :");
			if (!unos.equals("kraj")) {				
				Artikal noviArtikal = new Artikal();				
				noviArtikal.ime = unos; // "Plazma keks";
				noviArtikal.cena = Konzola.ucitajDecimalniBroj("Unesite cenu " + brojArtikla + ". artikla:");
				noviArtikal.kolicina = Konzola.ucitajCeoBroj("Unesite kolicinu " + brojArtikla + ". artikla: ");
	
				if (brojArtikla == 1)
					mojRacun.artikal1 = noviArtikal;
				else if (brojArtikla == 2)
					mojRacun.artikal2 = noviArtikal;
				else if (brojArtikla == 3)
					mojRacun.artikal3 = noviArtikal;
			}
		}

		// prikaz racuna pomocu metode prikazi
		mojRacun.prikazi();

	}

}
