package dvocas10_ponedeljak.zadatak1;

import java.util.Scanner;

public class UcitavanjeSaTastaturomScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Unesite tekst:");
		String nekiString = scanner.nextLine();
		System.out.println(nekiString);
		
		System.out.print("Unesite ceo broj:");
		int ceoBroj = scanner.nextInt();
		System.out.println(ceoBroj);
		
		System.out.print("Unesite decimalni broj:");
		double decBroj = scanner.nextDouble();
		System.out.println(decBroj);
		
	}

}
