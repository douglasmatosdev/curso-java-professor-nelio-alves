package secao_03.student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {

	public static void run() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		
		student.notes[0] = sc.nextDouble();
		student.notes[1] = sc.nextDouble();
		student.notes[2] = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalNote());
		student.checkStatus(student.finalNote());
		
		sc.close();
	}
}
