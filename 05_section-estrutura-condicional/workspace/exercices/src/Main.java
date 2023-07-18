import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int code;

        String[] exercices_list = {
                "Negativo ou positivo",
                "Par ou impar",
                "Multiplos",
                "Duração do jogo",
                "Valor da conta",
                "Intervalos",
                "Coordenadas",
                "Imposto de Renda"
        };

        for (int i = 0; i < exercices_list.length; i++) {
            System.out.printf("[%d]: %s%n", i + 1, exercices_list[i]);
        }

        System.out.print("Digite o código do exercicio desejado: ");
        code = sc.nextInt();

        switch (code) {
            case 1:
                Exercise1.run();
                break;
            case 2:
                Exercise2.run();
                break;
            case 3:
                Exercise3.run();
                break;
            case 4:
                Exercise4.run();
                break;
            case 5:
                Exercise5.run();
            case 6:
                Exercise6.run();
            case 7:
                Exercise7.run();
            case 8:
                Exercise8.run();
                break;
            default:
                System.out.println("Código inválido, por favor tente novamente.");
                break;
        }

    }
}