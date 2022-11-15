package dvocas7_ponedeljak.zadatak2;

import java.util.Arrays;

import dvocas7_ponedeljak.zadatak1.Artikal;

public class KatalogArtikala {
	// niz artikala
	private int sledecaSifra = 0;
	private Artikal[] artikli;
	
	public KatalogArtikala(int brojArtikala) {
		artikli = new Artikal[brojArtikala]; // kreiranje niza
	}
	
	public void dodajArtikal(Artikal artikal) {
		if (artikal == null) {
			System.out.println("Greska: ne moze se ubaciti null artikal!");
			return;
		}

		for(int i=0; i<artikli.length; i++) {
			if (artikli[i]==null) {
				artikli[i] = artikal;
				sledecaSifra = sledecaSifra + 1;
				artikal.setSifra(sledecaSifra);
				return;
			}
		}
		
		System.out.println("Niz je pun!");
	}
	
	public void dodajArtikal(String naziv, double jedinicnaCena, int kolicina) {
		Artikal noviArtikal = new Artikal(naziv, jedinicnaCena, kolicina);
		dodajArtikal(noviArtikal);
	}
	
	public void prikazi() {
		for(Artikal art : artikli) {
			if (art!=null)
				System.out.println(art);
		}
	}
	
	public void izbaciArtikal(int sifra) {
		for(int i=0; i<artikli.length; i++) {
			if (artikli[i]==null) continue;
			
			if (artikli[i].getSifra() == sifra) {
				artikli[i] = null;
				return;
			}
		}
	}
	
	public Artikal pronadji(int sifra) {
		for(Artikal art : artikli) {
			if (art==null) continue;
			
			if (art.getSifra() == sifra) {
				return art;
			}			
		}
		
		return null;
	}
	
	public Artikal pronadji(String kljucnaRec) {
		for(Artikal art : artikli) {
			if (art==null) continue;
			
			if (art.getNaziv().toLowerCase().contains(kljucnaRec.toLowerCase())) {
				return art;
			}			
		}
		
		return null;
	}

	@Override
	public String toString() {
		//return "KatalogArtikala [sledecaSifra=" + sledecaSifra + ", artikli=" + Arrays.toString(artikli) + "]";
		StringBuilder sb = new StringBuilder();
		
		sb.append("Katalog artikala").append(System.lineSeparator());
		for(Artikal art : artikli) {
			if (art==null) continue;
			sb.append(art.toString()).append("\n");
		}
	
		return sb.toString();
	}	
	
	
	
	
}
