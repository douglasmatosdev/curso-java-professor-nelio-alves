import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
    public static void run() {
        System.out.println("Exercise04");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

       int codigo_funcionario;
       double horas_trabalhadas, valor_hora, salario;

       codigo_funcionario = scanner.nextInt();
       horas_trabalhadas = scanner.nextDouble();
       valor_hora = scanner.nextDouble();

       salario = horas_trabalhadas * valor_hora;

        System.out.printf("NUMBER = %d%n", codigo_funcionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        scanner.close();
    }
}
