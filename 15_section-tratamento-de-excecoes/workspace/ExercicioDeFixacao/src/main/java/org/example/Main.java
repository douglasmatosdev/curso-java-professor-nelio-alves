package org.example;

import org.example.model.entities.Account;
import org.example.model.exceptions.ModelExeception;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        try {

            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine(); // consumir linha pendente
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());

            System.out.println("New balance: " + account.getBalance());

        } catch (ModelExeception e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}