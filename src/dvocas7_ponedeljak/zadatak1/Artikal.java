package dvocas7_ponedeljak.zadatak1;

import java.util.Objects;

public class Artikal {
	private int sifra = -1;
	private String naziv = "nepoznat";
	private String opis="";
	private double jedinicnaCena =-1;
	private int kolicina = -1;
	
	public Artikal() {
		
	}
	
	public Artikal(String naziv, double jedinicnaCena, int kolicina) {
		this.naziv = naziv;
		this.jedinicnaCena = jedinicnaCena;
		this.kolicina = kolicina;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
							// !opis.isEmpty()
							// ne sme: opis == ""
		if (opis != null && !opis.equals("")) {
			this.opis = opis;
		} else {
			System.out.println("Greska: opis ne sme biti null");
		}
	}

	public double getJedinicnaCena() {
		return jedinicnaCena;
	}

	public void setJedinicnaCena(double jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return "Artikal [sifra=" + sifra + ", naziv=" + naziv + ", opis=" + opis + ", jedinicnaCena=" + jedinicnaCena
				+ ", kolicina=" + kolicina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(jedinicnaCena, kolicina, naziv, opis, sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Artikal)) return false;
		
		Artikal other = (Artikal) obj;
		
		return (jedinicnaCena == other.jedinicnaCena)
				&& kolicina == other.kolicina 
				&& naziv.equals(other.naziv) && opis.equals(other.opis)
				&& sifra == other.sifra;
	}
	
	
	
	
	
	
}
