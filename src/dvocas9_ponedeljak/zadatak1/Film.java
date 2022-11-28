package dvocas9_ponedeljak.zadatak1;

public class Film {
	private String naziv;
	private int trajanje;
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) throws Exception {
		if (naziv == null) {
			throw new RuntimeException("Greska: Naziv filma ne sme biti null");
		}
		
		this.naziv = naziv;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(int trajanje) {
		if (trajanje <=0) {
			throw new PogresnoTrajanjeIzuzetak("Greska: trajanje mora biti pozitivan broj:"+trajanje);
		}
		this.trajanje = trajanje;
	}
	@Override
	public String toString() {
		return "Film [naziv=" + naziv + ", trajanje=" + trajanje + "]";
	}
	
	
}
