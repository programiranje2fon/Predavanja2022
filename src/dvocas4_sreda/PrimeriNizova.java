package dvocas4_sreda;

public class PrimeriNizova {

	public static void main(String[] args) {
		// kreiranje niza
		// tipElemenataniza[] imeNiza = new tipElemenata[brojElemenata]
		int[] nizCelih = new int[10];
		
		// dodelu vrednosti elemntima niza
		for(int i=0; i < nizCelih.length; i++) {
			nizCelih[i] = 2 * i;
		}
		
		// pristup vrednostima niza
		for(int i=0; i<nizCelih.length; i++) {
			System.out.println("niz["+i+"] = " + nizCelih[i]);
		}
		
		double[] nizDecimalnih = new double[20];
		for(int i=0; i < nizDecimalnih.length; i++) {
			nizDecimalnih[i] = Math.random()*100;
		}	
		
		ispisiNiz(nizDecimalnih);
		
		boolean sadrzi = daLiSadrzi(nizCelih, 16);
		System.out.println("Niz celih sadrzi broj 16: "+sadrzi);
		
		izbaciVrednost(nizCelih, 14);
		ispisiNiz(nizCelih);
		
		
	}

	static void izbaciVrednost(int[] nizCelih, int broj) {
		int i=0;
		
		while(nizCelih[i] !=broj) {
			i++;
		}
		// posle ove petlje i sadrzi poziciju sa vrednoscu broj
		
		for(int j=i; j<nizCelih.length-1; j++) {
			nizCelih[j] = nizCelih[j+1];
		}
		
		nizCelih[nizCelih.length-1] = 0;
	}

	static boolean daLiSadrzi(int[] nizCelih, int broj) {
		
		for(int i=0; i<nizCelih.length; i++) {
			if (nizCelih[i] == broj) {
				return true;
			}
		}
		
		return false;
	}

	static void ispisiNiz(double[] nizDecimalnih) {
		for(int i=0; i<nizDecimalnih.length; i++) {
			System.out.println("nizDecimalnih["+i+"] = " + nizDecimalnih[i]);
		}		
	}
	
	static void ispisiNiz(int[] nizCelih) {
		for(int i=0; i<nizCelih.length; i++) {
			System.out.println("nizCelih["+i+"] = " + nizCelih[i]);
		}		
	}	
	

}
