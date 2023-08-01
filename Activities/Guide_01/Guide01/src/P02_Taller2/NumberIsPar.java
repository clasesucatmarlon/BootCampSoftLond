package P02_Taller2;

import javax.swing.*;

public class NumberIsPar {
    public static void main(String[] args) {
        Integer number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number:", "DETERMINE IF A NUMBER IS PAR OR NOT ", JOptionPane.INFORMATION_MESSAGE));

        String msg = "The number " + number;
        if (number % 2 == 0) {
             JOptionPane.showMessageDialog(null, (msg + " is PAIR."), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, (msg + " not is PAIR."), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
