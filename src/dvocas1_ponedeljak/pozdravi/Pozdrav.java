package dvocas1_ponedeljak.pozdravi;

/**
 * Primer Java programa:
 * 	Definicija klase i main metode 
 * 	Ispisivanje na ekranu
 * 	Osnovni Java tipovi
 *  Nadovezivanje nizova znakova (stringova)
 */
public class Pozdrav {

	// izvrsavanje programa pocinje od main metode koaj mora biti tacno ovako definisana
	public static void main(String[] args) {
		
		// ispisivanje poruke na ekranu - iza // se pise komentar u jednoj liniji
		System.out.println("Zdravo svima iz Java-e!");
		
		// deklaracija promenljivih: <tip> <nazivPromenljive> = <pocetna vrednost>; 
		int ceo_broj = 100; // int je tip za cele brojeve
		double decimalni_broj = 12.456; // double je tip za decimalne brojeve
		boolean semafor = false; // boolean je logicki tip tacno/netacno		 
		String poruka = "Evo par brojeva:"; // String je niz znakova i u Javi je klasa
		
		System.out.println(poruka);
		System.out.println("Ceo broj: "+ceo_broj+ " Decimalni broj: "+decimalni_broj);
		System.out.println("Decimalni broj: "+decimalni_broj);			
	}
	
}
