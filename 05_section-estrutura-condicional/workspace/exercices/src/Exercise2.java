import java.util.Scanner;

public class Exercise2 {
    public static void run() {
        System.out.println("Exercise2");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
