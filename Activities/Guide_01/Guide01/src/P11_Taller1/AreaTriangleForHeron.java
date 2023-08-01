package P11_Taller1;

/*
    Escribe un programa que calcule el área de un triángulo utilizando la fórmula
    de Herón (ver carpeta imagen). El usuario debe ingresar las longitudes de los tres lados.
*/

import javax.swing.*;

public class AreaTriangleForHeron {
    public static void main(String[] args) {
        int sideA = Integer.parseInt(JOptionPane.showInputDialog(null, "Input side A: ", "AREA TRIANGLE USING HERON  ", JOptionPane.INFORMATION_MESSAGE));
        int sideB = Integer.parseInt(JOptionPane.showInputDialog(null, "Input side B: ", "AREA TRIANGLE USING HERON  ", JOptionPane.INFORMATION_MESSAGE));
        int sideC = Integer.parseInt(JOptionPane.showInputDialog(null, "Input side C: ", "AREA TRIANGLE USING HERON  ", JOptionPane.INFORMATION_MESSAGE));

        float semiPerimeter = (sideA + sideB + sideC) / 2;
        float radicando =  (semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        float areaTriangle = (float) Math.sqrt( radicando );
        String msg = "The area of triangle of sides: A = " + sideA + ", B = " + sideB + " C = " + sideC + " is ";
        JOptionPane.showMessageDialog(null, (msg + areaTriangle), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);

    }
}
