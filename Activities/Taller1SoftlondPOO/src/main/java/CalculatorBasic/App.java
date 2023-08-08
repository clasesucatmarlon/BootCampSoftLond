package CalculatorBasic;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        boolean showMenu = true;
        double val1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input value 1: ", "OPERATIONS ", JOptionPane.INFORMATION_MESSAGE));
        double val2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input value 2: ", "OPERATIONS ", JOptionPane.INFORMATION_MESSAGE));
        CalculatorBasic calculate = new CalculatorBasic(val1, val2);


        do {
            String msgMenu = "Seleccione opción: \n" +
                    "1) Suma. \n" +
                    "2) Resta. \n" +
                    "3) Producto. \n" +
                    "4) división. \n" +
                    "0) Salir. \n";
            Integer option = Integer.parseInt(JOptionPane.showInputDialog(null, msgMenu, "MENU ", JOptionPane.INFORMATION_MESSAGE));
            switch (option) {
                case 1:
                    JOptionPane.showMessageDialog(null, ("Result of add:  " + val1 + " + " + val2 + " = " + calculate.addValues()), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, ("Result of rest:  " + val1 + " - " + val2 + " = " + calculate.restValues()), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, ("Result of product:  " + val1 + " * " + val2 + " = " + calculate.productValues()), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    try {
                        JOptionPane.showMessageDialog(null, ("Result of product:  " + val1 + " / " + val2 + " = " + calculate.CocientValues()), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, ("Error!!!:  " + e.getMessage()), "ERROR ", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 0:
                    showMenu = false;
                    break;
            }
        } while (showMenu);
    }
}
