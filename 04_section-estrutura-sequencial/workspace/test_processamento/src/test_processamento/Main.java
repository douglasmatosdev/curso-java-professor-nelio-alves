package test_processamento;

public class Main {

	public static void main(String[] args) {
		int x;
		double y;

		x = 5;
		y = 2 * x;

		System.out.println(x);
		System.out.println(y);

		// Área de um trapézio
		double b, B, h, area;
		b = 6.0; // or 6f
		B = 8.0; // or 8f
		h = 5.0; // or 5f

		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		int a2, b2;
		double resultado;
		a2 = 5;
		b2 = 2;
		resultado = a2 / b2; // 2.0
		System.out.println(resultado);
		resultado = (double) a2 / b2; // 2.5
		System.out.println(resultado);
		
		double a3;
		int b3;
		
		a3 = 5.0;
		b3 = (int) a3;
		
		System.out.println(b3);

	}

}
