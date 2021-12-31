package secao_10.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao_10.entities.Employee;

public class ExProgramEmployeeUsingStream {
	public static void run() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<Employee>();

		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();

		System.out.println();
		for (int i = 0; i < n; i++) {

			System.out.println("Employee #" + (i + 1) + ": ");

			System.out.print("Id: ");
			Integer id = sc.nextInt();

			// Avoiding repeated id
			while (hasId(employees, id)) {
				System.out.print("\nId already taken! Try again:\nId: ");
				id = sc.nextInt();
			}

			sc.nextLine(); // Clean empty line

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);
			employees.add(employee);

			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		Employee employee = employees.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.println("This id does not exist!");
			System.out.println();
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			System.out.println();

			employee.salaryIncrease(percent);
		}

		System.out.println("List of employees:");

		for (Employee obj : employees) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee> list, Integer id) {
		Employee employee = list.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
		return employee != null;
	}
}
