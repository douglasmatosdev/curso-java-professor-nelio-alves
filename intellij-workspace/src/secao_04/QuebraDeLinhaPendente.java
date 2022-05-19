package secao_04;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author douglas
 *
 *	Quando você usa um comando de
 *	leitura diferente do nextLine() e
 *	dá alguma quebra de linha, essa
 *	quebra de linha fica "pendente"
 *	na entrada padrão.
 *
 *	Se você então fizer um nextLine(),
 *	aquela quebra de linha pendente
 *	será absorvida pelo nextLine().
 *
 *	Solução:
 *	Faça um nextLine() extra antes de
 *	fazer o nextLine() de seu
 *	interesse.
 *
 */

public class QuebraDeLinhaPendente {

	static public void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;
		int x;
		
		// Avoid empty value
		sc.nextLine();
		
		System.out.printf("DIGITE UM NÚMERO INTEIRO %n");
		x = sc.nextInt();

		System.out.printf("DIGITE 3 FRASES, AO FIM DE CADA FRASE TECLE ENTER. %n");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.printf("DADOS DIGITADOS %n");
		System.out.printf("%d%n", x);
		System.out.printf("%s%n", s1);
		System.out.printf("%s%n", s2);
		System.out.printf("%s%n", s3);

		sc.close();
	}

}
