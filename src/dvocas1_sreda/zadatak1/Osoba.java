package dvocas1_sreda.zadatak1;

/*
 * Klasa osoba sa imenom, prezimenom i td.
 */
class Osoba {
	//Ime osobe kao String
	String ime = "nepoznato"; // int  double  char String boolean
	String prezime = "nepoznato";// null
	char pol = 'N';
	int godinaRodjenja;// 0  0.0
	boolean uBraku;// false
	
	void ispisi() {
		System.out.println("Ime: " + ime + " Prezime: " + prezime );
		System.out.println( pol );
		System.out.println( uBraku );
		System.out.println( godinaRodjenja );
	}
	
	int izracunajStarost(int trenutnaGodina) {
		int starost = trenutnaGodina - godinaRodjenja;
		return starost;
		//return trenutnaGodina - godinaRodjenja;
	}

}
