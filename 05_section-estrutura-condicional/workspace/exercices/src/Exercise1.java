import java.util.Scanner;

public class Exercise1 {
    public static void run() {
        System.out.println("Exercise1");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
