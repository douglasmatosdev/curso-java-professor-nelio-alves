package org.example;

import org.example.entities.CompanyContribuinte;
import org.example.entities.Contribuinte;
import org.example.entities.IndividualContribuinte;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();

                list.add(new IndividualContribuinte(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new CompanyContribuinte(name, annualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        double total = 0.0;
        for (Contribuinte contribuinte : list) {
            System.out.println(
                    String.format(
                            "%s: $ %.2f", contribuinte.getName(), contribuinte.getTaxPaid()
                    )
            );
            total += contribuinte.getTaxPaid();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + total);

        sc.close();
    }
}