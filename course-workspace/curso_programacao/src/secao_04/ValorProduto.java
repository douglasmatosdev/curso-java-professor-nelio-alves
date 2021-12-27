package secao_04;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author douglas
 * 
 *         Fazer um programa paraler o código de uma peça 1, o número de peças
 *         1, o valor unitário de cada peça 1, o código de uma peça 2, o número
 *         de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o
 *         valor a ser pago.
 *
 */

public class ValorProduto {

	public static void run() {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int code, amount;
		double unitValue, totalToPay = 0.0;

		for (int i = 0; i < 2; i++) {
			code = sc.nextInt();
			amount = sc.nextInt();
			unitValue = sc.nextDouble();

			totalToPay += amount * unitValue;
		}

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalToPay);

		sc.close();
	}
}
