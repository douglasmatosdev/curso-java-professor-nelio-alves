package secao_04;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author douglas
 * 
 *	Faça um programa para ler o valor do raio de um círculo,
 *	e depois mostrar o valor da área deste círculo com quatro
 *	casas decimais conforme exemplos.
 *
 *	Fórmula da área: area = π . raio2
 *
 *	Considere o valor deπ = 3.14159
 *
 */

public class RaioDeUmCirculo {
	public static void run() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		double PI = 3.14159;
		
		raio = sc.nextDouble();
		area = PI * raio * raio;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}
}
