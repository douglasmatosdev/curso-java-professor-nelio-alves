import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
    public static void run() {
        System.out.println("Exercise06");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        // (a área do triângulo retângulo que tem A por base e C por altura. )
        double area_triangulo_retangulo = a * c / 2; // base * altura / 2

        // a área do círculo de raio C. (pi = 3.14159)
        double area_circulo = 3.14159 * Math.pow(c, 2); // a = pi * r²

        // a área do trapézio que tem A e B por bases e C por altura.
        double area_trapezio = ((a + b) / 2) * c;// a = ((a+b)/2)* altura

        //a área do quadrado que tem lado B.
        double area_quadrado = b * b;

        //a área do retângulo que tem lados A e B.
        double area_retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", area_triangulo_retangulo);
        System.out.printf("CIRCULO: %.3f%n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
        System.out.printf("QUADRADO: %.3f%n", area_quadrado);
        System.out.printf("RETANGULO: %.3f%n", area_retangulo);

        scanner.close();
    }
}
