import entities.Person;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "alturas"  Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java
 * <p>
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver.
 */

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();

        Person[] personVector = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            scanner.nextLine();
            System.out.print("Nome: ");
            String name = scanner.nextLine();

            System.out.print("Idade: ");
            int age = scanner.nextInt();

            System.out.print("Altura: ");
            Double height = scanner.nextDouble();

            personVector[i] = new Person(name, age, height);
        }

        double sumHeight = 0;
        double countLessThan16 = 0;
        for (int i = 0; i < n; i++) {
            sumHeight += personVector[i].getHeight();

            if (personVector[i].getAge() < 16) {
                countLessThan16++;
            }
        }

        System.out.printf("Altura média: %.2f%n", (sumHeight / n));
        System.out.printf("Pessoas com menos de 16 anos:  %.1f%%%n", countLessThan16 / n * 100);
        for (int i = 0; i < n; i++) {
            if (personVector[i].getAge() < 16) {
                System.out.println(personVector[i].getName());
            }
        }
        scanner.close();

    }
}