package CalculatorBasic;

public class CalculatorBasic {
    private double value1;
    private double value2;

    public CalculatorBasic(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double addValues () {
        return this.value1 + this.value2;
    }

    public double restValues () {
        return this.value1 - this.value2;
    }

    public double productValues () {
        return this.value1 * this.value2;
    }

    public double CocientValues () {
        if (this.value2 != 0) {
            return this.value1 / this.value2;
        } else {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
    }
}
