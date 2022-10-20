package dvocas4_ponedeljak.zadatak1;

public class TestPredmet {

	public static void main(String[] args) {
		Predmet p = new Predmet("Progr 2", 8);
		
		//p.ocene[0] = 9;
		//p.ocene[1] = 6;
		p.unesiOcenu(5);
		p.unesiOcenu(5);
		p.unesiOcenu(8);
		p.unesiOcenu(6);
		p.unesiOcenu(10);
		p.unesiOcenu(6);
		
		
		p.ispisi();
		System.out.println( p.izracunajProsek() );
		p.izracunajProlaznost();
		p.pronadjiNajvisuOcenu();
	}

}
