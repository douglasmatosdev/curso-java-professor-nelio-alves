package secao_10.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao_10.entities.Employee;

/**
 * 
 * @author douglas
 *
 *         Fazer um programa para ler um número inteiro N e depois os dados (id,
 *         nome e salario) de N funcionários. Não deve haver repetição de id.
 *
 *         Em seguida, efetuar o aumento de X porcento no salário de um
 *         determinado funcionário. Para isso, o programa deve ler um id e o
 *         valor X. Se o id informado não existir, mostrar uma mensagem e
 *         abortar a operação. Ao final, mostrar a listagem atualizada dos
 *         funcionários, conforme exemplos.
 *
 *         Lembre-se de aplicar a técnica de encapsulamento para não permitir
 *         que o salário possa ser mudado livremente. Um salário só pode ser
 *         aumentado com base em uma operação de aumento por porcentagem dada.
 *
 */

public class ExProgramEmployee {

	public static void run() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();

		List<Employee> employees = new ArrayList<Employee>();

		System.out.println();
		for (int i = 0; i < n; i++) {

			System.out.println("Employee #" + (i + 1) + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employees.add(new Employee(id, name, salary));

			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();

		Integer pos = position(employees, id);

		if (pos == null) {
			System.out.println("This id does not exist!");
			System.out.println();
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			System.out.println();

			employees.get(pos).salaryIncrease(percent);
		}

		System.out.println("List of employees:");

		for (Employee obj : employees) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
