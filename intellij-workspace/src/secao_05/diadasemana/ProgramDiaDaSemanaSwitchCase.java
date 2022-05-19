package secao_05.diadasemana;

import java.util.Scanner;

public class ProgramDiaDaSemanaSwitchCase {

	public static void run() {
		Scanner sc = new Scanner(System.in);

		int dayNumber = sc.nextInt();
		String day;

		switch (dayNumber) {

		case 1:
			day = "domingo";
			break;
		case 2:
			day = "segunda";
			break;
		case 3:
			day = "terça";
			break;
		case 4:
			day = "quarta";
			break;
		case 5:
			day = "quinta";
			break;
		case 6:
			day = "sexta";
			break;
		case 7:
			day = "sábado";
			break;
		default:
			day = "valor inválido";
		}

		System.out.printf("Dia da semana:%s%n", day);
		sc.close();
	}
}
