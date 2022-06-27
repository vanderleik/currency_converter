package utils;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convert(double amount, double dollarsBought) {
        return amount * (dollarsBought * (1 + IOF));
    }
}
