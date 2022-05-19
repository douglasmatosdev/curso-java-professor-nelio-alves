package secao_04.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author douglas
 *
 *	Fazerum programa que leia o número de um funcionário,
 *	seu número de horas trabalhadas, o valor que recebe por 
 *	hora e calcula o salário desse funcionário.
 *	A seguir, mostre o número e o salário do funcionário,
 *	com duas casas decimais.
 *
 */

public class ExSalary {
	
	public static void run() {
		
		Locale.setDefault(Locale.US);
		
		int number, hours;
		double salary, valuePerHour;
		
		Scanner sc = new Scanner(System.in);
		
		number = sc.nextInt();
		hours = sc.nextInt();
		valuePerHour = sc.nextDouble();
		
		salary = valuePerHour * hours;
		
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}
}
