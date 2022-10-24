package dvocas2_sreda.zadatak1;

public class KonvertorSnage {
	
	static final double KS_KW = 0.74;
	static final double KW_KS = 1.34;
	
	static double konvertujUKS(double kilovati) {
		if (kilovati < 0) {
			System.out.println("Greska!");
			return -1;
		}
		
		double rezultat = kilovati * KW_KS;
		return rezultat;
	}
	
	static double konvertujUKW(double konjskeSnage) {
		if (konjskeSnage < 0) {
			System.out.println("Greska!");
			return -1;
		}

		return konjskeSnage * KS_KW;
	}

}
