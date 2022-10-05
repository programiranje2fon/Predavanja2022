package dvocas1_ponedeljak.racun;

import java.util.Scanner;

public class Konzola {
	public static void ispisi(String str) {
		System.out.println(str);
	}
	
	public static String ucitajString(String poruka) {
		System.out.print(poruka);	
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		return str;
	}
	
	public static int ucitajCeoBroj(String poruka) {
		System.out.print(poruka);			
		Scanner scanner = new Scanner(System.in);
		int broj = scanner.nextInt();
		return broj;
	}	
	
	public static double ucitajDecimalniBroj(String poruka) {
		System.out.print(poruka);			
		Scanner scanner = new Scanner(System.in);
		double broj = scanner.nextDouble();
		return broj;
	}	
}
