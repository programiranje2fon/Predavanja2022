package dvocas7_ponedeljak.zadatak1;

public class PrimerArtikla {

	public static void main(String[] args) {
		Artikal artikal = new Artikal("Cokolada", 200, 20);
		//artikal.setOpis(null);
		artikal.setOpis("Cokolada najlepse zelje sa lesnicima");
		
		System.out.println(artikal);

		Artikal artikal2 = new Artikal();
		System.out.println(artikal2.toString());
		
	}

}
