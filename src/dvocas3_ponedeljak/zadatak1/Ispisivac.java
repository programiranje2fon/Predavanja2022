package dvocas3_ponedeljak.zadatak1;

public class Ispisivac {
	
	static void ispisiOcenu(int ocena){
		/*if (ocena == 5)
			System.out.println("Odlican");
		else
		if (ocena == 4)
			System.out.println("Vrlo dobar");
		else
		if (ocena == 3)
			System.out.println("Dobar");
		else
		if (ocena == 2)
			System.out.println("Dovoljan");
		else
		if (ocena == 1)
			System.out.println("Nedovoljan");
		else
			System.out.println("GRESKA");*/
		
		switch(ocena) {
		case 5: System.out.println("Odlican");break;
		case 4: System.out.println("Vrlo dobar");break;
		case 3: System.out.println("Dobar");break;
		case 2: System.out.println("Dovoljan");break;
		case 1: System.out.println("Nedovoljan");break;
		default: System.out.println("GRESKA");
		}
	}
	
	static void ispisiZdravo() {
		for (int i = 1; i<=5; i++) 
			System.out.println("Zdravo");
	}
	
	static void ispisiPoruku(String poruka) {
		/*for (int i=9; i>=0; i--)
			System.out.println(poruka);*/
		ispisiPoruku(poruka, 10);		
	}
	
	static void ispisiPoruku(String poruka, int brojPuta) {
		for (int i = 1; i<= brojPuta; i++)
			System.out.println(poruka);
		
		/*int b = 1;
		
		while (b <= brojPuta) {
			System.out.println(poruka);
			b++;
		}*/
	}
	
	static void ispisiBrojeveOd1Do20() {
		System.out.println("START");
		
		for (int i=1; i<=20; i++) {
			if (i==15)
				continue;
			
			System.out.println( i );
			
			if (i==18)
				return;  //break;
		}
		
		System.out.println("STOP");
	}
	
	static void vremeDupliranja(double iznos, double kamata) {
		double ciljniIznos = iznos * 2;
		
		while (iznos < ciljniIznos) {
			iznos = iznos * (100+kamata)/100;
			System.out.println(iznos);
		}
		
		/*for (double ciljniIznos = iznos * 2; iznos < ciljniIznos;iznos = iznos * (100+kamata)/100) 
			System.out.println(iznos);	*/		
	
		
		/*do {
			iznos = iznos * (100+kamata)/100;
			System.out.println(iznos);
		} while (iznos < ciljniIznos);*/
	}

}
