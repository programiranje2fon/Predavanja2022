package dvocas9_sreda.zadatak1.test;

import dvocas9_sreda.zadatak1.EnciklopedijaFilmova;
import dvocas9_sreda.zadatak1.Film;

public class TestFilm {

	public static void main(String[] args) {
		Film nekiFilm = new Film();
		Film nekiFilm2 = new Film();
		Film nekiFilm3 = new Film();
		EnciklopedijaFilmova enciklopedija = new EnciklopedijaFilmova();
		
		try {	
			nekiFilm2.setNaslov("Terminator");
			nekiFilm2.setGodina(1996);			
			nekiFilm.setNaslov("Blade Runner");	
			nekiFilm.setGodina(1989);
			nekiFilm3.setNaslov("Ajkula 3");			
			
			System.out.println("Broj znakova u naslovu: "+nekiFilm.getNaslov().length());
			//System.out.println(nekiFilm.getNaslov().charAt(25));
			
			
			enciklopedija.dodajFilm(nekiFilm);
			enciklopedija.dodajFilm(nekiFilm2);
			enciklopedija.dodajFilm(nekiFilm3);
			enciklopedija.ispisi();
			
			System.out.println("Rezultati pretrage:");
			enciklopedija.pronadjiFilm("nator");
			
		} catch(NullPointerException npe) {
			System.out.println("Doslo je do greske: "+npe.getMessage());
		} catch(StringIndexOutOfBoundsException sbi) {
			System.out.println(sbi.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Program i dalje radi");
	}

}
