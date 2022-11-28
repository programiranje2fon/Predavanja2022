package dvocas8_ponedeljak.zadatak2;

public class MesovitiAutomat implements AutomatZaKafu, AutomatZaCokoladice {
	private int kolicinaKafe = 100;
	private int brojCokoladica = 35;
	private double kolicinaNovca = 0;
	
	@Override
	public void napraviKafu(double iznos) {
		if ((iznos >= 50) && (kolicinaKafe>0)) {
			kolicinaKafe--;
			kolicinaNovca += iznos;
			System.out.println("Kafa je napravljena, izvolite!");
		} else {
			System.out.println("Greska: nema dovoljno kafe ili nedovoljno novca!");
		}
	}	
	
	@Override
	public void izbaciCokoladicu(double iznos) {
		if ((iznos >= 60) && (brojCokoladica>0)) {
			brojCokoladica--;
			kolicinaNovca += iznos;
			System.out.println("Cokoladica je izbacena, izvolite!");
		} else {
			System.out.println("Greska: nema cokoladica ili nedovoljno novca!");
		}		
	}

	@Override
	public String toString() {
		return "MesovitiAutomat [kolicinaKafe=" + kolicinaKafe + ", brojCokoladica=" + brojCokoladica
				+ ", kolicinaNovca=" + kolicinaNovca + "]";
	}
	
	

	

	
	
}
