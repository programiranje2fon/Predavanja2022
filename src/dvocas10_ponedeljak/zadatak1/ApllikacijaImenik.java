package dvocas10_ponedeljak.zadatak1;

import java.util.Scanner;

public class ApllikacijaImenik {
		public static void main(String[] args) {
			Imenik imenik = new Imenik(); 
			Scanner scanner = new Scanner(System.in);
			int opcija;
			
			do {
				System.out.println("Unesite opciju:");
				System.out.println("1 - Unos u imenik");
				System.out.println("2 - Pretraga imenika");
				System.out.println("3 - Ispis celog imenika");
				System.out.println("4 - Izlaz iz programa");
				opcija = scanner.nextInt();
				
				switch(opcija) {
					case 1: 
						imenik.ucitajOsobu();
						break;
					case 2: 
						imenik.pronadjiOsobu();
						break;
					case 3:
						imenik.ispisi();
						break;
				}
				
			}while (opcija !=4);
			System.out.println("Kraj programa. Hvala sto ste koristili FonImenik 1.23");
		}
}
