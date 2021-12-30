package secao_07;

import java.util.Scanner;

public class ProgramBitwise {

	public static void run() {

		Scanner sc = new Scanner(System.in);
		int mask = 0b00100000; // 32
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		sc.close();
	}
}
