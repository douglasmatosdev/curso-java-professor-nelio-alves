import java.util.Scanner;

public class Exercise01 {

    public static void run() {
        System.out.println("Exercise01");
        Scanner scanner = new Scanner(System.in);

        int n1, n2, x;

        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        x = n1 + n2;

        System.out.printf("SOMA = %d%n", x);

        scanner.close();
    }
}
