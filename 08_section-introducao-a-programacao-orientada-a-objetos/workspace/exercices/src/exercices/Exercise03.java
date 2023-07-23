package exercices;

import entities.Rectangle;
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
    public static void run() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercise03");

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle.toString());

        sc.close();
    }
}
