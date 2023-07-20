import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        //contagem crescente
        System.out.println("contagem crescente");
        for (int i = 0; i < 4; i++) {
            System.out.println("Valor de i: " + i);
        }

        //contagem decrescente
        System.out.println("contagem decrescente");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }

        sc.close();
    }
}