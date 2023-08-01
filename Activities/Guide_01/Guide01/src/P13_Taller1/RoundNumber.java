package P13_Taller1;

/*
    Pide al usuario un número decimal y muestra su valor redondeado a un
    número específico de decimales.
*/

import javax.swing.*;

public class RoundNumber {
    public static void main(String[] args) {
        float numberToRound = Float.parseFloat(JOptionPane.showInputDialog(null, "Input a number to round: ", "ROUND NUMBER  ", JOptionPane.INFORMATION_MESSAGE));
        int numberDecimals = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number of positions decimals: ", "ROUND NUMBER  ", JOptionPane.INFORMATION_MESSAGE));

        double partInteger;
        double result;
        result = numberToRound;
        partInteger = Math.floor(result);
        result = (result -partInteger) * Math.pow(10, numberDecimals);
        result = Math.round(result);
        result = (result / Math.pow(10, numberDecimals)) + partInteger;
        JOptionPane.showMessageDialog(null, ("The number round with " + numberDecimals + " positions decimals is: " + result), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }
}
