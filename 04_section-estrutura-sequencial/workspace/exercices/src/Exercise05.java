import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
    public static void run() {
        System.out.println("Exercise05");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigo_produto1, quantidade_produto1;
        double valor_unitario_produto1;

        int codigo_produto2, quantidade_produto2;
        double valor_unitario_produto2;

        codigo_produto1 = scanner.nextInt();
        quantidade_produto1 = scanner.nextInt();
        valor_unitario_produto1 = scanner.nextDouble();

        codigo_produto2 = scanner.nextInt();
        quantidade_produto2 = scanner.nextInt();
        valor_unitario_produto2 = scanner.nextDouble();

        double total_a_pagar = (quantidade_produto1 * valor_unitario_produto1) + (quantidade_produto2 * valor_unitario_produto2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total_a_pagar);

        scanner.close();
    }
}
