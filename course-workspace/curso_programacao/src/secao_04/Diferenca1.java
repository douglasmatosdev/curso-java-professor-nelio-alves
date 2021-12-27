package secao_04;

import java.util.Scanner;

/**
 * 
 * @author douglas
 *
 *	Fazer um programa para lerquatro valores inteiros A, B, C e D.
 *	A seguir, calcule e mostre a diferença do produto de A e B pelo
 *	produto de C e D segundo a fórmula: DIFERENCA = (A * B -C * D).
 *
 */

public class Diferenca1 {

	public static void run() {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		 A = sc.nextInt();
		 B = sc.nextInt();
		 C = sc.nextInt();
		 D = sc.nextInt();
		 
		 DIFERENCA = (A * B - C * D);
		 
		 System.out.printf("DIFERENCA = %d%n", DIFERENCA);
		
		sc.close();
		
	}
}
