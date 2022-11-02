package dvocas6_ponedeljak.zadatak1;

public class Student extends Osoba {
	private String fakultet;
	private double prosek;
	
	public Student() {
		super();
	}
	
	public Student(String ime, String prezime, String adresa) {
		super(ime, prezime, adresa);
	}	
	
	public void postaviFakultet(String fakultet) {
		if (fakultet != null && !fakultet.isEmpty()) {
			this.fakultet = fakultet;
		} else {
			System.out.println("Fakultet ne sme biti null!");
		}
	}
	
	public String vratiFakultet() {
		return fakultet;
	}
	
	public void postaviProsek(double prosek) {
		if (prosek>5 && prosek<=10) {
			this.prosek = prosek;
		} else {
			System.out.println("Greska: Prosek mora biti izmedju 5 i 10!");
		}
	}
	
	public double vratiProsek() {
		return prosek;
	}
	
	
	public void ispisi() {
		
		System.out.println("Podaci o studentu");
		super.ispisi();
		/*
		System.out.println("Ime: "+vratiIme());
		System.out.println("Prezime: "+vratiPrezime());
		System.out.println("Adresa: "+adresa);
		*/
		System.out.println("Fakultet: "+fakultet);
		System.out.println("Prosek: "+prosek);
		
	}

	@Override
	public String toString() {
		return "Student [fakultet=" + fakultet + ", prosek=" + prosek + ", ime=" + vratiIme()
				+ ", prezime=" + vratiPrezime() + ", adresa=" + vratiAdresu() + "]";
	}	
	
	
	
}
