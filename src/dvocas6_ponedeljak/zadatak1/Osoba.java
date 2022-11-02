package dvocas6_ponedeljak.zadatak1;

import java.util.Objects;

public class Osoba {
	private String ime = "nepoznato";
	private String prezime = "nepoznato";
	protected String adresa = "nepoznato";
	
	public Osoba() {
		
	}
	
	public Osoba(String ime, String prezime, String adresa) {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
	}

	public void postaviIme(String ime) {
		// ime != "" ovo nije dobro 
		// !ime.equals("")
		ime = ime.trim(); // " ime " trimovan je: "ime"
		if (ime != null && !ime.isEmpty() && !ime.isBlank()) {
			this.ime = ime;
		} else {
			System.out.println("Greska: Ime ne sme biti null ili prazan string!");
		}
	}
	
	public void postaviPrezime(String prezime) {
		prezime = prezime.trim(); 
		if (prezime != null && !prezime.isEmpty() && !prezime.isBlank()) {
			this.prezime = prezime;
		} else {
			System.out.println("Greska: Prezime ne sme biti null ili prazan string!");
		}
	}
	
	public void postaviAdresu(String adresa) {
		adresa = adresa.trim(); 
		if (adresa != null && !adresa.isEmpty() && !adresa.isBlank()) {
			this.adresa = adresa;
		} else {
			System.out.println("Greska: Adresa ne sme biti null ili prazan string!");
		}
	}	
	
	public String vratiIme() {
		return ime;
	}
	
	public String vratiPrezime() {
		return prezime;
	}
	
	public String vratiAdresu() {
		return adresa;
	}
	
	
	public void ispisi() {
		System.out.println("Podaci o osobi");
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Adresa: "+adresa);
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(adresa, ime, prezime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba drugaOsoba = (Osoba) obj;
		return adresa.equals(drugaOsoba.adresa) && ime.equals(drugaOsoba.ime)
				&& prezime.equals(drugaOsoba.prezime);
	}
	
	
	
	
	
	
}
