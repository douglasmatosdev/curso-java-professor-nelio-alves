import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "media_pares"  Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/media_pares.java
 * <p>
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 * aritmética  somente  dos  números  pares  lidos,  com  uma  casa  decimal.  Se  nenhum  número  par  for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            double numero = sc.nextDouble();
            if (numero % 2 == 0) {
                sum += numero;
                count++;
            }
        }

        if (count > 0 && sum / count > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f%n", sum / count);
        } else {
            System.out.println("NENHUM NÚMERO PAR");
        }
        sc.close();
    }
}