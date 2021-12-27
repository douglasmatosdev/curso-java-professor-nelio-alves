package secao_04;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
	static public void run() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double d;
		char c;
		int i;
		String s;
		
		System.out.printf("Digite um Double (Ex.: 4.5): %n");
		d = sc.nextDouble();
		System.out.println("(println) Você digitou: " + d);
		System.out.printf("(printf)Você digitou %.2f%n: ", d);
		
		System.out.printf("%n%n");
		
		System.out.printf("Digite um char (Ex.: T): %n");
		c = sc.next().charAt(0);
		System.out.printf("(printf) Você digitou: %s", c);
		
		System.out.printf("%n%n");
		
		System.out.printf("Lendo vários valores na mesma linha: %n");
		System.out.printf("Entre com uma String: %n");
		s = sc.next();
		System.out.printf("Entre com um Int: %n");
		i = sc.nextInt();
		System.out.printf("Entre com um Double: %n");
		d = sc.nextDouble();
		System.out.printf("Dados digitados: %n");
		System.out.printf("%s%n", s);
		System.out.printf("%s%n", i);
		System.out.printf("%.2f%n", d);
		 
		sc.close();
	}

}
