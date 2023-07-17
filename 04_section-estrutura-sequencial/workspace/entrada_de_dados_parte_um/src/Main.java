import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        char c;
        String a;
        int y;
        String r;
        int s;
        double t;

        System.out.print("Digite na mesma linha um texto, um número inteiro e um número double: ");
        r = sc.next();
        s = sc.nextInt();
        t = sc.nextDouble();

        System.out.print("Digite uma letra: ");
        c = sc.next().charAt(0);

        System.out.print("Digite um número (double): ");
        x = sc.nextDouble();

        System.out.print("Digite um texto: ");
        a = sc.next();

        System.out.print("Digite um número inteiro: ");
        y = sc.nextInt();

        System.out.println();

        System.out.println("Os primeiros dados digitados foram: ");
        System.out.println("O texto: " + r);
        System.out.println("O número inteiro: " + s);
        System.out.println("O número double: " + t);
        System.out.printf("A letra digitada foi: %s%n", c);
        System.out.printf("Você digitou: %.2f%n", x);
        System.out.println("O texto digitado foi: " + a);
        System.out.println("O número inteiro digitado foi: " + y);

        sc.close();
    }
}