package secao_05.diadasemana;

import java.util.Scanner;

public class ProgramDiaDaSemanaIfElse {

	public static void run() {
		Scanner sc = new Scanner(System.in);

		int dayNumber = sc.nextInt();
		String day;

		if (dayNumber == 1) {
			day = "domingo";
		} else if (dayNumber == 2) {
			day = "segunda";
		} else if (dayNumber == 3) {
			day = "terça";
		} else if (dayNumber == 4) {
			day = "quarta";
		} else if (dayNumber == 5) {
			day = "quinta";
		} else if (dayNumber == 6) {
			day = "sexta";
		} else if (dayNumber == 7) {
			day = "sábado";
		} else {
			day = "valor inválido";
		}

		System.out.printf("Dia da semana:%s%n", day);
		sc.close();
	}
}
