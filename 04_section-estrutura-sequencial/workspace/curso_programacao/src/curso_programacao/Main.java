package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.print("Hello World!");
		System.out.println("Good mornig!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULT = " + x + " METERS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
