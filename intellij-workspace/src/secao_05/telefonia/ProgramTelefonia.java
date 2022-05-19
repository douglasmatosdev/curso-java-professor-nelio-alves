package secao_05.telefonia;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTelefonia {

	public static void run() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutes;
		double totalToPay = 50.00;

		minutes = sc.nextInt();

		if (minutes > 100) {
			int diff = minutes - 100;
			totalToPay += (diff * 2.00);
		}
		System.out.printf("Valor a pagar: R$ %.2f", totalToPay);

		sc.close();
	}
}
