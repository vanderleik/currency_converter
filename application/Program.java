package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarsBought = sc.nextDouble();

        double reais = CurrencyConverter.convert(dolarPrice, dollarsBought);

        System.out.printf("Amount to be paid in reais = R$ %.2f", reais);
        sc.close();
    }
}
