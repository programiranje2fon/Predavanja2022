package dvocas7_ponedeljak.zadatak2;

import dvocas7_ponedeljak.zadatak1.Artikal;

public class PrimerKataloga {

	public static void main(String[] args) {
		KatalogArtikala katalog = new KatalogArtikala(5);
		
		// kreiranje novog artikla
		Artikal artikal = new Artikal("Cokolada", 200, 20);
		// dodavanje artikla u katalog
		katalog.dodajArtikal(artikal);
		
		katalog.dodajArtikal(new Artikal("Smoki", 100, 10));
		katalog.dodajArtikal(new Artikal("Koka kola", 90, 10));
		katalog.dodajArtikal(new Artikal("Sok", 129, 15));
		katalog.prikazi();
		System.out.println("----------------------------------");
		//katalog.izbaciArtikal(3);
		katalog.prikazi();
		System.out.println("----------------------------------");
		//katalog.izbaciArtikal(4);
		katalog.prikazi();		
		System.out.println("----------------------------------");
		System.out.println(katalog.pronadji(2));
		System.out.println("----------------------------------");
		System.out.println(katalog.pronadji("cokolada"));		
		System.out.println("----------------------------------");
		
		System.out.println(katalog);
	}

}
