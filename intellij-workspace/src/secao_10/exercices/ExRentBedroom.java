package secao_10.exercices;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author douglas
 *
 *         A dona de um pensionato possui dez quartos para alugar para
 *         estudantes, sendo esses quartos identificados pelos números 0 a 9.
 * 
 *         Fazer um programa que inicie com todos os dez quartos vazios, e
 *         depois leia uma quantida de N representando o número de estudantes
 *         que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o
 *         aluguel dos N estudantes. Para cada registro de aluguel, informar o
 *         nome e email do estudante, bem como qual dos quartos ele escolheu(de
 *         0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu
 *         programa deve imprimir um relatório de todas ocupações do pensionato,
 *         por ordem de quarto, conforme exemplo.
 */

public class ExRentBedroom {

	public static void run() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ExRent[] bedRooms = new ExRent[10];

		System.out.print("How many rooms will be rented? ");		
		int n = sc.nextInt();
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Rent #%d%n", i);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.next();

			System.out.print("Room: ");
			int room = sc.nextInt();

			bedRooms[room] = new ExRent(name, email, room);

			System.out.println();
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < bedRooms.length; i++) {
			if (bedRooms[i] != null) {
				System.out.printf("%d: %s, %s%n", bedRooms[i].getRoom(), bedRooms[i].getName(), bedRooms[i].getEmail());
			}
		}

		sc.close();
	}
}
