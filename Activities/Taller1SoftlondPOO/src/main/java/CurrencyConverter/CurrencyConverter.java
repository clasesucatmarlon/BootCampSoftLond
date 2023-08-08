package CurrencyConverter;

public class CurrencyConverter {

    private double typeChangePesosCOPToDollar;
    private double typeChangeDollarToPesosCOP;

    public CurrencyConverter(double typeChangePesosCOPToDollar, double typeChangeDollarToPesosCOP) {
        this.typeChangePesosCOPToDollar = typeChangePesosCOPToDollar;
        this.typeChangeDollarToPesosCOP = typeChangeDollarToPesosCOP;
    }

    public double convertPesosCOPToDollar(double quantityPesosCOP) {
        return quantityPesosCOP * typeChangePesosCOPToDollar;
    }

    public double convertDollarToPesos(double quantityDollar) {
        return quantityDollar / typeChangePesosCOPToDollar;
    }
}
