package P08_Taller1;

/*
    Realiza un programa que simule un juego de adivinar un número. El
    programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
    adivinarlo. El programa debe indicar si el número ingresado es mayor o
    menor que el número a adivinar.
*/

import javax.swing.*;

public class GuessNumber {
    public static void main(String[] args) {
        int maxNumber = 100;
        int minNumber = 1;
        int numberRandom = (int) (Math.random() * (maxNumber - minNumber +1 ) + 1);
        int number;
        int countAttempts = 1;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Attempts: " + countAttempts + "\nInput number for guess: ", "GUESS A NUMBER ", JOptionPane.INFORMATION_MESSAGE));
            if (number > numberRandom) {
                JOptionPane.showMessageDialog(null, ("The number " + number + " is greater than the random number"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
            } else if (number < numberRandom) {
                JOptionPane.showMessageDialog(null, ("The number " + number + " is less than the random number"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, ("CONGRATULATIOS!!!!.  you guessed the number in " + countAttempts + " attempts"), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
            }
            countAttempts++;
        } while (numberRandom != number);
    }
}
