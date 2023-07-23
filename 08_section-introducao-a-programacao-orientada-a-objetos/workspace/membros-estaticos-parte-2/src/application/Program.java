package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calculator.circumgerence(radius);

        double v = calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calculator.PI);

        sc.close();
    }
}