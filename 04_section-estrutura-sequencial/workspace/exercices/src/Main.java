import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int exercise_code;
        String[] exercise_list = {"Soma de dois inteiros", "Calcular a área de um circulo", "Calcular a diferença", "Calcular salário", "Calcular valor total da compra", "Geometria"};
        System.out.println("Lista de exercicios");
        for (int i = 0; i < exercise_list.length; i++) {
            System.out.printf("[%d] %s%n", i + 1, exercise_list[i]);
        }
        System.out.print("Digite o código do exercício desejado:");
        exercise_code = scanner.nextInt();

        switch (exercise_code) {
            case 1:
                Exercise01.run();
                break;
            case 2:
                Exercise02.run();
                break;
            case 3:
                Exercise03.run();
                break;
            case 4:
                Exercise04.run();
                break;
            case 5:
                Exercise05.run();
            case 6:
                Exercise06.run();
                break;
            default:
                System.out.println("Código inválido, por favor tente novamente.");
                break;
        }

        scanner.close();
    }
}