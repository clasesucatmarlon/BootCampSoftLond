package CurrencyConverter;

public class App {
    public static void main(String[] args) {
        CurrencyConverter typeOfCurrency = new CurrencyConverter(0.00025, 4051.74);

        // Pesos COP to Dollar
        double quantityPesosCOP = 400000;
        System.out.println(quantityPesosCOP + " PesosCOP = " + typeOfCurrency.convertPesosCOPToDollar(quantityPesosCOP) + " Dollars");

        // Dollar to PesosCOP
        double quantityDollars = 100;
        System.out.println(quantityDollars + " Dollars = " + typeOfCurrency.convertDollarToPesos(quantityDollars) + " PesosCOP");
    }
}
