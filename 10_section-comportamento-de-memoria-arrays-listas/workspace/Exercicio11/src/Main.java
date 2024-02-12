import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "dados_pessoas"  Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/dados_pessoas.java
 * <p>
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
 * de homens.
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double heigher = 0.0;
        double lower = 0.0;
        double sumWomenHeight = 0.0;
        int countWamen = 0;
        int countMen = 0;

        for (int i = 0; i < n; i++) {
            int index = i + 1;

            System.out.printf("Altura da %da pessoa: ", index);
            double height = sc.nextDouble();

            sc.nextLine();
            System.out.printf("Gênero da %da pessoa: ", index);
            String genderInput = sc.nextLine();
            char gender = genderInput.charAt(0);

            if (height > heigher) {
                heigher = height;
            }

            if (lower == 0.0) {
                lower = height;
            }
            if (height < lower) {
                lower = height;
            }

            if (gender == 'F') {
                sumWomenHeight += height;
                countWamen++;
            }

            if (gender == 'M') {
                countMen++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", lower);
        System.out.printf("Maior altura = %.2f%n", heigher);
        System.out.printf("Média das alturas das mulheres = %.2f%n", sumWomenHeight / countWamen);
        System.out.println("Número de homens = " + countMen);

        sc.close();
    }
}