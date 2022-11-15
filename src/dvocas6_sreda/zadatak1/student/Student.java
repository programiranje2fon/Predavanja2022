package dvocas6_sreda.zadatak1.student;

import dvocas6_sreda.zadatak1.osoba.Osoba;

public class Student extends Osoba {
	
	private String fakultet;
	private double prosek;
	
	public void postaviFakultet(String fakultet) {
		if (fakultet == null || fakultet.isEmpty())
			System.out.println("GREska");
		else
			this.fakultet = fakultet;
	}
	
	public String vratiFakultet() {
		return fakultet;
	}

	public void postaviProsek(double prosek) {
		if (prosek < 6 || prosek > 10)
			System.out.println("GREska");
		else
			this.prosek = prosek;
	}
	
	public double vratiProsek() {
		return prosek;
	}

	@Override
	public String toString() {
		return super.toString() + " fakultet=" + fakultet + ", prosek=" + prosek;
	}

	/*public void ispisi() {
		super.ispisi();
		System.out.println("Fakultet: "+fakultet+" Prosek: "+prosek);
	}*/
	
}
