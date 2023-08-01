package P12_Taller1;

/*
    Realiza un programa que pida al usuario un número entero y determine si es
    un número primo o no
*/

import javax.swing.*;

public class NumberIsPrime {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: ", "NUMBER PRIME  ", JOptionPane.INFORMATION_MESSAGE));

        int count = 0;
        String msg = "The number " + number;

        for (int i = 1; i <= number; i++)
        {
            if((number % i) == 0)
            {
                count++;
            }
        }

        if (count <= 2) {
            JOptionPane.showMessageDialog(null, (msg + " is prime" ), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, (msg + " not is prime" ), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
