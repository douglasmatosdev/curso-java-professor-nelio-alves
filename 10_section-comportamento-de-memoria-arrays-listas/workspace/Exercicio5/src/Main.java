import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "maior_posicao"  Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/maior_posicao.java
 * <p>
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
 * considerando a primeira posição como 0 (zero).
 */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double heigher = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            double numero = sc.nextDouble();

            if (numero > heigher) {
                heigher = numero;
                index = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", heigher);
        System.out.println("POSICAO DO MAIOR VALOR = " + index);

        sc.close();
    }
}