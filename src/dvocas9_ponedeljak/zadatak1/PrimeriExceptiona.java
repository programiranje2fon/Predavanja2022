package dvocas9_ponedeljak.zadatak1;

public class PrimeriExceptiona {

	public static void main(String[] args) {
		String s = null;
		int[] niz = {2, 3, 5, 7};
		String s2 = "Neki tekst";
		
		try {
			System.out.println(s2.charAt(59));
			System.out.println(s.toUpperCase());			
			System.out.println(niz[6]);
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Pristup vn granica niza");
		} catch(NullPointerException npe) {
			System.out.println("Pristup null objektu");
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Program i dalje radi");
	}

}
