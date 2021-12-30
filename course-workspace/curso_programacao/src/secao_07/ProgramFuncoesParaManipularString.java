package secao_07;

/**
 * 
 * @author douglas
 *
 *         Checklist
 *
 *         •Formatar: toLowerCase(), toUpperCase(), trim()
 * 
 *         •Recortar: substring(inicio), substring(inicio, fim)
 * 
 *         •Substituir: Replace(char,char), Replace(string, string)
 * 
 *         •Buscar: IndexOf, LastIndexOf
 * 
 *         •str.Split(" ")
 *
 */
public class ProgramFuncoesParaManipularString {

	public static void run() {

		String originalText = "abcde FGHIJ ABC abc DEFG    ";
		System.out.printf("ORIGINAL: -%s-%n", originalText);

		String s01 = originalText.toLowerCase(); // ________All text to lower case
		String s02 = originalText.toUpperCase(); // ________All text to upper case
		String s03 = originalText.trim(); // _______________Remove white space at beginning and end
		String s04 = originalText.substring(2); // _________Create a new string from the character 2 onwards
		String s05 = originalText.substring(2, 9); // ______Get all string from index 2 to index 9
		String s06 = originalText.replace('a', 'x'); // ____Replace all string 'abc' lowercase
		String s07 = originalText.replace("abc", "xy"); // _Replace all string 'abc' lowercase to string 'xy' lowercase
		int i = originalText.indexOf("bc"); // _____________Get index of the first occurrence for the string 'bc'
		int j = originalText.lastIndexOf("bc"); // _________Get index of the last occurrence for the string 'bc'

		System.out.printf("toLowerCase: -%s-%n", s01);
		System.out.printf("toUpperCase: -%s-%n", s02);
		System.out.printf("trim: -%s-%n", s03);
		System.out.printf("substring(2): -%s-%n", s04);
		System.out.printf("substring(2, 9): -%s-%n", s05);
		System.out.printf("replace('a', 'x'): -%s-%n", s06);
		System.out.printf("replace('abc', 'xy'): -%s-%n", s07);
		System.out.printf("indexOf('bc'): -%s-%n", i);
		System.out.printf("lastIndexOf('bc'): -%s-%n", j);

		System.out.println("\n");

		String fruits = "potato apple lemon orange";
		String[] vectorFruits = fruits.split(" ");
		System.out.println(vectorFruits[0]);
		System.out.println(vectorFruits[1]);
		System.out.println(vectorFruits[2]);
		System.out.println(vectorFruits[3]);

		System.out.println("\n USING FOR TO PRINT VALUES\n");
		for (String fruit : vectorFruits) {
			System.out.println(fruit);
		}

	}
}
