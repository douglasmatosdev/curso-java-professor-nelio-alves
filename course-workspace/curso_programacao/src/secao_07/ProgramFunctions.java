package secao_07;

import java.util.Scanner;

public class ProgramFunctions {

	public static void run() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int temp;
		if (x > y && x > z) {
			temp = x;
		} else if (y > z) {
			temp = y;
		} else {
			temp = z;
		}

		return temp;
	}

	public static void showResult(int value) {
		System.out.printf("Higher = %d%n",value);
	}
}
