package dvocas2_ponedeljak;

class Artikal {
	String ime;
	double cena;
	int kolicina;
	VrstaArtikla vrsta = VrstaArtikla.STANDARDNI;
	
	public static final double PORESKA_STOPA_STANDARDNA = 0.18;
	public static final double PORESKA_STOPA_LUKSUZNA = 0.2;
	
	
	double izracunajIznos() {
		return cena * kolicina;
	}
	
	double izracunajPorez() {
		double iznos = cena * kolicina;
		
		if (vrsta == VrstaArtikla.STANDARDNI) {
			return iznos * PORESKA_STOPA_STANDARDNA;
		} else if(vrsta == VrstaArtikla.LUKSUZNI) {
			return iznos * PORESKA_STOPA_LUKSUZNA;
		} else {
			System.out.println("Greska: nepoznata vrsta artikla");
			return -1;
		}
	}
	
}
