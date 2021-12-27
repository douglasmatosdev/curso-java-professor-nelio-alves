package secao_04;
import java.util.Locale;
import java.util.Scanner;

public class LendoAteQuebraDeLinha {

	static public void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		System.out.printf("DIGITE 3 FRASES, AO FIM DE CADA FRASE TECLE ENTER. %n");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.printf("DADOS DIGITADOS %n");
		System.out.printf("%s%n", s1);
		System.out.printf("%s%n", s2);
		System.out.printf("%s%n", s3);
		
		sc.close();
	}
}
