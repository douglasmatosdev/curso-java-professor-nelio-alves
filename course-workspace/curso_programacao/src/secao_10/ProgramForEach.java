package secao_10;

public class ProgramForEach {

	public static void run() {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		// For traditional
		System.out.println("FOR TRADITIONAL:");
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println();
		
		// For Each
		System.out.println("FOR EACH:");
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
