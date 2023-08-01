package P06_Taller1;

import javax.swing.*;

/*
    Escribe un programa que pida al usuario un número y verifique si es positivo,
    negativo o cero.
*/
public class ValidateNumber {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number: ", "VALIDATE NUMBER ", JOptionPane.INFORMATION_MESSAGE));

        if (number > 0) {
            JOptionPane.showMessageDialog(null, ("The number " + number + " is positive"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else if (number < 0) {
            JOptionPane.showMessageDialog(null, ("The number " + number + " is negative"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, ("The number " + number + " is zero"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
