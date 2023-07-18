import java.util.Scanner;

public class Exercise3 {
    public static void run() {
        System.out.println("Exercise3");
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Não sao Multiplos");
        }

        sc.close();
    }
}
