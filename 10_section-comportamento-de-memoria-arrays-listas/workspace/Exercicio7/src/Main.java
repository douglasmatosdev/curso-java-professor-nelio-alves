import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "abaixo_da_media"  Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/abaixo_da_media.java
 * <p>
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
 * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
 * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            double numero = sc.nextDouble();
            sum += numero;
            vetor[i] = numero;
        }

        double average = sum / n;
        System.out.printf("MEDIA DO VETOR = %.3f%n", average);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < average) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}