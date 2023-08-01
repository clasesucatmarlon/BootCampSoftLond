package P04_Taller1;

import javax.swing.*;

/*
    Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
    o menor de edad.
*/
public class ValidateAge {
    public static void main(String[] args) {
        int agePerson = Integer.parseInt(JOptionPane.showInputDialog(null, "Input age:", "VALIDATE AGE OF A PERSON ", JOptionPane.INFORMATION_MESSAGE));

        if (agePerson >= 18) {
            JOptionPane.showMessageDialog(null, "The person is of legal age.", "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The person is under age.", "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
