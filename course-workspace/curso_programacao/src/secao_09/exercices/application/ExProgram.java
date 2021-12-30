package secao_09.exercices.application;

import java.util.Locale;
import java.util.Scanner;

import secao_09.exercices.entities.ExAccountBank;

public class ExProgram {

	public static void run() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Ente account number: ");
		int number = sc.nextInt();

		// Clean empty space
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char makeDeposit = sc.next().charAt(0);

		ExAccountBank accountBank;

		if (makeDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositValue = sc.nextDouble();
			accountBank = new ExAccountBank(number, holder, depositValue);
		} else {
			accountBank = new ExAccountBank(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(accountBank);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		accountBank.deposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(accountBank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		accountBank.withdraw(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(accountBank);

		sc.close();
	}
}
