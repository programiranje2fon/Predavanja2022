package dvocas9_sreda.zadatak1;

import java.util.Objects;

public class Film {
	private String naslov;
	private String reziser;
	private int godina;
	
	public String getNaslov() {
		return naslov;
	}
	
	public void setNaslov(String naslov) throws Exception {
		if (naslov != null) {
			this.naslov = naslov;
		} else {
			throw new Exception("Naslov filma ne moze biti null!");
		}		
	}
	
	public String getReziser() {
		return reziser;
	}
	public void setReziser(String reziser) {
		if (reziser == null) {
			throw new NullPointerException("Reziser ne sme biti null!");
		} 
		
		this.reziser = reziser;
	}
	
	public int getGodina() {
		return godina;
	}
	
	public void setGodina(int godina) {
		if (godina < 1900) {
			throw new RuntimeException("Godina ne sme biti manja od 1900!");
		}
		this.godina = godina;
	}
	
	@Override
	public String toString() {
		return "Film [naslov=" + naslov + ", reziser=" + reziser + ", godina=" + godina + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(godina, naslov);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Film other = (Film) obj;
		return godina == other.godina && Objects.equals(naslov, other.naslov);
	}
	
	
	
	
}
