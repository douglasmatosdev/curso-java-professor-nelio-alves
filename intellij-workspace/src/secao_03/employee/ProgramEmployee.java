package secao_03.employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
	
	public static void run() {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
		
		System.out.println("Which percentage to encrease salary?");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.printf("Updated data: %s, $ %.2f%n", employee.name, employee.netSalary());
		
		sc.close();
	}
}
