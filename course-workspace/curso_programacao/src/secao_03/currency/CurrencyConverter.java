package secao_03.currency;

public class CurrencyConverter {

	private static final double IOF = 6;

	public static double dollarPrice;
	public static double dollarToBuy;

	public static double howMany() {

		double dollarToReal = dollarPrice * dollarToBuy;
		
		double amoutToPayWithIOF = (dollarToReal * IOF) / 100;
		
		return amoutToPayWithIOF + dollarToReal;
	}
}
