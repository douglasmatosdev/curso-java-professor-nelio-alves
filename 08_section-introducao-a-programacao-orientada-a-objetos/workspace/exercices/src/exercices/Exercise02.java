package exercices;

import entities.Employee;
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
    public static void run() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercise02");

        Student student = new Student();
        student.name = sc.nextLine();
        student.note1 = sc.nextDouble();
        student.note2 = sc.nextDouble();
        student.note3 = sc.nextDouble();

        System.out.println(student.message());

        sc.close();
    }
}
