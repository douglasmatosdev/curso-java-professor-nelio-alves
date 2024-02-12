import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "soma_vetor"  Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetor.java
 * <p>
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 */

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.print("VALORES =");
        double soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vetor[i]);
            soma += vetor[i];
        }

        System.out.println(" ");
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + (soma / n));

        scanner.close();
    }
}