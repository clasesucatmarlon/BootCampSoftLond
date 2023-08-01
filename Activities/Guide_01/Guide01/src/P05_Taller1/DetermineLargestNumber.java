package P05_Taller1;

import javax.swing.*;

/*
    Realiza un programa que solicite al usuario dos números enteros y determine
    cuál es el mayor de ellos.
*/
public class DetermineLargestNumber {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number 1:", "DETERMINE LARGEST NUMBER ", JOptionPane.INFORMATION_MESSAGE));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number 2:", "DETERMINE LARGEST NUMBER ", JOptionPane.INFORMATION_MESSAGE));

        if (number1 > number2) {
            JOptionPane.showMessageDialog(null, ("The number1: " + number1 + " is largest that number2: " + number2), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else if (number2 > number1) {
            JOptionPane.showMessageDialog(null, ("The number2: " + number2 + " is largest that number1: " + number1), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, ("The number1: " + number1 + " is equal that number2: " + number2), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
