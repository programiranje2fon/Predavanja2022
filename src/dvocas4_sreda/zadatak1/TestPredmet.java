package dvocas4_sreda.zadatak1;

public class TestPredmet {

	public static void main(String[] args) {
		Predmet2 predmet = new Predmet2("Programiranje 2", 15);
/*		
		predmet.ocene[0] = 10;
		predmet.ocene[1] = 9;
		predmet.ocene[2] = 8;
		predmet.ocene[3] = 9;
		predmet.ocene[4] = 10;
		predmet.ocene[5] = 8;
		predmet.ocene[6] = 10;
*/
		predmet.unesiOcenu(10);
		predmet.unesiOcenu(10);
		predmet.unesiOcenu(8);
		predmet.unesiOcenu(9);
		predmet.unesiOcenu(5);
		//predmet.unesiOcenu(6);
		predmet.ispisi();
		
		double prosecnaOcena = predmet.izracunajProsek();
		System.out.println("Prosecna ocena: "+prosecnaOcena);
		
		int najvisaOcena = predmet.pronadjiNajvisuOcenu();
		System.out.println("Najvisa ocena: "+najvisaOcena);
		
		double prolaznost = predmet.izracunajProlaznost();
		System.out.println("Prolaznost: "+prolaznost);
		
		
	}

}
