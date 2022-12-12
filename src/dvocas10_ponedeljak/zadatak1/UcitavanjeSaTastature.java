package dvocas10_ponedeljak.zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UcitavanjeSaTastature {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Unesite neki tekst:");
			String tekst = br.readLine();
			System.out.println("Uneli ste: "+tekst);

			System.out.print("Unesite ceo broj:");
			String str = br.readLine();
			int ceoBroj = Integer.parseInt(str);
			System.out.println("Uneli ste: "+ceoBroj);

			System.out.print("Unesite decimalni broj:");
			str = br.readLine();
			double decBroj = Double.parseDouble(str);
			System.out.println("Uneli ste: "+decBroj);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NumberFormatException nex) {
			System.out.println("Pogresan unos broja!");
		}

	}

}
