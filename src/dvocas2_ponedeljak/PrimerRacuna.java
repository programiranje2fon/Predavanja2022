package dvocas2_ponedeljak;

public class PrimerRacuna {

	public static void main(String[] args) {
		Racun mojRacun = new Racun(); // kreiranje objekta klase Racun sa new

		for (int i = 1; i <= 3; i++) {
			Artikal noviArtikal = new Artikal();
			// ucitavanje vrednosti i dodeljivanje atributima racuna
			noviArtikal.ime = Konzola.ucitajString("Unesite ime " + i + ". artikla :"); // "Plazma keks";
			noviArtikal.cena = Konzola.ucitajDecimalniBroj("Unesite cenu " + i + ". artikla:");
			noviArtikal.kolicina = Konzola.ucitajCeoBroj("Unesite kolicinu " + i + ". artikla: ");

			if (i == 1)
				mojRacun.artikal1 = noviArtikal;
			else if (i == 2)
				mojRacun.artikal2 = noviArtikal;
			else if (i == 3)
				mojRacun.artikal3 = noviArtikal;
			/*
			 * Artikal artikal2 = new Artikal(); artikal2.ime
			 * =Konzola.ucitajString("Unesite ime drugog artikla :"); artikal2.cena =
			 * Konzola.ucitajDecimalniBroj("Unesite cenu drugog artikla:");
			 * artikal2.kolicina =
			 * Konzola.ucitajCeoBroj("Unesite kolicinu drugog artikla: "); mojRacun.artikal2
			 * = artikal2;
			 * 
			 * Artikal artikal3 = new Artikal(); artikal3.ime
			 * =Konzola.ucitajString("Unesite ime treceg artikla :"); artikal3.cena =
			 * Konzola.ucitajDecimalniBroj("Unesite cenu treceg artikla:");
			 * artikal3.kolicina =
			 * Konzola.ucitajCeoBroj("Unesite kolicinu treceg artikla: "); mojRacun.artikal3
			 * = artikal3;
			 */
		}

		// prikaz racuna pomocu metode prikazi
		mojRacun.prikazi();

		// kreiranje i prikaz drugog racuna
		/*
		 * Racun mojRacun2 = new Racun(); mojRacun2.prikazi();
		 */

	}

}
