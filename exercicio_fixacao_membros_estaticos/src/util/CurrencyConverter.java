package util;

public class CurrencyConverter {

	public static double dollarAmount(double dollarPrice, double dollarBought) {
		return (dollarPrice * dollarBought) * 1.06;
	}
}
