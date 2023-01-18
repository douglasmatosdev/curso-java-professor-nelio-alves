package secao_14.exe3.application;

import secao_14.exe3.entities.Company;
import secao_14.exe3.entities.Individual;
import secao_14.exe3.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTaxPayer {

    public static void run() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i);
            System.out.print("Individual or Company (i/c)? ");

            char individualOrCompany = sc.next().charAt(0);
            if (individualOrCompany == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                Double anualExpenditure = sc.nextDouble();
                System.out.print("Health expenditures: ");
                Double healthExpenditure = sc.nextDouble();

                taxPayerList.add(new Individual(name, anualExpenditure, healthExpenditure));
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                Double anualExpenditure = sc.nextDouble();
                System.out.print("Number of Employees: ");
                Integer numberOfEmployee = sc.nextInt();

                taxPayerList.add(new Company(name, anualExpenditure, numberOfEmployee));
            }
        }

        Double totalTax = 0.0;
        System.out.println("\nTAXES PAID");
        for (TaxPayer taxPayer : taxPayerList) {
            System.out.println(String.format("$ %.2f", taxPayer.tax()));
            totalTax += taxPayer.tax();
        }
        System.out.println(String.format("\n$ %.2f", totalTax));
        sc.close();
    }
}
