package P03_Taller1;

import javax.swing.*;
import java.text.DecimalFormat;

/*
    Crea un programa que calcule y muestre el área y el perímetro de un círculo.
    El usuario debe proporcionar el radio del círculo.
*/
public class AreaAndPerimeterCircle {
    public static void main(String[] args) {
        float radiusCircle = Float.parseFloat(JOptionPane.showInputDialog(null, "Input radius of circle:", "DETERMINE AREA AND PERIMETER OF A CIRCLE ", JOptionPane.INFORMATION_MESSAGE));

        float areaCircle = (float) (Math.PI * Math.pow(radiusCircle, 2));
        float perimeterCircle = (float) (2 * Math.PI * radiusCircle);

        DecimalFormat formatTemplete = new DecimalFormat("#.##");

        String msg = "Area: " + formatTemplete.format(areaCircle) + "\n" +
                     "Perimeter: " + formatTemplete.format(perimeterCircle);

        JOptionPane.showMessageDialog(null, msg, "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }
}
