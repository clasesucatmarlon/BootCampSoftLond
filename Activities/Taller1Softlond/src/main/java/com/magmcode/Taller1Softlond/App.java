package com.magmcode.Taller1Softlond;

import com.magmcode.Taller1Softlond.Utilities.OperationsWithNumbers;

import javax.swing.*;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        boolean showMenu = true;
        do {
            String msgMenu = "Figura a crear: \n" +
                    "  1) Operaciones matemáticas. \n" +
                    "  2) Número es par?. \n" +
                    "  3) Área y perímetro de círculo. \n" +
                    "  4) Es mayor de edad?. \n" +
                    "  5) Número mayor. \n" +
                    "  6) Validar número. \n" +
                    "  7) Generar tabla hasta el 10 de un número. \n" +
                    "  8) Adivinar número entre 1 y 100. \n" +
                    "  0) Salir. \n";
            Integer option = Integer.parseInt(JOptionPane.showInputDialog(null, msgMenu, "MENU ", JOptionPane.INFORMATION_MESSAGE));
            switch (option) {
                case 1:
                    operations();
                    break;
                case 2:
                    isPar();
                    break;
                case 3:
                    areaAndPerimeterCircle();
                    break;
                case 4:
                    isMajor();
                    break;
                case 5:
                    numberMajor();
                    break;
                case 6:
                    int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number: ", "VALIDATE NUMBER ", JOptionPane.INFORMATION_MESSAGE));
                    JOptionPane.showMessageDialog(null, ("The number " + number + " is: " + OperationsWithNumbers.ValidateNumber(number)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 7:
                    generateTable();
                    break;
                case 8:
                    guessNumber();
                    break;
                case 0:
                    showMenu = false;
                    break;
            }
        } while (showMenu);
    }

    private static void guessNumber() {
        int number;
        int countAttempts = 1;
        int numberRandom = OperationsWithNumbers.generateNumberRandomBetweenTwoValues(21, 100);
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

    private static void generateTable() {
        int numberInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number positive: ", "GENERATE TABLE FOR A NUMBER ", JOptionPane.INFORMATION_MESSAGE));
        OperationsWithNumbers.GenerateTableForNumber(numberInput);
    }

    private static void numberMajor() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number 1:", "DETERMINE LARGEST NUMBER ", JOptionPane.INFORMATION_MESSAGE));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number 2:", "DETERMINE LARGEST NUMBER ", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, ("The number major between " + number1 + " and " + number2 + " is:  " + OperationsWithNumbers.DetermineLargestNumber(number1, number2)), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void isMajor() {
        int agePerson = Integer.parseInt(JOptionPane.showInputDialog(null, "Input age:", "VALIDATE AGE OF A PERSON ", JOptionPane.INFORMATION_MESSAGE));
        boolean personIsMajor = OperationsWithNumbers.ValidateAge(agePerson);
        if (personIsMajor) {
            JOptionPane.showMessageDialog(null, "The person is of legal age.", "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The person is under age.", "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void areaAndPerimeterCircle() {
        float radiusCircle = Float.parseFloat(JOptionPane.showInputDialog(null, "Input radius of circle:", "DETERMINE AREA AND PERIMETER OF A CIRCLE ", JOptionPane.INFORMATION_MESSAGE));
        float area = OperationsWithNumbers.AreaCircle(radiusCircle);
        float perimeter = OperationsWithNumbers.PerimeterCircle(radiusCircle);
        DecimalFormat formatTemplete = new DecimalFormat("#.##");
        String msg = "Area: " + formatTemplete.format(area) + "\n" +
                "Perimeter: " + formatTemplete.format(perimeter);
        JOptionPane.showMessageDialog(null, msg, "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void isPar() {
        Integer number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number:", "DETERMINE IF A NUMBER IS PAR OR NOT ", JOptionPane.INFORMATION_MESSAGE));
        Boolean response = OperationsWithNumbers.isParNumber(number);
        String msg = "The number " + number;
        if (response) {
            JOptionPane.showMessageDialog(null, (msg + " is PAIR."), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, (msg + " not is PAIR."), "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void operations() {
        Integer number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Number 1:", "OPERATIONS WITH NUMBERS ", JOptionPane.INFORMATION_MESSAGE));
        Integer number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Number 2:", "OPERATIONS WITH NUMBERS ", JOptionPane.INFORMATION_MESSAGE));

        DecimalFormat formatTemplete = new DecimalFormat("#.##");
        String msg =
                "  1) Add: " + (OperationsWithNumbers.add(number1, number2)) + "\n" +
                "  2) Rest: " + (OperationsWithNumbers.rest(number1, number2)) + "\n" +
                "  3) Product: " + (OperationsWithNumbers.product(number1, number2)) + "\n" +
                "  4) Cocient: " + (formatTemplete.format(OperationsWithNumbers.cocient(number1, number2))) + "\n";
        JOptionPane.showMessageDialog(null, msg, "RESULTS ", JOptionPane.INFORMATION_MESSAGE);
    }
}
