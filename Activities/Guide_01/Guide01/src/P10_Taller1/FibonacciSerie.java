package P10_Taller1;

import javax.swing.*;

/*
    Crea un programa que muestre los primeros 20 números de la
    serie Fibonacci. La serie Fibonacci se forma sumando los dos números
    anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, ….
*/
public class FibonacciSerie {
    public static void main(String[] args) {
        int valueCurrent = 0;
        int valueNext = 1;
        String msg = "";
        int fibonacci;
        msg += valueCurrent + ", ";
        msg += valueNext + ", ";

        int numbers = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers you want to generate: ", "FIBONACCI SERIE ", JOptionPane.INFORMATION_MESSAGE));

        for (int i = 2; i < numbers; i++) {
            fibonacci = valueCurrent + valueNext;
            msg += fibonacci + ", ";

            valueCurrent = valueNext;
            valueNext = fibonacci;
        }
        JOptionPane.showMessageDialog(null, ("The first " + numbers + " elements of fibonacci serie are: \n" + msg), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }
}
