package dvocas10_ponedeljak.zadatak1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imenik {
	private List<Osoba> osobe = new ArrayList<>();
	
	public void ucitajOsobu() {
		Osoba osoba = new Osoba();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Unesite ime i prezime osobe:");
		String imePrezime = scanner.nextLine();
		osoba.setImePrezime(imePrezime);
		
		System.out.print("Unesite adresu:");
		String adresa = scanner.nextLine();
		osoba.setAdresa(adresa);
		
		System.out.print("Unesite telefon:");
		int telefon = scanner.nextInt();
		osoba.setTelefon(telefon);
		
		if (osobe.contains(osoba)) {
			throw new RuntimeException("Osoba se vec nalazi u listi!");
		} else {
			osobe.add(osoba);
		}
	}
	
	public void pronadjiOsobu() {
		System.out.print("Pretraga. Unesite kljucnu rec:");
		Scanner scanner = new Scanner(System.in);
		String kljucnaRec = scanner.next();
		
		for(Osoba osoba : osobe) {
			if (osoba.getImePrezime().contains(kljucnaRec)) {
				System.out.println(osoba);
			}
		}
	}
	
	public void ispisi() {
		for(Osoba osoba : osobe) {
			System.out.println(osoba);
		}
	}
	
}
