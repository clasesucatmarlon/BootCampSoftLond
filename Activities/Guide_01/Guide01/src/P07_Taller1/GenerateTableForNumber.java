package P07_Taller1;

/*
    Crea un programa que pida al usuario un número entero positivo y muestre
    su tabla de multiplicar hasta el 10.
*/

import javax.swing.*;

public class GenerateTableForNumber {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number positive: ", "GENERATE TABLE FOR A NUMBER ", JOptionPane.INFORMATION_MESSAGE));

        if (number < 0) {
            JOptionPane.showMessageDialog(null, ("The number " + number + " not is positive. \n You must enter a number greater than zero"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String msg = "";
        for (int i = 1; i <= 10; i++) {
            msg += (number + " * " + i + " = " + (number * i) + "\n");
        }
        JOptionPane.showMessageDialog(null, msg, "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }
}
