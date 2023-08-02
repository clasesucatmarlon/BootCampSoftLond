package P15_Taller1;

/*
    Crea un programa que pida al usuario un número entero y determine si es un
    número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
    derecha que de derecha a izquierda.
*/

import javax.swing.*;

public class Capicua {
    public static void main(String[] args) {
        int rest;
        int invert = 0;
        int copyNumber;

        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: ", "CAPICUA NUMBER  ", JOptionPane.INFORMATION_MESSAGE));
        copyNumber = number;

        while(number != 0) {
            rest = number % 10;
            invert = (invert * 10) + rest;
            number = number / 10;
        }

        System.out.print("\nel numero invertido es: " + invert);
        if (invert == copyNumber)
            JOptionPane.showMessageDialog(null, ("The number " + copyNumber + " is Capicua"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, ("The number " + copyNumber + " not is Capicua"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }
}
