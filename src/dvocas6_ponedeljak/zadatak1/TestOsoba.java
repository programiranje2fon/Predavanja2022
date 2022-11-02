package dvocas6_ponedeljak.zadatak1;

public class TestOsoba {

	public static void main(String[] args) {
		Osoba nekaOsoba1 = new Osoba("Mika", "Mikic", "Kursumlija");
		nekaOsoba1.ispisi();

		Osoba nekaOsoba = new Osoba();
		nekaOsoba.postaviIme("Pera");
		nekaOsoba.postaviPrezime("Peric");
		nekaOsoba.postaviAdresu("Jove Ilica 154, Beograd");
		nekaOsoba.ispisi();
		System.out.println("Ime osobe je: "+nekaOsoba.vratiIme());
		
		System.out.println("------------------------------------------");
		
		Student student1 = new Student();
		student1.postaviIme("Mitar");
		student1.postaviPrezime("Miric");
		student1.postaviAdresu("Vojvode Stepe 114");
		student1.postaviFakultet("FON");
		student1.postaviProsek(9.02);
		
		//student1.ispisi();
		
		Osoba osoba2   = student1;
		osoba2.ispisi();
		
		((Student)osoba2).postaviProsek(9.45);
		osoba2.ispisi();
		
		System.out.println(osoba2.toString());
		
		Osoba osoba3 = new Osoba("Mira", "Mikic", "Kursumlija");
		
		if (nekaOsoba1.equals(osoba3)) {
			System.out.println("Osobe su iste");
		} else {
			System.out.println("Osobe su razlicite!");
		}
		
		
		
	}

}
