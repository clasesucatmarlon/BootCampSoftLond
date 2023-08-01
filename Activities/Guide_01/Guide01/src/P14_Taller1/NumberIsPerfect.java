package P14_Taller1;

import javax.swing.*;

/*
    Escribe un programa que solicite al usuario un número entero positivo y
    verifique si es un número perfecto. Un número perfecto es aquel cuya suma
    de sus divisores propios (excluyendo al propio número) es igual al número.
*/
public class NumberIsPerfect {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: ", "PERFECT NUMBER  ", JOptionPane.INFORMATION_MESSAGE));
        int acum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                acum = acum + i;
            }
        }
        if (acum == number) {
            JOptionPane.showMessageDialog(null, ("The number " + number + " is Perfect"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, ("The number " + number + " not is Perfect"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
