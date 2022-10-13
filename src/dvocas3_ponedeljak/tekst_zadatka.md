# Predavanje 3

	2.6 Statički elementi (static) - deo statičke metode
	3.2. SWITCH naredba
	3.3. FOR naredba
	3.4. WHILE naredba
	3.5 DO-WHILE naredba


# Zadatak 1

Napraviti klasu **Ispisivac** u paketu **dvocas3_ponedeljak.zadatak1**. Ova klasa bi trebalo da ima:


- metodu **ispisiOcenu** koja kao parametar dobija ocenu učenika (u rasponu od 1 do 5) i na ekranu ispisuje da li je u pitanju ocena: odličan, vrlo dobar, dobar, dovoljan ili nedovoljan. Ako je unet broj koji je veći od 5 ili manji od 1, ispisati poruku o grešci.**(prvo varijanta sa if naredbom, onda sa switch naredbom)**

- metodu **ispisiZdravo** koja na ekranu ispisuje poruku "Zdravo" 5 puta. **(uraditi prvo bez petlje, FOR petlja, osnovna sintaksa, kada se koristi, debager objašnjenje i proba)**

Napraviti klasu **TestIspisivac** u paketu **dvocas3_ponedeljak.zadatak1** koja ima main metodu iz koje se pozivaju i proveravaju metode klase Ispisivac.

**Problem: zašto uopšte praviti objekat klase Ispisivac da bi se pozvala jedna metoda za ispis? Klasa ne pamti trenutno stanje (nema čak ni atribute), pa zašto onda rezervisati memorijski prostor za objekat uopšte?**

- Izmeniti metode **ispisiOcenu** i **ispisiZdravo** tako da budu statičke. Izmeniti i sve pozive ovih metoda. **(statičke metode)**

Dodati u klasu Ispisivac:
- Statičku metodu **ispisiPoruku** koja kao parametar dobija poruku koju je na ekranu potrebno ispisati 10 puta.
- Statičku metodu **ispisiPoruku** koja ima dva parametra: poruku koju treba ispisati na ekranu i ceo broj koji predstavlja koliko puta treba ispisati tu poruku na ekranu. Metoda na ekranu ispisuje poruku željeni broj puta. **(Preklapanje metoda - overloading)**
- Statičku metodu **ispisiBrojeveOd1Do20** koja nema parametre i koja na ekranu ispisuje brojeve od 1 do 20. Pre ispisa brojeva, treba ispisati reč "START" na ekranu, a posle ispisa svih brojeva reč "STOP". **(Pokazati i isprobati beskonačnu petlju i kako se prekida izvršavanje takvog koda u Eclipse-u, neizvršivu petlju)**


** Problem **: kako kontrolisati preciznije izršavanje petlje: prekinuti petlju pre izvršenog uslova za prekid, preskočiti neki krug (iteraciju, ciklus) petlje, kako prekinuti celu metodu.

- Izmeniti kod metode **ispisiBrojeveOd1Do20** tako da se ne ispisuje broj 15, a svi ostali ispišu normalno. **(continue naredba)**
- Izmeniti kod metode **ispisiBrojeveOd1Do20** tako da se ispis brojeva prekida posle broja 18, a da se ipak metoda izvrši do kraja i ispiše reč "STOP" posle ispisa brojeva. **(break naredba)**
- Izmeniti kod metode **ispisiBrojeveOd1Do20** tako da se izvršavanje metode prekida posle broja 18. **(return naredba, može čak iako metoda ne vraća ništa)**


** Problem **: a šta ako nije poznat broj iteracija unapred, pa nema smisla koristiti for petlju?

Dodati u klasu Ispisivac:

- Statičku metodu **vremeDupliranja** koja kao parametre dobija iznos novca koji je uložen u banku i godišnju kamatu koju banka daje na uložen novac. Metoda na ekranu ispisuje iznos novca u banci posle svake godine i to sve dok se novac ne duplira u odnosu na originalni iznos. Pretpostavlja se da klijent ne podiže novac u međuvremenu tj. da će ići "kamata na kamatu".**(while petlja, i napomenuti da se svaka petlja može ispisati i preko while i preko for naredbe)**

# Zadatak 2

U produžetku teksta je dat kod klase sa metodom koja bi trebalo da ispisuje trougao (od znakova *) na ekranu. Ideja je da se u prvom redu na ekranu ispiše jedna zvezdica, u drugom redu dve... a u poslednjem pet, tako da bi konačan izlaz na ekranu trebalo da izgleda ovako:

	*
	**
	***
	****
	*****

Dati kod se kompajlira, ali ne radi to šta treba. Napraviti klasu **Ispisivac** u paketu **dvocas3_ponedeljak.zadatak2**, iskopirati u nju kod koji je dat i, uz minimalne izmene ga ispraviti tako da funkcioniše kako treba. Koristeći main metodu iz test klase, pozvati metodu ispisiTrougao() i proveriti njen rad.

package dvocas3_ponedeljak.zadatak2;

class Ispisivac {
	static void ispisiTrougao(){
		for (int i=1; i>=5; i++){
			int j=1;
			while (j<i)
				j++;
				System.out.print('*');
				System.out.println();
		}							
	}
}
