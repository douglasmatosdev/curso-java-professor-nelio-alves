package exercices;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
    private final static int IOF = 6;

    public static void run() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercise04");

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double result = dollarPrice * amount + (dollarPrice * amount * IOF / 100);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();
    }
}
