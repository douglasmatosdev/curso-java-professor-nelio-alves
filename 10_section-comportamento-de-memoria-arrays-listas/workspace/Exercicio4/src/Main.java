import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "numeros_pares"  Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/numeros_pares.java
 * <p>
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();

        }
        int amountEven = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                amountEven++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = " + amountEven);
        scanner.close();
    }
}