import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
    public static void run() {
        System.out.println("Exercise03");
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        diferenca = (a * b) - (c * d);

        System.out.printf("DIFERENCA = %d%n", diferenca);

        scanner.close();
    }
}
