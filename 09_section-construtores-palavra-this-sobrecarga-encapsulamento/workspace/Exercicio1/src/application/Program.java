package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine(); // consumer buffer reader

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char willDeposit = sc.next().charAt(0);

		Account account;
		if (willDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			Double value = sc.nextDouble();
			account = new Account(number, holder, value);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		Double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		Double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());

		sc.close();
	}

}
