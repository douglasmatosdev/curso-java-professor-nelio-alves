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

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = scanner.nextInt();

        Person personMoreOld = null;

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            scanner.nextLine();

            System.out.print("Nome: ");
            String name = scanner.nextLine();

            System.out.print("Idade: ");
            int age = scanner.nextInt();

            Person person = new Person(name, age);

            if (personMoreOld != null && person.getAge() > personMoreOld.getAge()) {
                personMoreOld = person;
            } else {
                personMoreOld = person;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s%n", personMoreOld.getName());

        scanner.close();

    }
}