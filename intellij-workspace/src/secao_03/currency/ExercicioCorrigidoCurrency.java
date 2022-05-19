package secao_03.currency;

public class ExercicioCorrigidoCurrency {

	private static final double IOF = 0.06;

	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}
}
