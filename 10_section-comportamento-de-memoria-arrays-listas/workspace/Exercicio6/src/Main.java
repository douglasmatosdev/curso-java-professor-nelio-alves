import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "soma_vetores"  Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetores.java
 * <p>
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
 * o vetor C gerado.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] r = new int[n];

        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            r[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < n; i++) {
            System.out.println(r[i]);
        }

        sc.close();
    }
}