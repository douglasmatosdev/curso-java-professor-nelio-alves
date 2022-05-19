package secao_03.currency;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCurrencyConverter {

	public static void run() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
//		CurrencyConverter.dollarPrice = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought? ");
		double amount = sc.nextDouble();
//		CurrencyConverter.dollarToBuy = sc.nextDouble();
//		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.howMany());
		double result = ExercicioCorrigidoCurrency.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();
	}
}
