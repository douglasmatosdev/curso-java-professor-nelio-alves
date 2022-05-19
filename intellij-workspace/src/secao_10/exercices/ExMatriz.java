package secao_10.exercices;

import java.util.Scanner;

public class ExMatriz {

	public static void run() {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] matriz = new int[x][y];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}

		}
		System.out.println();

		int s = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (s == matriz[i][j]) {
					positions(i, j, matriz);
				}
			}

			System.out.println();
		}

		sc.close();
	}

	public static void positions(int x, int y, int mat[][]) {

		System.out.printf("Position %d,%d:%n", x, y);
		if (y - 1 >= 0) {
			System.out.printf("Left: %d%n", mat[x][y - 1]);
		}
		if (y + 1 <= mat.length) {
			System.out.printf("Right: %d%n", mat[x][y + 1]);
		}
		if (x - 1 >= 0) {
			System.out.printf("Up: %d%n", mat[x - 1][y]);
		}
		if (x + 1 <= mat.length) {
			System.out.printf("Down: %d%n", mat[x + 1][y]);
		}
	}
}
