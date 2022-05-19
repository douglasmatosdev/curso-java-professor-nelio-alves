package secao_04.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author douglas
 *
 *         Fazer um programa que leia três valores com ponto flutuante de dupla
 *         precisão: A, B e C. Em seguida, calcule e mostre:
 * 
 *         a) a área do triângulo retângulo que tem A por base e C por altura.
 * 
 *         b) a área do círculo de raio C. (pi = 3.14159)
 * 
 *         c) a área do trapézio que tem A e B por bases e C por altura.
 * 
 *         d) a área do quadrado que tem lado B.
 * 
 *         e) a área do retângulo que tem lados A e B.
 *
 */

public class ExGeometria {

	public static void run() {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double A, B, C, RESULT = 0.0;
		double PI = 3.14159;
		String[] figures = { "TRIANGULO", "CIRCULO", "TRAPEZIO", "QUADRADO", "RETANGULO" };

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		for (String figure : figures) {

			switch (figure) {
			case "TRIANGULO":
				RESULT = (A * C) / 2;
				break;
				
			case "CIRCULO":
				RESULT = PI * C * C;
				break;
				
			case "TRAPEZIO":
				RESULT = (C * (A + B)) / 2;
				break;
				
			case "QUADRADO":
				RESULT = B * B;
				break;
				
			case "RETANGULO":
				RESULT = A * B;
				break;
				
			default:
				break;
			}

			System.out.printf("%s: %.3f%n", figure, RESULT);
		}

		sc.close();

	}
}
