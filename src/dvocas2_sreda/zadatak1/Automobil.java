package dvocas2_sreda.zadatak1;

public class Automobil {
	
	String marka, model, registarskaOznaka;
	Osoba vlasnik;
	int kubikaza;
	double snaga;
	TipGoriva vrstaGoriva;
	
	public Automobil() {
	}
	
	Automobil(String marka, String model,
			int kubikaza, double snaga,
			TipGoriva vrstaGoriva) {
		this.marka = marka;
		this.model = model;
		this.kubikaza = kubikaza;
		this.snaga = snaga;
		this.vrstaGoriva = vrstaGoriva;
	}
	
	Automobil(String marka, String model, String registarskaOznaka,
			Osoba vlasnik, int kubikaza, double snaga,
			TipGoriva vrstaGoriva) {
		this.marka = marka;
		this.model = model;
		this.registarskaOznaka = registarskaOznaka;
		this.vlasnik = vlasnik;
		this.kubikaza = kubikaza;
		this.snaga = snaga;
		this.vrstaGoriva = vrstaGoriva;
	}
	
	
	
	void ispisi() {
		System.out.println(marka + " " + model);
		System.out.println("Registracija: " + registarskaOznaka);
		System.out.print("Vlasnik: ");
		vlasnik.ispisi();
		
		System.out.println("Kubikaza: " + kubikaza);
		
		
		//double snagaKs = KonvertorSnage.konvertujUKS(snaga);
		
		System.out.println("Snaga: " + snaga + " kW "
		+ KonvertorSnage.konvertujUKS(snaga) + " KS");
		
		System.out.println("Gorivo: " + vrstaGoriva);
	}
	
	void unesiSnagu(double snaga) {
		if (snaga >= 10 && snaga <= 800)
			this.snaga = snaga;
		else
			System.out.println("Snaga je van granica 10-800");
	}
	
	void unesiKubikazu(int kubikaza) {
		if (kubikaza >= 700 && kubikaza <= 5000)
			this.kubikaza = kubikaza;
		else
			System.out.println("Kubikaza je van granica 700-5000");
	}	

}
