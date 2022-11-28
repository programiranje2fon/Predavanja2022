package dvocas8_ponedeljak.zadatak2;

public class UtopijskiMesovitiAutomat implements AutomatZaCokoladice, AutomatZaKafu {

	@Override
	public void napraviKafu(double iznos) {
		System.out.println("Kafa je besplatna! Kafa je napravljena");
		
	}

	@Override
	public void izbaciCokoladicu(double iznos) {
		System.out.println("Cokoladica je besplatna! Cokolacija je izbacena");
		
	}

}
