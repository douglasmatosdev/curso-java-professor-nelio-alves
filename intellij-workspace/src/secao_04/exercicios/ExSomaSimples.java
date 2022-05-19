package secao_04.exercicios;

import java.util.Scanner;

/**
 * 
 * @author douglas
 *
 *	Faça um programa para ler dois valores inteiros,
 *	e depois mostrar na tela a soma desses números com uma
 *	mensagem explicativa, conforme exemplos.
 *
 */

public class ExSomaSimples {

	public static void run() {
		int a, b, sum;

		Scanner sc = new Scanner(System.in);
		
			a = sc.nextInt();
			b = sc.nextInt();
			
			sum = a + b;
			
			System.out.printf("SOMA = %d%n", sum);
		
		sc.close();

	}
}
