package dvocas8_ponedeljak.zadatak2;

public class TestAutomat {

	public static void main(String[] args) {
		AutomatZaKafu automat1 = new MesovitiAutomat();
		automat1.napraviKafu(50);
		((AutomatZaCokoladice)automat1).izbaciCokoladicu(60);

		System.out.println(automat1);
		
		AutomatZaCokoladice automat2 = new UtopijskiMesovitiAutomat();
		automat2.izbaciCokoladicu(0);
		System.out.println(automat2);
	}

}
