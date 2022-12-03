package dvocas9_sreda.zadatak1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EnciklopedijaFilmova {
	private List<Film> filmovi = new ArrayList<>();
	
	public void dodajFilm(Film film) {
		if (!filmovi.contains(film)) {
			filmovi.add(film);
		} else {
			throw new RuntimeException("Film se vec nalazi u listi: " + film.toString());
		}
	}
	
	public void obrisiFilm(Film film) {
		filmovi.remove(film);
	}
	
	public void ispisi() {
	/*	for(int i=0; i<filmovi.size(); i++) {
			System.out.println(filmovi.get(i));
		}*/
		
		for(Film film : filmovi) {
			System.out.println(film);
		}
		/*
		Iterator<Film> ifilm = filmovi.iterator();
		while(ifilm.hasNext()) {
			Film film = ifilm.next();
			System.out.println(film);
		}
		*/
		
	}
	
	public void pronadjiFilm(String kljucnaRec) {
		for(Film film : filmovi) {
			if (film.getNaslov().toLowerCase().contains(kljucnaRec.toLowerCase())) {
				System.out.println(film);
			}
		}
	}
	
	
	
}
