import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
    public static void run() {
        System.out.println("Exercise02");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double area, raio;

        raio = scanner.nextDouble();
        area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n",area);

        scanner.close();
    }
}
