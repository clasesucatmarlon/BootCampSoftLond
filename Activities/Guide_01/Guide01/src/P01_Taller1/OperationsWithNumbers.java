package P01_Taller1;

import javax.swing.*;
import java.text.DecimalFormat;

public class OperationsWithNumbers {
    public static void main(String[] args) {
        Integer number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Number 1:", "OPERATIONS WITH NUMBERS ", JOptionPane.INFORMATION_MESSAGE));
        Integer number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Number 2:", "OPERATIONS WITH NUMBERS ", JOptionPane.INFORMATION_MESSAGE));

        DecimalFormat formatTemplete = new DecimalFormat("#.##");

        int add = number1 + number2;
        int rest = number1 - number2;
        int product = number1 * number2;
        float cocient = (number1 / number2);

        String msg =
                "  1) Add: " + (add) + "\n" +
                "  2) Rest: " + (rest) + "\n" +
                "  3) Product: " + (product) + "\n" +
                "  4) Cocient: " + (formatTemplete.format(cocient)) + "\n";

        JOptionPane.showMessageDialog(null, msg, "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }
}
