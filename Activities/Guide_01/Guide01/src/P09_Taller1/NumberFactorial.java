package P09_Taller1;

/*
    Escribe un programa que solicite al usuario un número entero positivo y
    calcule su factorial.
*/

import javax.swing.*;

public class NumberFactorial {
    public static void main(String[] args) {
        int factorial = 1;
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: ", "NUMBER FACTORIAL ", JOptionPane.INFORMATION_MESSAGE));

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, ("The factorial of " + number + " is " + factorial), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }
}
