package secao_10;

import java.util.Scanner;

public class ProgramMatriz {

	public static void run() {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matriz = new int[n][n];

		storage(matriz, n, sc);

		int count = 0;
		System.out.println("\nComplete Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0)
					count++;
				System.out.print(matriz[i][j] + "  ");
			}

			System.out.println();
		}

		System.out.println("\nMain diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		System.out.println("\n\nNegative numbers = " + count);
		sc.close();

	}

	public static void storage(int[][] mat, int sizeXY, Scanner sc) {
		for (int i = 0; i < sizeXY; i++) {
			for (int j = 0; j < sizeXY; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
	}
}
